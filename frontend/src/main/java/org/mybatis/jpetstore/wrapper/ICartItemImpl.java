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
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.math.BigDecimal;

public class ICartItemImpl implements ICartItem, Proxy {
  private int carttem_id;

  private ObjectNode xx;

  private String address = "order";
  private String port = "8082";
  private String serviceName = "CartItemService";

  public ICartItemImpl() {
    this.carttem_id = RestTemplateFormatter.sendCreateHTTPRequest(address, port, serviceName);
  }

  public ICartItemImpl(int carttem_id) {
    this.carttem_id = carttem_id;
  }

  public int getProxyId() {
    return carttem_id;
  }

  public boolean isInStock() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(carttem_id), "isInStock", null);
    boolean return_boolean = return_node.get("return").asBoolean();
    return return_boolean;
  }

  public void setInStock(boolean inStock) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("inStock", inStock);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(carttem_id), "isInStock", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public BigDecimal getTotal() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(carttem_id), "getTotal", null);
    BigDecimal return_bigdecimal = new BigDecimal(return_node.get("return").asText(null));
    return return_bigdecimal;
  }

  public IItem getItem() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(carttem_id), "getItem", null);
    IItem return_item = new IItemImpl(return_node.get("return").asInt());
    return return_item;
  }

  public void setItem(IItem item) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("item", ((Proxy) item).getProxyId());
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(carttem_id), "setItem", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public int getQuantity() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(carttem_id), "getQuantity", null);
    int return_int = return_node.get("return").asInt();
    return return_int;
  }

  public void setQuantity(int quantity) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("quantity", quantity);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(carttem_id), "setQuantity", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public void incrementQuantity() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(carttem_id), "incrementQuantity", null);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }
}
