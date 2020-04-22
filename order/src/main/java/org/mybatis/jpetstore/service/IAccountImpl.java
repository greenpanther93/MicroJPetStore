package org.mybatis.jpetstore.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class IAccountImpl implements IAccount , Proxy {
    private int account_id;

    private ObjectNode xx;

    public IAccountImpl() {
        this.account_id = BeanUtil.getBean(AccountTemplate.class).createAccount();
    }

    public IAccountImpl(int account_id) {
        this.account_id = account_id;
    }

    public int getProxyId() {
        return account_id;
    }

    public String getUsername() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getUsername(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setUsername(String username) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("username", username);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setUsername(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getPassword() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getPassword(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setPassword(String password) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("password", password);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setPassword(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getEmail() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getEmail(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setEmail(String email) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("email", email);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setEmail(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getFirstName() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getFirstName(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setFirstName(String firstName) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("firstName", firstName);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setFirstName(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getLastName() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getLastName(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setLastName(String lastName) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("lastName", lastName);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setLastName(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getStatus() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getStatus(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setStatus(String status) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("status", status);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setStatus(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getAddress1() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getAddress1(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setAddress1(String address1) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("address1", address1);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setAddress1(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getAddress2() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getAddress2(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setAddress2(String address2) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("address2", address2);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setAddress2(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getCity() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getCity(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setCity(String city) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("city", city);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setCity(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getState() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getState(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setState(String state) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("state", state);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setState(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getZip() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getZip(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setZip(String zip) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("zip", zip);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setZip(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getCountry() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getCountry(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setCountry(String country) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("country", country);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setCountry(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getPhone() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getPhone(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setPhone(String phone) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("phone", phone);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setPhone(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getFavouriteCategoryId() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getFavouriteCategoryId(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setFavouriteCategoryId(String favouriteCategoryId) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("favouriteCategoryId", favouriteCategoryId);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setFavouriteCategoryId(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getLanguagePreference() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getLanguagePreference(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setLanguagePreference(String languagePreference) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("languagePreference", languagePreference);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setLanguagePreference(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public boolean isListOption() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).isListOption(account_id);
        boolean return_boolean = return_node.get("return").asBoolean();
        return return_boolean;
    }

    public void setListOption(boolean listOption) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("listOption", listOption);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setListOption(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public boolean isBannerOption() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).isBannerOption(account_id);
        boolean return_boolean = return_node.get("return").asBoolean();
        return return_boolean;
    }

    public void setBannerOption(boolean bannerOption) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("bannerOption", bannerOption);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setBannerOption(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getBannerName() {
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).getBannerName(account_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setBannerName(String bannerName) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("bannerName", bannerName);
        JsonNode return_node = BeanUtil.getBean(AccountTemplate.class).setBannerName(account_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }
}

