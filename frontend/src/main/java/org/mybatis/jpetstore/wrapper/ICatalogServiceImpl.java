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

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ICatalogServiceImpl implements ICatalogService, Proxy {
  private int catalogservice_id;

  private ObjectNode xx;

  // private String address = "catalog";
  private String address = "localhost";
  private String port = "8083";
  private String serviceName = "CatalogServiceService";

  public ICatalogServiceImpl() {
    this.catalogservice_id = RestTemplateFormatter.sendCreateHTTPRequest(address, port, serviceName);
    // BeanUtil.getBean(CatalogTemplate.class).createCatalogService();
  }

  public ICatalogServiceImpl(int catalogservice_id) {
    this.catalogservice_id = catalogservice_id;
  }

  public int getProxyId() {
    return catalogservice_id;
  }

  public List<ICategory> getCategoryList() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(catalogservice_id), "getCategoryList", null);
    List<ICategory> return_list = new java.util.ArrayList();
    ArrayNode return_list_array = (ArrayNode) return_node.get("return");
    Iterator<JsonNode> return_list_iterator = return_list_array.elements();
    while (return_list_iterator.hasNext()) {
      JsonNode return_list_node = return_list_iterator.next();
      ICategory return_list_element = new ICategoryImpl(return_list_node.asInt());
      return_list.add(return_list_element);
    }
    return return_list;
  }

  public ICategory getCategory(String categoryId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("categoryId", categoryId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(catalogservice_id), "getCategory", param_node);
    // BeanUtil.getBean(CatalogTemplate.class).getCategory(catalogservice_id,
    // param_node);
    ICategory return_category = new ICategoryImpl(return_node.get("return").asInt());
    return return_category;
  }

  public IProduct getProduct(String productId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("productId", productId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(catalogservice_id), "getProduct", param_node);
    IProduct return_product = new IProductImpl(return_node.get("return").asInt());
    return return_product;
  }

  public List<IProduct> getProductListByCategory(String categoryId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("categoryId", categoryId);
    System.out.println(param_node);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(catalogservice_id), "getProductListByCategory", param_node);
    // BeanUtil.getBean(CatalogTemplate.class).getProductListByCategory(catalogservice_id,param_node);
    List<IProduct> return_list = new java.util.ArrayList<IProduct>();
    System.out.println(return_node.toString());
    ArrayNode return_list_array = (ArrayNode) return_node.get("return");
    Iterator<JsonNode> return_list_iterator = return_list_array.elements();
    while (return_list_iterator.hasNext()) {
      JsonNode return_list_node = return_list_iterator.next();
      IProduct return_list_element = new IProductImpl(return_list_node.asInt());
      return_list.add(return_list_element);
    }
    return return_list;
  }

  public List<IProduct> searchProductList(String keywords) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("keywords", keywords);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(catalogservice_id), "searchProductList", param_node);
    List<IProduct> return_list = new java.util.ArrayList();
    ArrayNode return_list_array = (ArrayNode) return_node.get("return");
    Iterator<JsonNode> return_list_iterator = return_list_array.elements();
    while (return_list_iterator.hasNext()) {
      JsonNode return_list_node = return_list_iterator.next();
      IProduct return_list_element = new IProductImpl(return_list_node.asInt());
      return_list.add(return_list_element);
    }
    return return_list;
  }

  public List<IItem> getItemListByProduct(String productId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("productId", productId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(catalogservice_id), "getItemListByProduct", param_node);
    List<IItem> return_list = new java.util.ArrayList();
    ArrayNode return_list_array = (ArrayNode) return_node.get("return");
    Iterator<JsonNode> return_list_iterator = return_list_array.elements();
    while (return_list_iterator.hasNext()) {
      JsonNode return_list_node = return_list_iterator.next();
      IItem return_list_element = new IItemImpl(return_list_node.asInt());
      return_list.add(return_list_element);
    }
    return return_list;
  }

  public IItem getItem(String itemId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("itemId", itemId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(catalogservice_id), "getItem", param_node);
    IItem return_item = new IItemImpl(return_node.get("return").asInt());
    return return_item;
  }

  public boolean isItemInStock(String itemId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("itemId", itemId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(catalogservice_id), "isItemInStock", param_node);
    boolean return_boolean = return_node.get("return").asBoolean();
    return return_boolean;
  }
}
