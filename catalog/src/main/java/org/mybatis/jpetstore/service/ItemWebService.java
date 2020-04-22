package org.mybatis.jpetstore.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.math.BigDecimal;

import org.mybatis.jpetstore.domain.Item;
import org.mybatis.jpetstore.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ItemWebService {
    private ObjectNode xx;

    @GetMapping("/ItemService/")
    public int createItem() {
        Item item = new Item();
        return InstanceDatabase.addItem(item);
    }

    @GetMapping("/ItemService/{proxy_id}/getAttribute1")
    public JsonNode getAttribute1(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String return_string = item.getAttribute1();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/ItemService/{proxy_id}/getAttribute2")
    public JsonNode getAttribute2(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String return_string = item.getAttribute2();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/ItemService/{proxy_id}/getAttribute3")
    public JsonNode getAttribute3(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String return_string = item.getAttribute3();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/ItemService/{proxy_id}/getAttribute4")
    public JsonNode getAttribute4(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String return_string = item.getAttribute4();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/ItemService/{proxy_id}/getAttribute5")
    public JsonNode getAttribute5(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String return_string = item.getAttribute5();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/ItemService/{proxy_id}/getItemId")
    public JsonNode getItemId(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String return_string = item.getItemId();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/ItemService/{proxy_id}/getListPrice")
    public JsonNode getListPrice(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        BigDecimal return_bigdecimal = item.getListPrice();
        ((ObjectNode)return_node).put("return", return_bigdecimal);
        return return_node;
    }

    @GetMapping("/ItemService/{proxy_id}/getProduct")
    public JsonNode getProduct(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        Product return_product = item.getProduct();
        ((ObjectNode)return_node).put("return", InstanceDatabase.addProduct(return_product));
        return return_node;
    }

    @GetMapping("/ItemService/{proxy_id}/getQuantity")
    public JsonNode getQuantity(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        int return_int = item.getQuantity();
        ((ObjectNode)return_node).put("return", return_int);
        return return_node;
    }

    @GetMapping("/ItemService/{proxy_id}/getStatus")
    public JsonNode getStatus(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String return_string = item.getStatus();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/ItemService/{proxy_id}/getSupplierId")
    public JsonNode getSupplierId(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        int return_int = item.getSupplierId();
        ((ObjectNode)return_node).put("return", return_int);
        return return_node;
    }

    @GetMapping("/ItemService/{proxy_id}/getUnitCost")
    public JsonNode getUnitCost(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        BigDecimal return_bigdecimal = item.getUnitCost();
        ((ObjectNode)return_node).put("return", return_bigdecimal);
        return return_node;
    }

    @PostMapping("/ItemService/{proxy_id}/setAttribute1")
    public JsonNode setAttribute1(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String attribute1 = node.get("attribute1").asText();
        item.setAttribute1(attribute1);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/ItemService/{proxy_id}/setAttribute2")
    public JsonNode setAttribute2(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String attribute2 = node.get("attribute2").asText();
        item.setAttribute2(attribute2);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/ItemService/{proxy_id}/setAttribute3")
    public JsonNode setAttribute3(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String attribute3 = node.get("attribute3").asText();
        item.setAttribute3(attribute3);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/ItemService/{proxy_id}/setAttribute4")
    public JsonNode setAttribute4(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String attribute4 = node.get("attribute4").asText();
        item.setAttribute4(attribute4);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/ItemService/{proxy_id}/setAttribute5")
    public JsonNode setAttribute5(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String attribute5 = node.get("attribute5").asText();
        item.setAttribute5(attribute5);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/ItemService/{proxy_id}/setItemId")
    public JsonNode setItemId(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String itemId = node.get("itemId").asText();
        item.setItemId(itemId);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/ItemService/{proxy_id}/setListPrice")
    public JsonNode setListPrice(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        BigDecimal listPrice = new BigDecimal(node.get("listPrice").asText());
        item.setListPrice(listPrice);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/ItemService/{proxy_id}/setProduct")
    public JsonNode setProduct(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        Product product = InstanceDatabase.getProduct(node.get("product").asInt());
        item.setProduct(product);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/ItemService/{proxy_id}/setQuantity")
    public JsonNode setQuantity(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        int quantity = node.get("quantity").asInt();
        item.setQuantity(quantity);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/ItemService/{proxy_id}/setStatus")
    public JsonNode setStatus(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String status = node.get("status").asText();
        item.setStatus(status);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/ItemService/{proxy_id}/setSupplierId")
    public JsonNode setSupplierId(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        int supplierId = node.get("supplierId").asInt();
        item.setSupplierId(supplierId);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/ItemService/{proxy_id}/setUnitCost")
    public JsonNode setUnitCost(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        BigDecimal unitCost = new BigDecimal(node.get("unitCost").asText());
        item.setUnitCost(unitCost);
        // No need to prepare a void type.;
        return return_node;
    }

    @GetMapping("/ItemService/{proxy_id}/toString")
    public JsonNode toString(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Item item = InstanceDatabase.getItem(proxy_id);
        String return_string = item.toString();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }
}

