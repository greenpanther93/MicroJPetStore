package org.mybatis.jpetstore.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.math.BigDecimal;


public class IItemImpl implements IItem , Proxy {
    private int item_id;

    private ObjectNode xx;

    public IItemImpl() {
        this.item_id = BeanUtil.getBean(CatalogTemplate.class).createItem();
    }

    public IItemImpl(int item_id) {
        this.item_id = item_id;
    }

    public int getProxyId() {
        return item_id;
    }

    public String getItemId() {
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).getItemId(item_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setItemId(String itemId) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("itemId", itemId);
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).setItemId(item_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public int getQuantity() {
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).getQuantity(item_id);
        int return_int = return_node.get("return").asInt();
        return return_int;
    }

    public void setQuantity(int quantity) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("quantity", quantity);
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).setQuantity(item_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public int getSupplierId() {
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).getSupplierId(item_id);
        int return_int = return_node.get("return").asInt();
        return return_int;
    }

    public void setSupplierId(int supplierId) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("supplierId", supplierId);
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).setSupplierId(item_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public BigDecimal getListPrice() {
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).getListPrice(item_id);
        BigDecimal return_bigdecimal = new BigDecimal(return_node.get("return").asText());
        return return_bigdecimal;
    }

    public void setListPrice(BigDecimal listPrice) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("listPrice", listPrice);
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).setListPrice(item_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public BigDecimal getUnitCost() {
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).getUnitCost(item_id);
        BigDecimal return_bigdecimal = new BigDecimal(return_node.get("return").asText());
        return return_bigdecimal;
    }

    public void setUnitCost(BigDecimal unitCost) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("unitCost", unitCost);
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).setUnitCost(item_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getStatus() {
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).getStatus(item_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setStatus(String status) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("status", status);
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).setStatus(item_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getAttribute1() {
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).getAttribute1(item_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setAttribute1(String attribute1) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("attribute1", attribute1);
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).setAttribute1(item_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getAttribute2() {
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).getAttribute2(item_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setAttribute2(String attribute2) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("attribute2", attribute2);
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).setAttribute2(item_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getAttribute3() {
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).getAttribute3(item_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setAttribute3(String attribute3) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("attribute3", attribute3);
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).setAttribute3(item_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getAttribute4() {
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).getAttribute4(item_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setAttribute4(String attribute4) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("attribute4", attribute4);
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).setAttribute4(item_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String getAttribute5() {
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).getAttribute5(item_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }

    public void setAttribute5(String attribute5) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode param_node = mapper.createObjectNode();
        ((ObjectNode)param_node).put("attribute5", attribute5);
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).setAttribute5(item_id, param_node);
        // No need to prepare a void type.;
        // void return type, so no return statement.;
    }

    public String toString() {
        JsonNode return_node = BeanUtil.getBean(CatalogTemplate.class).toString(item_id);
        String return_string = return_node.get("return").asText();
        return return_string;
    }
}

