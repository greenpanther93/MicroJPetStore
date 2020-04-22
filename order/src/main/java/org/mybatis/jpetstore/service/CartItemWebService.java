package org.mybatis.jpetstore.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.math.BigDecimal;

import org.mybatis.jpetstore.domain.CartItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CartItemWebService {
    private ObjectNode xx;

    @GetMapping("/CartItemService/")
    public int createCartItem() {
        ICartItem cartitem = new CartItem();
        return InstanceDatabase.addCartItem(cartitem);
    }

    @GetMapping("/CartItemService/{proxy_id}/getItem")
    public JsonNode getItem(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICartItem cartitem = InstanceDatabase.getCartItem(proxy_id);
        IItem return_item = cartitem.getItem();
        ((ObjectNode)return_node).put("return", ((Proxy)return_item).getProxyId());
        return return_node;
    }

    @GetMapping("/CartItemService/{proxy_id}/getQuantity")
    public JsonNode getQuantity(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICartItem cartitem = InstanceDatabase.getCartItem(proxy_id);
        int return_int = cartitem.getQuantity();
        ((ObjectNode)return_node).put("return", return_int);
        return return_node;
    }

    @GetMapping("/CartItemService/{proxy_id}/getTotal")
    public JsonNode getTotal(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICartItem cartitem = InstanceDatabase.getCartItem(proxy_id);
        BigDecimal return_bigdecimal = cartitem.getTotal();
        ((ObjectNode)return_node).put("return", return_bigdecimal);
        return return_node;
    }

    @GetMapping("/CartItemService/{proxy_id}/incrementQuantity")
    public JsonNode incrementQuantity(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICartItem cartitem = InstanceDatabase.getCartItem(proxy_id);
        cartitem.incrementQuantity();
        // No need to prepare a void type.;
        return return_node;
    }

    @GetMapping("/CartItemService/{proxy_id}/isInStock")
    public JsonNode isInStock(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICartItem cartitem = InstanceDatabase.getCartItem(proxy_id);
        boolean return_boolean = cartitem.isInStock();
        ((ObjectNode)return_node).put("return", return_boolean);
        return return_node;
    }

    @PostMapping("/CartItemService/{proxy_id}/setInStock")
    public JsonNode setInStock(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICartItem cartitem = InstanceDatabase.getCartItem(proxy_id);
        boolean inStock = node.get("inStock").asBoolean();
        cartitem.setInStock(inStock);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/CartItemService/{proxy_id}/setItem")
    public JsonNode setItem(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICartItem cartitem = InstanceDatabase.getCartItem(proxy_id);
        IItem item = new IItemImpl(node.get("item").asInt());
        cartitem.setItem(item);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/CartItemService/{proxy_id}/setQuantity")
    public JsonNode setQuantity(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICartItem cartitem = InstanceDatabase.getCartItem(proxy_id);
        int quantity = node.get("quantity").asInt();
        cartitem.setQuantity(quantity);
        // No need to prepare a void type.;
        return return_node;
    }
}

