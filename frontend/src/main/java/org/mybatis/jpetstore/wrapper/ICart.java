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
package org.mybatis.jpetstore.wrapper;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public interface ICart {
  public Iterator<ICartItem> getCartItems();

  public List<ICartItem> getCartItemList();

  public int getNumberOfItems();

  public Iterator<ICartItem> getAllCartItems();

  public boolean containsItemId(String itemId);

  public void addItem(IItem item, boolean isInStock);

  public IItem removeItemById(String itemId);

  public void incrementQuantityByItemId(String itemId);

  public void setQuantityByItemId(String itemId, int quantity);

  public BigDecimal getSubTotal();
}
