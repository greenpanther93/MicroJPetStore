package org.mybatis.jpetstore.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountServiceWebService {
    private ObjectNode xx;
    
    @Autowired
    private AccountService accountService;

    @GetMapping("/AccountServiceService/")
    public int createAccountService() {
        return 0;
    }

    @PostMapping("/AccountServiceService/{proxy_id}/getAccount")
    public JsonNode getAccount(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
//        IAccountService accountservice = InstanceDatabase.getAccountService(proxy_id);
        String username = node.get("username").asText();
        IAccount return_account = accountService.getAccount(username);
        ((ObjectNode)return_node).put("return", InstanceDatabase.addAccount(return_account));
        return return_node;
    }
    
    @PostMapping("/AccountServiceService/{proxy_id}/getAccountWithPassword")
    public JsonNode getAccountWithPassword(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
//        IAccountService accountservice = InstanceDatabase.getAccountService(proxy_id);
        String username = node.get("username").asText();
        String password = node.get("password").asText();
        IAccount return_account = accountService.getAccount(username,password);
        ((ObjectNode)return_node).put("return", InstanceDatabase.addAccount(return_account));
        return return_node;
    }

    @Transactional
    @PostMapping("/AccountServiceService/{proxy_id}/insertAccount")
    public JsonNode insertAccount(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
//        IAccountService accountservice = InstanceDatabase.getAccountService(proxy_id);
        IAccount account = InstanceDatabase.getAccount(node.get("account").asInt());
        accountService.insertAccount(account);
        // No need to prepare a void type.;
        return return_node;
    }

    @Transactional
    @PostMapping("/AccountServiceService/{proxy_id}/updateAccount")
    public JsonNode updateAccount(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
//        IAccountService accountservice = InstanceDatabase.getAccountService(proxy_id);
        IAccount account = InstanceDatabase.getAccount(node.get("account").asInt());
        accountService.updateAccount(account);
        // No need to prepare a void type.;
        return return_node;
    }
}

