/**
 *    Copyright ${license.git.copyrightYears} the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.jpetstore.web.actions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpSession;

import org.mybatis.jpetstore.wrapper.IAccount;
import org.mybatis.jpetstore.wrapper.IAccountImpl;
import org.mybatis.jpetstore.wrapper.IAccountService;
import org.mybatis.jpetstore.wrapper.IAccountServiceImpl;
import org.mybatis.jpetstore.wrapper.ICatalogService;
import org.mybatis.jpetstore.wrapper.ICatalogServiceImpl;
import org.mybatis.jpetstore.wrapper.IProduct;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.integration.spring.SpringBean;
import net.sourceforge.stripes.validation.Validate;

/**
 * The Class AccountActionBean.
 *
 * @author Eduardo Macarron
 */
@SessionScope
public class AccountActionBean extends AbstractActionBean {
  private static final long serialVersionUID = 5499663666155758178L;

  private static final String NEW_ACCOUNT = "/WEB-INF/jsp/account/NewAccountForm.jsp";

  private static final String EDIT_ACCOUNT = "/WEB-INF/jsp/account/EditAccountForm.jsp";

  private static final String SIGNON = "/WEB-INF/jsp/account/SignonForm.jsp";

  private static final List<String> LANGUAGE_LIST;

  private static final List<String> CATEGORY_LIST;

  // @SpringBean
  private IAccountService accountService = new IAccountServiceImpl();

  // @SpringBean
  private ICatalogService catalogService = new ICatalogServiceImpl();

  private IAccount account = new IAccountImpl();

  private List<IProduct> myList;

  private boolean authenticated;

  static {
    LANGUAGE_LIST = Collections.unmodifiableList(Arrays.asList("english", "japanese"));
    CATEGORY_LIST = Collections.unmodifiableList(Arrays.asList("FISH", "DOGS", "REPTILES", "CATS", "BIRDS"));
  }

  public IAccount getAccount() {
    return this.account;
  }

  public String getUsername() {
    return account.getUsername();
  }

  @Validate(required = true, on = { "signon", "newAccount", "editAccount" })
  public void setUsername(String username) {
    account.setUsername(username);
  }

  public String getPassword() {
    return account.getPassword();
  }

  @Validate(required = true, on = { "signon", "newAccount", "editAccount" })
  public void setPassword(String password) {
    account.setPassword(password);
  }

  public List<IProduct> getMyList() {
    return myList;
  }

  public void setMyList(List<IProduct> myList) {
    this.myList = myList;
  }

  public List<String> getLanguages() {
    return AccountActionBean.LANGUAGE_LIST;
  }

  public List<String> getCategories() {
    return AccountActionBean.CATEGORY_LIST;
  }

  public Resolution newAccountForm() {
    return new ForwardResolution(AccountActionBean.NEW_ACCOUNT);
  }

  /**
   * New account.
   *
   * @return the resolution
   */
  public Resolution newAccount() {
    accountService.insertAccount(account);
    account = accountService.getAccount(account.getUsername());
    myList = catalogService.getProductListByCategory(account.getFavouriteCategoryId());
    authenticated = true;
    return new RedirectResolution(CatalogActionBean.class);
  }

  /**
   * Edits the account form.
   *
   * @return the resolution
   */
  public Resolution editAccountForm() {
    return new ForwardResolution(AccountActionBean.EDIT_ACCOUNT);
  }

  /**
   * Edits the account.
   *
   * @return the resolution
   */
  public Resolution editAccount() {
    accountService.updateAccount(account);
    account = accountService.getAccount(account.getUsername());
    myList = catalogService.getProductListByCategory(account.getFavouriteCategoryId());
    return new RedirectResolution(CatalogActionBean.class);
  }

  /**
   * Signon form.
   *
   * @return the resolution
   */
  @DefaultHandler
  public Resolution signonForm() {
    return new ForwardResolution(AccountActionBean.SIGNON);
  }

  /**
   * Signon.
   *
   * @return the resolution
   */
  public Resolution signon() {
    account = accountService.getAccount(getUsername(), getPassword());
    if ((account) == null) {
      String value = "Invalid username or password.  Signon failed.";
      setMessage(value);
      clear();
      return new ForwardResolution(AccountActionBean.SIGNON);
    } else {
      account.setPassword(null);
      myList = catalogService.getProductListByCategory(account.getFavouriteCategoryId());
      authenticated = true;
      HttpSession s = context.getRequest().getSession();
      // this bean is already registered as /actions/Account.action
      s.setAttribute("accountBean", this);
      return new RedirectResolution(CatalogActionBean.class);
    }
  }

  /**
   * Signoff.
   *
   * @return the resolution
   */
  public Resolution signoff() {
    context.getRequest().getSession().invalidate();
    clear();
    return new RedirectResolution(CatalogActionBean.class);
  }

  /**
   * Checks if is authenticated.
   *
   * @return true, if is authenticated
   */
  public boolean isAuthenticated() {
    return ((authenticated) && ((account) != null)) && ((account.getUsername()) != null);
  }

  /**
   * Clear.
   */
  public void clear() {
    account = new IAccountImpl();
    myList = null;
    authenticated = false;
  }
}
