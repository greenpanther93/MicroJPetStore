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

public class IItemImpl implements IItem, Proxy {
  private int tem_id;

  private ObjectNode xx;

  private String address = "catalog";
  private String port = "8083";
  private String serviceName = "ItemService";

  public IItemImpl() {
    this.tem_id = RestTemplateFormatter.sendCreateHTTPRequest(address, port, serviceName);
  }

  public IItemImpl(int tem_id) {
    this.tem_id = tem_id;
  }

  public int getProxyId() {
    return tem_id;
  }

  public String getItemId() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "getItemId", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setItemId(String itemId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("itemId", itemId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "setItemId", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public int getQuantity() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "getQuantity", null);
    int return_int = return_node.get("return").asInt();
    return return_int;
  }

  public void setQuantity(int quantity) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("quantity", quantity);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "setQuantity", null);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public IProduct getProduct() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "getProduct", null);
    IProduct return_product = new IProductImpl(return_node.get("return").asInt());
    return return_product;
  }

  public void setProduct(IProduct product) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("product", ((Proxy) product).getProxyId());
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "setProduct", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public int getSupplierId() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "getSupplierId", null);
    int return_int = return_node.get("return").asInt();
    return return_int;
  }

  public void setSupplierId(int supplierId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("supplierId", supplierId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "setSupplierId", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public BigDecimal getListPrice() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "getListPrice", null);
    BigDecimal return_bigdecimal = new BigDecimal(return_node.get("return").asText(null));
    return return_bigdecimal;
  }

  public void setListPrice(BigDecimal listPrice) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("listPrice", listPrice);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "setListPrice", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public BigDecimal getUnitCost() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "getUnitCost", null);
    BigDecimal return_bigdecimal = new BigDecimal(return_node.get("return").asText(null));
    return return_bigdecimal;
  }

  public void setUnitCost(BigDecimal unitCost) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("unitCost", unitCost);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "setUnitCost", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getStatus() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "getStatus", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setStatus(String status) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("status", status);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "setStatus", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getAttribute1() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "getAttribute1", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setAttribute1(String attribute1) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("attribute1", attribute1);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "setAttribute1", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getAttribute2() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "getAttribute2", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setAttribute2(String attribute2) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("attribute2", attribute2);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "setAttribute2", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getAttribute3() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "getAttribute3", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setAttribute3(String attribute3) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("attribute3", attribute3);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "setAttribute3", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getAttribute4() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "getAttribute4", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setAttribute4(String attribute4) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("attribute4", attribute4);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "setAttribute4", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getAttribute5() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "getAttribute5", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setAttribute5(String attribute5) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("attribute5", attribute5);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "setAttribute5", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String toString() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName, Integer.toString(tem_id),
        "toString", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }
}
