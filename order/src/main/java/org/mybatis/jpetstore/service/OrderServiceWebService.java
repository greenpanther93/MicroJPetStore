package org.mybatis.jpetstore.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderServiceWebService {
    private ObjectNode xx;
    
    @Autowired
    private IOrderService orderService;

    @GetMapping("/OrderServiceService/")
    public int createOrderService() {
        return 0;
    }

    @PostMapping("/OrderServiceService/{proxy_id}/getNextId")
    public JsonNode getNextId(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrderService orderservice = InstanceDatabase.getOrderService(proxy_id);
        String name = node.get("name").asText();
        int return_int = orderservice.getNextId(name);
        ((ObjectNode)return_node).put("return", return_int);
        return return_node;
    }

    @Transactional
    @PostMapping("/OrderServiceService/{proxy_id}/getOrder")
    public JsonNode getOrder(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrderService orderservice = InstanceDatabase.getOrderService(proxy_id);
        int orderId = node.get("orderId").asInt();
        IOrder return_order = orderservice.getOrder(orderId);
        ((ObjectNode)return_node).put("return", InstanceDatabase.addOrder(return_order));
        return return_node;
    }

    @PostMapping("/OrderServiceService/{proxy_id}/getOrdersByUsername")
    public JsonNode getOrdersByUsername(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrderService orderservice = InstanceDatabase.getOrderService(proxy_id);
        String username = node.get("username").asText();
        List<IOrder> return_list = orderservice.getOrdersByUsername(username);
        ArrayNode return_node_list = mapper.createArrayNode();
        ((ObjectNode)return_node).put("return", return_node_list);
        for (IOrder return_list_element : ((Iterable<IOrder>)return_list)) {
            return_node_list.add(InstanceDatabase.addOrder(return_list_element));
        }
        return return_node;
    }

    @Transactional
    @PostMapping("/OrderServiceService/{proxy_id}/insertOrder")
    public JsonNode insertOrder(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrderService orderservice = InstanceDatabase.getOrderService(proxy_id);
        IOrder order = InstanceDatabase.getOrder(node.get("order").asInt());
        orderservice.insertOrder(order);
        // No need to prepare a void type.;
        return return_node;
    }
}

