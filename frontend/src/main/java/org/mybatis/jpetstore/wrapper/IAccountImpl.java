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

public class IAccountImpl implements IAccount, Proxy {
  private int account_id;

  private ObjectNode xx;

  private String address = "account";
  private String port = "8084";
  private String serviceName = "AccountService";

  public IAccountImpl() {
    this.account_id = RestTemplateFormatter.sendCreateHTTPRequest(address, port, serviceName);
  }

  public IAccountImpl(int account_id) {
    this.account_id = account_id;
  }

  public int getProxyId() {
    return account_id;
  }

  public String getUsername() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getUsername", null);
    // BeanUtil.getBean(AccountTemplate.class).getUsername(account_id);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setUsername(String username) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("username", username);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setUsername", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getPassword() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getPassword", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setPassword(String password) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("password", password);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setPassword", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getEmail() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getEmail", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setEmail(String email) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("email", email);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setEmail", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getFirstName() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getFirstName", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setFirstName(String firstName) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("firstName", firstName);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setFirstName", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getLastName() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getLastName", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setLastName(String lastName) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("lastName", lastName);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setLastName", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getStatus() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getStatus", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setStatus(String status) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("status", status);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setStatus", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getAddress1() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getAddress1", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setAddress1(String address1) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("address1", address1);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setAddress1", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getAddress2() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getAddress2", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setAddress2(String address2) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("address2", address2);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setAddress2", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getCity() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getCity", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setCity(String city) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("city", city);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setCity", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getState() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getState", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setState(String state) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("state", state);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setState", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getZip() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getZip", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setZip(String zip) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("zip", zip);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setZip", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getCountry() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getCountry", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setCountry(String country) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("country", country);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setCountry", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getPhone() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getPhone", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setPhone(String phone) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("phone", phone);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setPhone", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getFavouriteCategoryId() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getFavouriteCategoryId", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setFavouriteCategoryId(String favouriteCategoryId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("favouriteCategoryId", favouriteCategoryId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setFavouriteCategoryId", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getLanguagePreference() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getLanguagePreference", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setLanguagePreference(String languagePreference) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("languagePreference", languagePreference);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setLanguagePreference", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public boolean isListOption() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "isListOption", null);
    boolean return_boolean = return_node.get("return").asBoolean();
    return return_boolean;
  }

  public void setListOption(boolean listOption) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("listOption", listOption);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setListOption", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public boolean isBannerOption() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "isBannerOption", null);
    boolean return_boolean = return_node.get("return").asBoolean();
    return return_boolean;
  }

  public void setBannerOption(boolean bannerOption) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("bannerOption", bannerOption);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setBannerOption", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public String getBannerName() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "getBannerName", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  public void setBannerName(String bannerName) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("bannerName", bannerName);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(account_id), "setBannerName", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }
}
