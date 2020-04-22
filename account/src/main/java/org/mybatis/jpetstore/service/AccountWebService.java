package org.mybatis.jpetstore.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.sourceforge.stripes.validation.Validate;

import org.mybatis.jpetstore.domain.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountWebService {
    private ObjectNode xx;

    @GetMapping("/AccountService/")
    public int createAccount() {
        IAccount account = new Account();
        return InstanceDatabase.addAccount(account);
    }

    @GetMapping("/AccountService/{proxy_id}/getAddress1")
    public JsonNode getAddress1(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getAddress1();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getAddress2")
    public JsonNode getAddress2(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getAddress2();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getBannerName")
    public JsonNode getBannerName(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getBannerName();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getCity")
    public JsonNode getCity(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getCity();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getCountry")
    public JsonNode getCountry(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getCountry();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getEmail")
    public JsonNode getEmail(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getEmail();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getFavouriteCategoryId")
    public JsonNode getFavouriteCategoryId(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getFavouriteCategoryId();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getFirstName")
    public JsonNode getFirstName(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getFirstName();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getLanguagePreference")
    public JsonNode getLanguagePreference(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getLanguagePreference();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getLastName")
    public JsonNode getLastName(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getLastName();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getPassword")
    public JsonNode getPassword(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getPassword();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getPhone")
    public JsonNode getPhone(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getPhone();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getState")
    public JsonNode getState(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getState();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getStatus")
    public JsonNode getStatus(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getStatus();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getUsername")
    public JsonNode getUsername(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getUsername();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/getZip")
    public JsonNode getZip(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String return_string = account.getZip();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/isBannerOption")
    public JsonNode isBannerOption(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        boolean return_boolean = account.isBannerOption();
        ((ObjectNode)return_node).put("return", return_boolean);
        return return_node;
    }

    @GetMapping("/AccountService/{proxy_id}/isListOption")
    public JsonNode isListOption(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        boolean return_boolean = account.isListOption();
        ((ObjectNode)return_node).put("return", return_boolean);
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setAddress1")
    public JsonNode setAddress1(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String address1 = node.get("address1").asText();
        account.setAddress1(address1);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setAddress2")
    public JsonNode setAddress2(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String address2 = node.get("address2").asText();
        account.setAddress2(address2);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setBannerName")
    public JsonNode setBannerName(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String bannerName = node.get("bannerName").asText();
        account.setBannerName(bannerName);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setBannerOption")
    public JsonNode setBannerOption(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        boolean bannerOption = node.get("bannerOption").asBoolean();
        account.setBannerOption(bannerOption);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setCity")
    public JsonNode setCity(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String city = node.get("city").asText();
        account.setCity(city);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setCountry")
    public JsonNode setCountry(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String country = node.get("country").asText();
        account.setCountry(country);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setEmail")
    public JsonNode setEmail(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String email = node.get("email").asText();
        account.setEmail(email);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setFavouriteCategoryId")
    public JsonNode setFavouriteCategoryId(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String favouriteCategoryId = node.get("favouriteCategoryId").asText();
        account.setFavouriteCategoryId(favouriteCategoryId);
        // No need to prepare a void type.;
        return return_node;
    }

    @Validate(required = true, on = { "newAccount", "editAccount" })
    @PostMapping("/AccountService/{proxy_id}/setFirstName")
    public JsonNode setFirstName(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String firstName = node.get("firstName").asText();
        account.setFirstName(firstName);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setLanguagePreference")
    public JsonNode setLanguagePreference(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String languagePreference = node.get("languagePreference").asText();
        account.setLanguagePreference(languagePreference);
        // No need to prepare a void type.;
        return return_node;
    }

    @Validate(required = true, on = { "newAccount", "editAccount" })
    @PostMapping("/AccountService/{proxy_id}/setLastName")
    public JsonNode setLastName(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String lastName = node.get("lastName").asText();
        account.setLastName(lastName);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setListOption")
    public JsonNode setListOption(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        boolean listOption = node.get("listOption").asBoolean();
        account.setListOption(listOption);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setPassword")
    public JsonNode setPassword(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String password = node.get("password").asText();
        account.setPassword(password);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setPhone")
    public JsonNode setPhone(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String phone = node.get("phone").asText();
        account.setPhone(phone);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setState")
    public JsonNode setState(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String state = node.get("state").asText();
        account.setState(state);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setStatus")
    public JsonNode setStatus(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String status = node.get("status").asText();
        account.setStatus(status);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setUsername")
    public JsonNode setUsername(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String username = node.get("username").asText();
        account.setUsername(username);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/AccountService/{proxy_id}/setZip")
    public JsonNode setZip(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IAccount account = InstanceDatabase.getAccount(proxy_id);
        String zip = node.get("zip").asText();
        account.setZip(zip);
        // No need to prepare a void type.;
        return return_node;
    }
}

