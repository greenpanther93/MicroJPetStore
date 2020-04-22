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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.xml.crypto.Data;

public class IOrderImpl implements IOrder, Proxy {
  private int order_id;

  private ObjectNode xx;

  private String address = "order";
  // private String address = "localhost";
  private String port = "8082";
  private String serviceName = "OrderService";

  public IOrderImpl() {
    this.order_id = RestTemplateFormatter.sendCreateHTTPRequest(address, port, serviceName);
  }

  public IOrderImpl(int order_id) {
    this.order_id = order_id;
  }

  public int getProxyId() {
    return order_id;
  }

  public int getOrderId() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getOrderId", null);
    int return_int = return_node.get("return").asInt();
    return return_int;
  }

  public void setOrderId(int orderId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("orderId", orderId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setOrderId", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getUsername() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getUsername", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setUsername(String username) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("username", username);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setUsername", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public Date getOrderDate() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getOrderDate", null);
    Date return_date = new Date(return_node.get("return").asText(null));
    return return_date;
  }

  public void setOrderDate(Date orderDate) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("orderDate", orderDate.toString());
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setOrderDate", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getShipAddress1() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getShipAddress1", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setShipAddress1(String shipAddress1) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("shipAddress1", shipAddress1);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setShipAddress1", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getShipAddress2() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getShipAddress2", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setShipAddress2(String shipAddress2) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("shipAddress2", shipAddress2);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setShipAddress2", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getShipCity() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getShipCity", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setShipCity(String shipCity) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("shipCity", shipCity);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setShipCity", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getShipState() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getShipState", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setShipState(String shipState) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("shipState", shipState);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setShipState", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getShipZip() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getShipZip", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setShipZip(String shipZip) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("shipZip", shipZip);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setShipZip", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getShipCountry() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getShipCountry", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setShipCountry(String shipCountry) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("shipCountry", shipCountry);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setShipCountry", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getBillAddress1() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getBillAddress1", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setBillAddress1(String billAddress1) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("billAddress1", billAddress1);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setBillAddress1", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getBillAddress2() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getBillAddress2", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setBillAddress2(String billAddress2) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("billAddress2", billAddress2);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setBillAddress2", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getBillCity() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getBillCity", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setBillCity(String billCity) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("billCity", billCity);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setBillCity", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getBillState() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getBillState", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setBillState(String billState) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("billState", billState);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setBillState", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getBillZip() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getBillZip", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setBillZip(String billZip) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("billZip", billZip);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setBillZip", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getBillCountry() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getBillCountry", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setBillCountry(String billCountry) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("billCountry", billCountry);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setBillCountry", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getCourier() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getCourier", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setCourier(String courier) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("courier", courier);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setCourier", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public BigDecimal getTotalPrice() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getTotalPrice", null);
    BigDecimal return_bigdecimal = new BigDecimal(return_node.get("return").asText(null));
    return return_bigdecimal;
  }

  public void setTotalPrice(BigDecimal totalPrice) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("totalPrice", totalPrice);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setTotalPrice", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getBillToFirstName() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getBillToFirstName", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setBillToFirstName(String billToFirstName) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("billToFirstName", billToFirstName);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setBillToFirstName", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getBillToLastName() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getBillToLastName", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setBillToLastName(String billToLastName) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("billToLastName", billToLastName);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setBillToLastName", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getShipToFirstName() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getShipToFirstName", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setShipToFirstName(String shipFoFirstName) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("shipFoFirstName", shipFoFirstName);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setShipToFirstName", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getShipToLastName() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getShipToLastName", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setShipToLastName(String shipToLastName) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("shipToLastName", shipToLastName);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setShipToLastName", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getCreditCard() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getCreditCard", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setCreditCard(String creditCard) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("creditCard", creditCard);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setCreditCard", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getExpiryDate() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getExpiryDate", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setExpiryDate(String expiryDate) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("expiryDate", expiryDate);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setExpiryDate", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getCardType() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getCardType", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setCardType(String cardType) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("cardType", cardType);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setCardType", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getLocale() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getLocale", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setLocale(String locale) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("locale", locale);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setLocale", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getStatus() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getStatus", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setStatus(String status) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("status", status);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setStatus", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public void initOrder(IAccount account, ICart cart) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("account", ((Proxy) account).getProxyId());
    ((ObjectNode) param_node).put("cart", ((Proxy) cart).getProxyId());
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "initOrder", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public void addLineItem(ICartItem cartItem) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("cartItem", ((Proxy) cartItem).getProxyId());
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "addLineItem", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public void setLineItems(List<ILineItem> lineItems) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ArrayNode param_node_list = mapper.createArrayNode();
    ((ObjectNode) param_node).put("lineItems", param_node_list);
    for (ILineItem lineItems_element : ((Iterable<ILineItem>) lineItems)) {
      param_node_list.add(((Proxy) lineItems_element).getProxyId());
    }
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "setLineItems", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public List<ILineItem> getLineItems() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "getLineItems", null);
    List<ILineItem> return_list = new java.util.ArrayList();
    ArrayNode return_list_array = (ArrayNode) return_node.get("return");
    Iterator<JsonNode> return_list_iterator = return_list_array.elements();
    while (return_list_iterator.hasNext()) {
      JsonNode return_list_node = return_list_iterator.next();
      ILineItem return_list_element = new ILineItemImpl(return_list_node.asInt());
      return_list.add(return_list_element);
    }
    return return_list;
  }

  public void addLineItem(ILineItem lineItem) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("lineItem", ((Proxy) lineItem).getProxyId());
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(order_id),
        "addLineItem", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }
}
