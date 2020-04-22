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

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@Component
@FeignClient(name = "order-service", url = "http://localhost:8082")
@RibbonClient(name = "order-service")
public interface OrderTemplate {
  @GetMapping("/OrderServiceService/")
  public int createOrderService();

  @PostMapping("/OrderServiceService/{proxy_id}/getNextId")
  public JsonNode getNextId(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @Transactional
  @PostMapping("/OrderServiceService/{proxy_id}/getOrder")
  public JsonNode getOrder(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderServiceService/{proxy_id}/getOrdersByUsername")
  public JsonNode getOrdersByUsername(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @Transactional
  @PostMapping("/OrderServiceService/{proxy_id}/insertOrder")
  public JsonNode insertOrder(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @GetMapping("/CartItemService/")
  public int createCartItem();

  @GetMapping("/CartItemService/{proxy_id}/calculateTotal")
  public JsonNode calculateTotal(@PathVariable int proxy_id);

  @GetMapping("/CartItemService/{proxy_id}/getItem")
  public JsonNode getItem(@PathVariable int proxy_id);

  @GetMapping("/CartItemService/{proxy_id}/getQuantity")
  public JsonNode getQuantity(@PathVariable int proxy_id);

  @GetMapping("/CartItemService/{proxy_id}/getTotal")
  public JsonNode getTotal(@PathVariable int proxy_id);

  @GetMapping("/CartItemService/{proxy_id}/incrementQuantity")
  public JsonNode incrementQuantity(@PathVariable int proxy_id);

  @GetMapping("/CartItemService/{proxy_id}/isInStock")
  public JsonNode isInStock(@PathVariable int proxy_id);

  @PostMapping("/CartItemService/{proxy_id}/setInStock")
  public JsonNode setInStock(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/CartItemService/{proxy_id}/setItem")
  public JsonNode setItem(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/CartItemService/{proxy_id}/setQuantity")
  public JsonNode setQuantity(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @GetMapping("/CartService/")
  public int createCart();

  @PostMapping("/CartService/{proxy_id}/addItem")
  public JsonNode addItem(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/CartService/{proxy_id}/containsItemId")
  public JsonNode containsItemId(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @GetMapping("/CartService/{proxy_id}/getAllCartItems")
  public JsonNode getAllCartItems(@PathVariable int proxy_id);

  @GetMapping("/CartService/{proxy_id}/getCartItemList")
  public JsonNode getCartItemList(@PathVariable int proxy_id);

  @GetMapping("/CartService/{proxy_id}/getCartItems")
  public JsonNode getCartItems(@PathVariable int proxy_id);

  @GetMapping("/CartService/{proxy_id}/getNumberOfItems")
  public JsonNode getNumberOfItems(@PathVariable int proxy_id);

  @GetMapping("/CartService/{proxy_id}/getSubTotal")
  public JsonNode getSubTotal(@PathVariable int proxy_id);

  @PostMapping("/CartService/{proxy_id}/incrementQuantityByItemId")
  public JsonNode incrementQuantityByItemId(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/CartService/{proxy_id}/removeItemById")
  public JsonNode removeItemById(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/CartService/{proxy_id}/setQuantityByItemId")
  public JsonNode setQuantityByItemId(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @GetMapping("/OrderService/")
  public int createOrder();

  @PostMapping("/OrderService/{proxy_id}/addLineItem")
  public JsonNode addLineItem(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @GetMapping("/OrderService/{proxy_id}/getBillAddress1")
  public JsonNode getBillAddress1(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getBillAddress2")
  public JsonNode getBillAddress2(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getBillCity")
  public JsonNode getBillCity(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getBillCountry")
  public JsonNode getBillCountry(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getBillState")
  public JsonNode getBillState(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getBillToFirstName")
  public JsonNode getBillToFirstName(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getBillToLastName")
  public JsonNode getBillToLastName(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getBillZip")
  public JsonNode getBillZip(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getCardType")
  public JsonNode getCardType(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getCourier")
  public JsonNode getCourier(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getCreditCard")
  public JsonNode getCreditCard(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getExpiryDate")
  public JsonNode getExpiryDate(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getLineItems")
  public JsonNode getLineItems(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getLocale")
  public JsonNode getLocale(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getOrderDate")
  public JsonNode getOrderDate(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getOrderId")
  public JsonNode getOrderId(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getShipAddress1")
  public JsonNode getShipAddress1(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getShipAddress2")
  public JsonNode getShipAddress2(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getShipCity")
  public JsonNode getShipCity(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getShipCountry")
  public JsonNode getShipCountry(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getShipState")
  public JsonNode getShipState(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getShipToFirstName")
  public JsonNode getShipToFirstName(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getShipToLastName")
  public JsonNode getShipToLastName(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getShipZip")
  public JsonNode getShipZip(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getStatus")
  public JsonNode getStatus(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getTotalPrice")
  public JsonNode getTotalPrice(@PathVariable int proxy_id);

  @GetMapping("/OrderService/{proxy_id}/getUsername")
  public JsonNode getUsername(@PathVariable int proxy_id);

  @PostMapping("/OrderService/{proxy_id}/initOrder")
  public JsonNode initOrder(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setBillAddress1")
  public JsonNode setBillAddress1(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setBillAddress2")
  public JsonNode setBillAddress2(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setBillCity")
  public JsonNode setBillCity(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setBillCountry")
  public JsonNode setBillCountry(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setBillState")
  public JsonNode setBillState(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setBillToFirstName")
  public JsonNode setBillToFirstName(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setBillToLastName")
  public JsonNode setBillToLastName(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setBillZip")
  public JsonNode setBillZip(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setCardType")
  public JsonNode setCardType(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setCourier")
  public JsonNode setCourier(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setCreditCard")
  public JsonNode setCreditCard(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setExpiryDate")
  public JsonNode setExpiryDate(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setLineItems")
  public JsonNode setLineItems(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setLocale")
  public JsonNode setLocale(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setOrderDate")
  public JsonNode setOrderDate(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setOrderId")
  public JsonNode setOrderId(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setShipAddress1")
  public JsonNode setShipAddress1(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setShipAddress2")
  public JsonNode setShipAddress2(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setShipCity")
  public JsonNode setShipCity(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setShipCountry")
  public JsonNode setShipCountry(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setShipState")
  public JsonNode setShipState(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setShipToFirstName")
  public JsonNode setShipToFirstName(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setShipToLastName")
  public JsonNode setShipToLastName(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setShipZip")
  public JsonNode setShipZip(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setStatus")
  public JsonNode setStatus(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setTotalPrice")
  public JsonNode setTotalPrice(@PathVariable int proxy_id, @RequestBody JsonNode node);

  @PostMapping("/OrderService/{proxy_id}/setUsername")
  public JsonNode setUsername(@PathVariable int proxy_id, @RequestBody JsonNode node);
}
