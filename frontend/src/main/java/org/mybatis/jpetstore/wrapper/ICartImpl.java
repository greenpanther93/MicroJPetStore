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
import java.util.Iterator;
import java.util.List;

public class ICartImpl implements ICart, Proxy {
  private int cart_id;

  private ObjectNode xx;

  private String address = "order";
  private String port = "8082";
  private String serviceName = "CartService";

  public ICartImpl() {
    this.cart_id = RestTemplateFormatter.sendCreateHTTPRequest(address, port, serviceName);
  }

  public ICartImpl(int cart_id) {
    this.cart_id = cart_id;
  }

  public int getProxyId() {
    return cart_id;
  }

  public Iterator<ICartItem> getCartItems() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(cart_id),
        "getCartItems", null);
    List<ICartItem> return_iterator = new java.util.ArrayList();
    ArrayNode return_iterator_array = (ArrayNode) return_node.get("return");
    Iterator<JsonNode> return_iterator_iterator = return_iterator_array.elements();
    while (return_iterator_iterator.hasNext()) {
      JsonNode return_iterator_node = return_iterator_iterator.next();
      ICartItem return_iterator_element = new ICartItemImpl(return_iterator_node.asInt());
      return_iterator.add(return_iterator_element);
    }
    return return_iterator.iterator();
  }

  public List<ICartItem> getCartItemList() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(cart_id),
        "getCartItemList", null);
    List<ICartItem> return_list = new java.util.ArrayList();
    ArrayNode return_list_array = (ArrayNode) return_node.get("return");
    Iterator<JsonNode> return_list_iterator = return_list_array.elements();
    while (return_list_iterator.hasNext()) {
      JsonNode return_list_node = return_list_iterator.next();
      ICartItem return_list_element = new ICartItemImpl(return_list_node.asInt());
      return_list.add(return_list_element);
    }
    return return_list;
  }

  public int getNumberOfItems() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(cart_id),
        "getNumberOfItems", null);
    int return_int = return_node.get("return").asInt();
    return return_int;
  }

  public Iterator<ICartItem> getAllCartItems() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(cart_id),
        "getAllCartItems", null);
    List<ICartItem> return_iterator = new java.util.ArrayList();
    ArrayNode return_iterator_array = (ArrayNode) return_node.get("return");
    Iterator<JsonNode> return_iterator_iterator = return_iterator_array.elements();
    while (return_iterator_iterator.hasNext()) {
      JsonNode return_iterator_node = return_iterator_iterator.next();
      ICartItem return_iterator_element = new ICartItemImpl(return_iterator_node.asInt());
      return_iterator.add(return_iterator_element);
    }
    return return_iterator.iterator();
  }

  public boolean containsItemId(String itemId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("itemId", itemId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(cart_id),
        "containsItemId", param_node);
    boolean return_boolean = return_node.get("return").asBoolean();
    return return_boolean;
  }

  public void addItem(IItem item, boolean isInStock) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("item", ((Proxy) item).getProxyId());
    ((ObjectNode) param_node).put("isInStock", isInStock);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(cart_id),
        "addItem", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public IItem removeItemById(String itemId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("itemId", itemId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(cart_id),
        "removeItemById", param_node);
    IItem return_item = new IItemImpl(return_node.get("return").asInt());
    return return_item;
  }

  public void incrementQuantityByItemId(String itemId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("itemId", itemId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(cart_id),
        "incrementQuantityByItemId", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public void setQuantityByItemId(String itemId, int quantity) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("itemId", itemId);
    ((ObjectNode) param_node).put("quantity", quantity);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(cart_id),
        "setQuantityByItemId", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public BigDecimal getSubTotal() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(cart_id),
        "getSubTotal", null);
    BigDecimal return_bigdecimal = new BigDecimal(return_node.get("return").asText(null));
    return return_bigdecimal;
  }
}
