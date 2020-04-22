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

public class IAccountServiceImpl implements IAccountService, Proxy {
  private int accountservice_id;

  private ObjectNode xx;

  private String address = "account";
  private String port = "8084";
  private String serviceName = "AccountServiceService";

  public IAccountServiceImpl() {
    this.accountservice_id = RestTemplateFormatter.sendCreateHTTPRequest(address, port, serviceName);
  }

  public IAccountServiceImpl(int accountservice_id) {
    this.accountservice_id = accountservice_id;
  }

  public int getProxyId() {
    return accountservice_id;
  }

  public IAccount getAccount(String username) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("username", username);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(accountservice_id), "getAccount", param_node);
    IAccount return_account = new IAccountImpl(return_node.get("return").asInt());
    return return_account;
  }

  public IAccount getAccount(String username, String password) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("username", username);
    ((ObjectNode) param_node).put("password", password);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(accountservice_id), "getAccount", param_node);
    IAccount return_account = new IAccountImpl(return_node.get("return").asInt());
    return return_account;
  }

  public void insertAccount(IAccount account) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("account", ((Proxy) account).getProxyId());
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(accountservice_id), "insertAccount", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  public void updateAccount(IAccount account) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("account", ((Proxy) account).getProxyId());
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(accountservice_id), "updateAccount", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }
}
