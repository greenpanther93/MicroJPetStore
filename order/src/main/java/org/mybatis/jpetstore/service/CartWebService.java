package org.mybatis.jpetstore.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.mybatis.jpetstore.domain.Cart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CartWebService {
    private ObjectNode xx;

    @GetMapping("/CartService/")
    public int createCart() {
        ICart cart = new Cart();
        return InstanceDatabase.addCart(cart);
    }

    @PostMapping("/CartService/{proxy_id}/addItem")
    public JsonNode addItem(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICart cart = InstanceDatabase.getCart(proxy_id);
        IItem item = new IItemImpl(node.get("item").asInt());
        boolean isInStock = node.get("isInStock").asBoolean();
        cart.addItem(item, isInStock);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/CartService/{proxy_id}/containsItemId")
    public JsonNode containsItemId(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICart cart = InstanceDatabase.getCart(proxy_id);
        String itemId = node.get("itemId").asText();
        boolean return_boolean = cart.containsItemId(itemId);
        ((ObjectNode)return_node).put("return", return_boolean);
        return return_node;
    }

    @GetMapping("/CartService/{proxy_id}/getAllCartItems")
    public JsonNode getAllCartItems(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICart cart = InstanceDatabase.getCart(proxy_id);
        Iterator<ICartItem> return_iterator = cart.getAllCartItems();
        ArrayNode return_node_list = mapper.createArrayNode();
        ((ObjectNode)return_node).put("return", return_node_list);
        while (return_iterator.hasNext()) {
        	ICartItem return_iterator_element = return_iterator.next();
            return_node_list.add(InstanceDatabase.addCartItem(return_iterator_element));
        }
        return return_node;
    }

    @GetMapping("/CartService/{proxy_id}/getCartItemList")
    public JsonNode getCartItemList(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICart cart = InstanceDatabase.getCart(proxy_id);
        List<ICartItem> return_list = cart.getCartItemList();
        ArrayNode return_node_list = mapper.createArrayNode();
        ((ObjectNode)return_node).put("return", return_node_list);
        for (ICartItem return_list_element : ((Iterable<ICartItem>)return_list)) {
            return_node_list.add(InstanceDatabase.addCartItem(return_list_element));
        }
        return return_node;
    }

    @GetMapping("/CartService/{proxy_id}/getCartItems")
    public JsonNode getCartItems(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICart cart = InstanceDatabase.getCart(proxy_id);
        Iterator<ICartItem> return_iterator = cart.getCartItems();
        ArrayNode return_node_list = mapper.createArrayNode();
        ((ObjectNode)return_node).put("return", return_node_list);
        while(return_iterator.hasNext()) {
        	ICartItem return_iterator_element = return_iterator.next();
            return_node_list.add(InstanceDatabase.addCartItem(return_iterator_element));
        }
        return return_node;
    }

    @GetMapping("/CartService/{proxy_id}/getNumberOfItems")
    public JsonNode getNumberOfItems(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICart cart = InstanceDatabase.getCart(proxy_id);
        int return_int = cart.getNumberOfItems();
        ((ObjectNode)return_node).put("return", return_int);
        return return_node;
    }

    @GetMapping("/CartService/{proxy_id}/getSubTotal")
    public JsonNode getSubTotal(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICart cart = InstanceDatabase.getCart(proxy_id);
        BigDecimal return_bigdecimal = cart.getSubTotal();
        ((ObjectNode)return_node).put("return", return_bigdecimal);
        return return_node;
    }

    @PostMapping("/CartService/{proxy_id}/incrementQuantityByItemId")
    public JsonNode incrementQuantityByItemId(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICart cart = InstanceDatabase.getCart(proxy_id);
        String itemId = node.get("itemId").asText();
        cart.incrementQuantityByItemId(itemId);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/CartService/{proxy_id}/removeItemById")
    public JsonNode removeItemById(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICart cart = InstanceDatabase.getCart(proxy_id);
        String itemId = node.get("itemId").asText();
        IItem return_item = cart.removeItemById(itemId);
        ((ObjectNode)return_node).put("return", ((Proxy)return_item).getProxyId());
        return return_node;
    }

    @PostMapping("/CartService/{proxy_id}/setQuantityByItemId")
    public JsonNode setQuantityByItemId(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ICart cart = InstanceDatabase.getCart(proxy_id);
        String itemId = node.get("itemId").asText();
        int quantity = node.get("quantity").asInt();
        cart.setQuantityByItemId(itemId, quantity);
        // No need to prepare a void type.;
        return return_node;
    }
}

