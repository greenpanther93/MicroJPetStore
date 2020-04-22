package org.mybatis.jpetstore.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.List;

import org.mybatis.jpetstore.domain.Category;
import org.mybatis.jpetstore.domain.Item;
import org.mybatis.jpetstore.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CatalogServiceWebService {
    private ObjectNode xx;
    
    @Autowired
    private ICatalogService catalogService;
    

    @GetMapping("/CatalogServiceService/")
    public int createCatalogService() {
        return InstanceDatabase.addCatalogService(catalogService);
    }

    @PostMapping("/CatalogServiceService/{proxy_id}/getCategory")
    public JsonNode getCategory(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
//        ICatalogService catalogservice = InstanceDatabase.getCatalogService(proxy_id);
        String categoryId = node.get("categoryId").asText(); // TODO Wrong node, and on the other side not get("elements")
        Category return_category = catalogService.getCategory(categoryId);
        ((ObjectNode)return_node).put("return", InstanceDatabase.addCategory(return_category));
        return return_node;
    }

    @GetMapping("/CatalogServiceService/{proxy_id}/getCategoryList")
    public JsonNode getCategoryList(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
//        ICatalogService catalogservice = InstanceDatabase.getCatalogService(proxy_id);
        List<Category> return_list = catalogService.getCategoryList();
        ArrayNode return_node_list = mapper.createArrayNode();
        ((ObjectNode)return_node).put("return", return_node_list);
        for (Category return_list_element : ((Iterable<Category>)return_list)) {
            return_node_list.add(InstanceDatabase.addCategory(return_list_element));
        }
        return return_node;
    }

    @PostMapping("/CatalogServiceService/{proxy_id}/getItem")
    public JsonNode getItem(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        String itemId = node.get("itemId").asText();
        Item return_item = catalogService.getItem(itemId);
        ((ObjectNode)return_node).put("return", InstanceDatabase.addItem(return_item));
        return return_node;
    }

    @PostMapping("/CatalogServiceService/{proxy_id}/getItemListByProduct")
    public JsonNode getItemListByProduct(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        String productId = node.get("productId").asText();
        List<Item> return_list = catalogService.getItemListByProduct(productId);
        ArrayNode return_node_list = mapper.createArrayNode();
        ((ObjectNode)return_node).put("return", return_node_list);
        for (Item return_list_element : ((Iterable<Item>)return_list)) {
            return_node_list.add(InstanceDatabase.addItem(return_list_element));
        }
        return return_node;
    }

    @PostMapping("/CatalogServiceService/{proxy_id}/getProduct")
    public JsonNode getProduct(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
//        ICatalogService catalogservice = InstanceDatabase.getCatalogService(proxy_id);
        String productId = node.get("productId").asText();
        Product return_product = catalogService.getProduct(productId);
        ((ObjectNode)return_node).put("return", InstanceDatabase.addProduct(return_product));
        return return_node;
    }

    @PostMapping("/CatalogServiceService/{proxy_id}/getProductListByCategory")
    public JsonNode getProductListByCategory(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        String categoryId = node.get("categoryId").asText();
        List<Product> return_list = catalogService.getProductListByCategory(categoryId);
        ArrayNode return_node_list = mapper.createArrayNode();
        ((ObjectNode)return_node).put("return", return_node_list);
        for (Product return_list_element : ((Iterable<Product>)return_list)) {
            return_node_list.add(InstanceDatabase.addProduct(return_list_element));
        }
        return return_node;
    }

    @PostMapping("/CatalogServiceService/{proxy_id}/isItemInStock")
    public JsonNode isItemInStock(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        String itemId = node.get("itemId").asText();
        boolean return_boolean = catalogService.isItemInStock(itemId);
        ((ObjectNode)return_node).put("return", return_boolean);
        return return_node;
    }

    @PostMapping("/CatalogServiceService/{proxy_id}/searchProductList")
    public JsonNode searchProductList(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        String keywords = node.get("keywords").asText();
        List<Product> return_list = catalogService.searchProductList(keywords);
        ArrayNode return_node_list = mapper.createArrayNode();
        ((ObjectNode)return_node).put("return", return_node_list);
        for (Product return_list_element : ((Iterable<Product>)return_list)) {
            return_node_list.add(InstanceDatabase.addProduct(return_list_element));
        }
        return return_node;
    }
}

