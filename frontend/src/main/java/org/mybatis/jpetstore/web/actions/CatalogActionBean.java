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

import java.util.List;

import org.mybatis.jpetstore.wrapper.ICatalogService;
import org.mybatis.jpetstore.wrapper.ICatalogServiceImpl;
import org.mybatis.jpetstore.wrapper.ICategory;
import org.mybatis.jpetstore.wrapper.IItem;
import org.mybatis.jpetstore.wrapper.IProduct;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.integration.spring.SpringBean;

/**
 * The Class CatalogActionBean.
 *
 * @author Eduardo Macarron
 */
@SessionScope
public class CatalogActionBean extends AbstractActionBean {
  private static final long serialVersionUID = 5849523372175050635L;

  private static final String MAIN = "/WEB-INF/jsp/catalog/Main.jsp";

  private static final String VIEW_CATEGORY = "/WEB-INF/jsp/catalog/Category.jsp";

  private static final String VIEW_PRODUCT = "/WEB-INF/jsp/catalog/Product.jsp";

  private static final String VIEW_ITEM = "/WEB-INF/jsp/catalog/Item.jsp";

  private static final String SEARCH_PRODUCTS = "/WEB-INF/jsp/catalog/SearchProducts.jsp";

  // @SpringBean
  private ICatalogService catalogService = new ICatalogServiceImpl();

  private String keyword;

  private String categoryId;

  private ICategory category;

  private List<ICategory> categoryList;

  private String productId;

  private IProduct product;

  private List<IProduct> productList;

  private String itemId;

  private IItem item;

  private List<IItem> itemList;

  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public ICategory getCategory() {
    return category;
  }

  public void setCategory(ICategory category) {
    this.category = category;
  }

  public IProduct getProduct() {
    return product;
  }

  public void setProduct(IProduct product) {
    this.product = product;
  }

  public IItem getItem() {
    return item;
  }

  public void setItem(IItem item) {
    this.item = item;
  }

  public List<ICategory> getCategoryList() {
    return categoryList;
  }

  public void setCategoryList(List<ICategory> categoryList) {
    this.categoryList = categoryList;
  }

  public List<IProduct> getProductList() {
    return productList;
  }

  public void setProductList(List<IProduct> productList) {
    this.productList = productList;
  }

  public List<IItem> getItemList() {
    return itemList;
  }

  public void setItemList(List<IItem> itemList) {
    this.itemList = itemList;
  }

  @DefaultHandler
  public ForwardResolution viewMain() {
    return new ForwardResolution(CatalogActionBean.MAIN);
  }

  /**
   * View category.
   *
   * @return the forward resolution
   */
  public ForwardResolution viewCategory() {
    System.out.println("viewCategory actually called");
    if ((categoryId) != null) {
      System.out.println("category id not null");
      productList = catalogService.getProductListByCategory(categoryId);
      category = catalogService.getCategory(categoryId);
    }
    System.out.println("returning view for category");
    return new ForwardResolution(CatalogActionBean.VIEW_CATEGORY);
  }

  /**
   * View product.
   *
   * @return the forward resolution
   */
  public ForwardResolution viewProduct() {
    if ((productId) != null) {
      itemList = catalogService.getItemListByProduct(productId);
      product = catalogService.getProduct(productId);
    }
    return new ForwardResolution(CatalogActionBean.VIEW_PRODUCT);
  }

  /**
   * View item.
   *
   * @return the forward resolution
   */
  public ForwardResolution viewItem() {
    item = catalogService.getItem(itemId);
    product = item.getProduct();
    return new ForwardResolution(CatalogActionBean.VIEW_ITEM);
  }

  /**
   * Search products.
   *
   * @return the forward resolution
   */
  public ForwardResolution searchProducts() {
    if (((keyword) == null) || ((keyword.length()) < 1)) {
      setMessage("Please enter a keyword to search for, then press the search button.");
      return new ForwardResolution(AbstractActionBean.ERROR);
    } else {
      productList = catalogService.searchProductList(keyword.toLowerCase());
      return new ForwardResolution(CatalogActionBean.SEARCH_PRODUCTS);
    }
  }

  /**
   * Clear.
   */
  public void clear() {
    keyword = null;
    categoryId = null;
    category = null;
    categoryList = null;
    productId = null;
    product = null;
    productList = null;
    itemId = null;
    item = null;
    itemList = null;
  }
}
