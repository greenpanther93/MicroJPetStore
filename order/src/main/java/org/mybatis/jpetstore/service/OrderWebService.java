package org.mybatis.jpetstore.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.mybatis.jpetstore.domain.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderWebService {
    private ObjectNode xx;

    @GetMapping("/OrderService/")
    public int createOrder() {
        IOrder order = new Order();
        return InstanceDatabase.addOrder(order);
    }

    @GetMapping("/OrderService/{proxy_id}/getBillAddress1")
    public JsonNode getBillAddress1(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getBillAddress1();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getBillAddress2")
    public JsonNode getBillAddress2(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getBillAddress2();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getBillCity")
    public JsonNode getBillCity(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getBillCity();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getBillCountry")
    public JsonNode getBillCountry(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getBillCountry();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getBillState")
    public JsonNode getBillState(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getBillState();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getBillToFirstName")
    public JsonNode getBillToFirstName(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getBillToFirstName();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getBillToLastName")
    public JsonNode getBillToLastName(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getBillToLastName();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getBillZip")
    public JsonNode getBillZip(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getBillZip();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getCardType")
    public JsonNode getCardType(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getCardType();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getCourier")
    public JsonNode getCourier(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getCourier();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getCreditCard")
    public JsonNode getCreditCard(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getCreditCard();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getExpiryDate")
    public JsonNode getExpiryDate(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getExpiryDate();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getLocale")
    public JsonNode getLocale(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getLocale();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getOrderDate")
    public JsonNode getOrderDate(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        Date return_date = order.getOrderDate();
        ((ObjectNode)return_node).put("return", return_date.toString());
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getOrderId")
    public JsonNode getOrderId(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        int return_int = order.getOrderId();
        ((ObjectNode)return_node).put("return", return_int);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getShipAddress1")
    public JsonNode getShipAddress1(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getShipAddress1();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getShipAddress2")
    public JsonNode getShipAddress2(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getShipAddress2();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getShipCity")
    public JsonNode getShipCity(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getShipCity();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getShipCountry")
    public JsonNode getShipCountry(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getShipCountry();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getShipState")
    public JsonNode getShipState(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getShipState();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getShipToFirstName")
    public JsonNode getShipToFirstName(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getShipToFirstName();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getShipToLastName")
    public JsonNode getShipToLastName(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getShipToLastName();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getShipZip")
    public JsonNode getShipZip(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getShipZip();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getStatus")
    public JsonNode getStatus(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getStatus();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getTotalPrice")
    public JsonNode getTotalPrice(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        BigDecimal return_bigdecimal = order.getTotalPrice();
        ((ObjectNode)return_node).put("return", return_bigdecimal);
        return return_node;
    }

    @GetMapping("/OrderService/{proxy_id}/getUsername")
    public JsonNode getUsername(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String return_string = order.getUsername();
        ((ObjectNode)return_node).put("return", return_string);
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/initOrder")
    public JsonNode initOrder(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        IAccount account = new IAccountImpl(node.get("account").asInt());
        ICart cart = InstanceDatabase.getCart(node.get("cart").asInt());
        order.initOrder(account, cart);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setBillAddress1")
    public JsonNode setBillAddress1(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String billAddress1 = node.get("billAddress1").asText();
        order.setBillAddress1(billAddress1);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setBillAddress2")
    public JsonNode setBillAddress2(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String billAddress2 = node.get("billAddress2").asText();
        order.setBillAddress2(billAddress2);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setBillCity")
    public JsonNode setBillCity(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String billCity = node.get("billCity").asText();
        order.setBillCity(billCity);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setBillCountry")
    public JsonNode setBillCountry(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String billCountry = node.get("billCountry").asText();
        order.setBillCountry(billCountry);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setBillState")
    public JsonNode setBillState(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String billState = node.get("billState").asText();
        order.setBillState(billState);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setBillToFirstName")
    public JsonNode setBillToFirstName(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String billToFirstName = node.get("billToFirstName").asText();
        order.setBillToFirstName(billToFirstName);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setBillToLastName")
    public JsonNode setBillToLastName(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String billToLastName = node.get("billToLastName").asText();
        order.setBillToLastName(billToLastName);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setBillZip")
    public JsonNode setBillZip(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String billZip = node.get("billZip").asText();
        order.setBillZip(billZip);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setCardType")
    public JsonNode setCardType(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String cardType = node.get("cardType").asText();
        order.setCardType(cardType);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setCourier")
    public JsonNode setCourier(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String courier = node.get("courier").asText();
        order.setCourier(courier);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setCreditCard")
    public JsonNode setCreditCard(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String creditCard = node.get("creditCard").asText();
        order.setCreditCard(creditCard);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setExpiryDate")
    public JsonNode setExpiryDate(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String expiryDate = node.get("expiryDate").asText();
        order.setExpiryDate(expiryDate);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setLocale")
    public JsonNode setLocale(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String locale = node.get("locale").asText();
        order.setLocale(locale);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setOrderDate")
    public JsonNode setOrderDate(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        Date orderDate = new Date(Date.parse(node.get("orderDate").asText()));
        order.setOrderDate(orderDate);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setOrderId")
    public JsonNode setOrderId(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        int orderId = node.get("orderId").asInt();
        order.setOrderId(orderId);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setShipAddress1")
    public JsonNode setShipAddress1(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String shipAddress1 = node.get("shipAddress1").asText();
        order.setShipAddress1(shipAddress1);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setShipAddress2")
    public JsonNode setShipAddress2(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String shipAddress2 = node.get("shipAddress2").asText();
        order.setShipAddress2(shipAddress2);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setShipCity")
    public JsonNode setShipCity(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String shipCity = node.get("shipCity").asText();
        order.setShipCity(shipCity);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setShipCountry")
    public JsonNode setShipCountry(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String shipCountry = node.get("shipCountry").asText();
        order.setShipCountry(shipCountry);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setShipState")
    public JsonNode setShipState(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String shipState = node.get("shipState").asText();
        order.setShipState(shipState);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setShipToFirstName")
    public JsonNode setShipToFirstName(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String shipFoFirstName = node.get("shipFoFirstName").asText();
        order.setShipToFirstName(shipFoFirstName);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setShipToLastName")
    public JsonNode setShipToLastName(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String shipToLastName = node.get("shipToLastName").asText();
        order.setShipToLastName(shipToLastName);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setShipZip")
    public JsonNode setShipZip(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String shipZip = node.get("shipZip").asText();
        order.setShipZip(shipZip);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setStatus")
    public JsonNode setStatus(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String status = node.get("status").asText();
        order.setStatus(status);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setTotalPrice")
    public JsonNode setTotalPrice(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        BigDecimal totalPrice = new BigDecimal(node.get("totalPrice").asText());
        order.setTotalPrice(totalPrice);
        // No need to prepare a void type.;
        return return_node;
    }

    @PostMapping("/OrderService/{proxy_id}/setUsername")
    public JsonNode setUsername(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        String username = node.get("username").asText();
        order.setUsername(username);
        // No need to prepare a void type.;
        return return_node;
    }
    
    // TODO implement addLineItem(CartItem)
    
    @PostMapping("/OrderService/{proxy_id}/addLineItem")
    public JsonNode addLineItem(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        ILineItem lineItem = InstanceDatabase.getLineItem(node.get("lineItem").asInt());
        order.addLineItem(lineItem);
        // No need to prepare a void type.;
        return return_node;
    }
    
    @GetMapping("/OrderService/{proxy_id}/getLineItems")
    public JsonNode getLineItems(@PathVariable
    int proxy_id) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        List<ILineItem> return_list = order.getLineItems();
        ArrayNode return_node_list = mapper.createArrayNode();
        ((ObjectNode)return_node).put("return", return_node_list);
        for (ILineItem return_list_element : ((Iterable<ILineItem>)return_list)) {
            return_node_list.add(InstanceDatabase.addLineItem(return_list_element));
        }
        return return_node;
    }
    
    @PostMapping("/OrderService/{proxy_id}/setLineItems")
    public JsonNode setLineItems(@PathVariable
    int proxy_id, @RequestBody
    JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        IOrder order = InstanceDatabase.getOrder(proxy_id);
        List<ILineItem> lineItems = new java.util.ArrayList();
        ArrayNode lineItems_array = (ArrayNode) node.get("lineItems");
        Iterator<JsonNode> lineItems_iterator = lineItems_array.elements();
        while (lineItems_iterator.hasNext()) {
            JsonNode lineItems_node = lineItems_iterator.next();
            ILineItem lineItems_element = InstanceDatabase.getLineItem(lineItems_node.asInt());
            lineItems.add(lineItems_element);
        } 
        order.setLineItems(lineItems);
        // No need to prepare a void type.;
        return return_node;
    }
}

