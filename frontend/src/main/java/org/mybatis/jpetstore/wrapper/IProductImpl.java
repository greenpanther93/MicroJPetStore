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

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class IProductImpl implements IProduct, Proxy {
  private int product_id;

  private ObjectNode xx;

  private String address = "catalog";
  // private String address = "localhost";
  private String port = "8083";
  private String serviceName = "ProductService";

  public IProductImpl() {
    this.product_id = RestTemplateFormatter.sendCreateHTTPRequest(address, port, serviceName);
  }

  public IProductImpl(int product_id) {
    this.product_id = product_id;
  }

  public int getProxyId() {
    return product_id;
  }

  public String getProductId() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(product_id), "getProductId", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setProductId(String productId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("productId", productId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(product_id), "setProductId", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getCategoryId() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(product_id), "getCategoryId", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setCategoryId(String categoryId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("categoryId", categoryId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(product_id), "setCategoryId", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getName() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(product_id), "getName", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setName(String name) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("name", name);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(product_id), "setName", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getDescription() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(product_id), "getDescription", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setDescription(String description) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("description", description);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(product_id), "setDescription", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String toString() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(product_id), "toString", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }
}
