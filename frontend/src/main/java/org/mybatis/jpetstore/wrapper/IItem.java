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

public interface IItem {
  public String getItemId();

  public void setItemId(String itemId);

  public int getQuantity();

  public void setQuantity(int quantity);

  public IProduct getProduct();

  public void setProduct(IProduct product);

  public int getSupplierId();

  public void setSupplierId(int supplierId);

  public BigDecimal getListPrice();

  public void setListPrice(BigDecimal listPrice);

  public BigDecimal getUnitCost();

  public void setUnitCost(BigDecimal unitCost);

  public String getStatus();

  public void setStatus(String status);

  public String getAttribute1();

  public void setAttribute1(String attribute1);

  public String getAttribute2();

  public void setAttribute2(String attribute2);

  public String getAttribute3();

  public void setAttribute3(String attribute3);

  public String getAttribute4();

  public void setAttribute4(String attribute4);

  public String getAttribute5();

  public void setAttribute5(String attribute5);

  public String toString();
}
