package org.mybatis.jpetstore.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.mybatis.jpetstore.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductWebService {
    private ObjectNode xx;

    @GetMapping("/ProductService/")
    public int createProduct() {
        Product product = new Product();
        return InstanceDatabase.addProduct(product);
    }

    @GetMapping("/ProductService/{proxy_id}/getCategoryId")
    public JsonNode getCategoryId(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Product product = InstanceDatabase.getProduct(proxy_id);
        String return_string = product.getCategoryId();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/ProductService/{proxy_id}/getDescription")
    public JsonNode getDescription(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Product product = InstanceDatabase.getProduct(proxy_id);
        String return_string = product.getDescription();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/ProductService/{proxy_id}/getName")
    public JsonNode getName(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Product product = InstanceDatabase.getProduct(proxy_id);
        String return_string = product.getName();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/ProductService/{proxy_id}/getProductId")
    public JsonNode getProductId(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Product product = InstanceDatabase.getProduct(proxy_id);
        String return_string = product.getProductId();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @PostMapping("/ProductService/{proxy_id}/setCategoryId")
    public JsonNode setCategoryId(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Product product = InstanceDatabase.getProduct(proxy_id);
        String categoryId = node.get("categoryId").asText();
        product.setCategoryId(categoryId);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/ProductService/{proxy_id}/setDescription")
    public JsonNode setDescription(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Product product = InstanceDatabase.getProduct(proxy_id);
        String description = node.get("description").asText();
        product.setDescription(description);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/ProductService/{proxy_id}/setName")
    public JsonNode setName(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Product product = InstanceDatabase.getProduct(proxy_id);
        String name = node.get("name").asText();
        product.setName(name);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/ProductService/{proxy_id}/setProductId")
    public JsonNode setProductId(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Product product = InstanceDatabase.getProduct(proxy_id);
        String productId = node.get("productId").asText();
        product.setProductId(productId);
        // No need to prepare a void type.;
        return return_node;
    }

    @GetMapping("/ProductService/{proxy_id}/toString")
    public JsonNode toString(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Product product = InstanceDatabase.getProduct(proxy_id);
        String return_string = product.toString();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }
}

