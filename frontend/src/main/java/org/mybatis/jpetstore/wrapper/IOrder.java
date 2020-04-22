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
import java.util.Date;
import java.util.List;

public interface IOrder {
  public int getOrderId();

  public void setOrderId(int orderId);

  public String getUsername();

  public void setUsername(String username);

  public Date getOrderDate();

  public void setOrderDate(Date orderDate);

  public String getShipAddress1();

  public void setShipAddress1(String shipAddress1);

  public String getShipAddress2();

  public void setShipAddress2(String shipAddress2);

  public String getShipCity();

  public void setShipCity(String shipCity);

  public String getShipState();

  public void setShipState(String shipState);

  public String getShipZip();

  public void setShipZip(String shipZip);

  public String getShipCountry();

  public void setShipCountry(String shipCountry);

  public String getBillAddress1();

  public void setBillAddress1(String billAddress1);

  public String getBillAddress2();

  public void setBillAddress2(String billAddress2);

  public String getBillCity();

  public void setBillCity(String billCity);

  public String getBillState();

  public void setBillState(String billState);

  public String getBillZip();

  public void setBillZip(String billZip);

  public String getBillCountry();

  public void setBillCountry(String billCountry);

  public String getCourier();

  public void setCourier(String courier);

  public BigDecimal getTotalPrice();

  public void setTotalPrice(BigDecimal totalPrice);

  public String getBillToFirstName();

  public void setBillToFirstName(String billToFirstName);

  public String getBillToLastName();

  public void setBillToLastName(String billToLastName);

  public String getShipToFirstName();

  public void setShipToFirstName(String shipFoFirstName);

  public String getShipToLastName();

  public void setShipToLastName(String shipToLastName);

  public String getCreditCard();

  public void setCreditCard(String creditCard);

  public String getExpiryDate();

  public void setExpiryDate(String expiryDate);

  public String getCardType();

  public void setCardType(String cardType);

  public String getLocale();

  public void setLocale(String locale);

  public String getStatus();

  public void setStatus(String status);

  public void initOrder(IAccount account, ICart cart);

  public void addLineItem(ICartItem cartItem);
}
