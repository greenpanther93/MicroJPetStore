package org.mybatis.jpetstore.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.mybatis.jpetstore.domain.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CategoryWebService {
    private ObjectNode xx;

    @GetMapping("/CategoryService/")
    public int createCategory() {
        Category category = new Category();
        return InstanceDatabase.addCategory(category);
    }

    @GetMapping("/CategoryService/{proxy_id}/getCategoryId")
    public JsonNode getCategoryId(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Category category = InstanceDatabase.getCategory(proxy_id);
        String return_string = category.getCategoryId();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/CategoryService/{proxy_id}/getDescription")
    public JsonNode getDescription(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Category category = InstanceDatabase.getCategory(proxy_id);
        String return_string = category.getDescription();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/CategoryService/{proxy_id}/getName")
    public JsonNode getName(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Category category = InstanceDatabase.getCategory(proxy_id);
        String return_string = category.getName();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @PostMapping("/CategoryService/{proxy_id}/setCategoryId")
    public JsonNode setCategoryId(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Category category = InstanceDatabase.getCategory(proxy_id);
        String categoryId = node.get("categoryId").asText();
        category.setCategoryId(categoryId);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/CategoryService/{proxy_id}/setDescription")
    public JsonNode setDescription(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Category category = InstanceDatabase.getCategory(proxy_id);
        String description = node.get("description").asText();
        category.setDescription(description);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/CategoryService/{proxy_id}/setName")
    public JsonNode setName(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Category category = InstanceDatabase.getCategory(proxy_id);
        String name = node.get("name").asText();
        category.setName(name);
        // No need to prepare a void type.;
        return return_node;
    }

    @GetMapping("/CategoryService/{proxy_id}/toString")
    public JsonNode toString(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        Category category = InstanceDatabase.getCategory(proxy_id);
        String return_string = category.toString();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }
}

