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
import java.util.Iterator;
import java.util.List;

public class IOrderServiceImpl implements IOrderService, Proxy {
  private int orderservice_id;

  private ObjectNode xx;

  // private String address = "order";
  private String address = "localhost";
  private String port = "8082";
  private String serviceName = "OrderServiceService";

  public IOrderServiceImpl() {
    this.orderservice_id = RestTemplateFormatter.sendCreateHTTPRequest(address, port, serviceName);
  }

  public IOrderServiceImpl(int orderservice_id) {
    this.orderservice_id = orderservice_id;
  }

  public int getProxyId() {
    return orderservice_id;
  }

  public void insertOrder(IOrder order) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("order", ((Proxy) order).getProxyId());
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(orderservice_id), "insertOrder", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public IOrder getOrder(int orderId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("orderId", orderId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(orderservice_id), "getOrder", param_node);
    IOrder return_order = new IOrderImpl(return_node.get("return").asInt());
    return return_order;
  }

  public List<IOrder> getOrdersByUsername(String username) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("username", username);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(orderservice_id), "getOrdersByUsername", param_node);
    List<IOrder> return_list = new java.util.ArrayList();
    ArrayNode return_list_array = (ArrayNode) return_node.get("return");
    Iterator<JsonNode> return_list_iterator = return_list_array.elements();
    while (return_list_iterator.hasNext()) {
      JsonNode return_list_node = return_list_iterator.next();
      IOrder return_list_element = new IOrderImpl(return_list_node.asInt());
      return_list.add(return_list_element);
    }
    return return_list;
  }

  public int getNextId(String name) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("name", name);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(orderservice_id), "getNextId", param_node);
    int return_int = return_node.get("return").asInt();
    return return_int;
  }
}
