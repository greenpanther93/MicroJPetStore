package org.mybatis.jpetstore.service;

import java.math.BigDecimal;

import org.mybatis.jpetstore.domain.LineItem;
import org.mybatis.jpetstore.domain.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class LineItemWebService {

	private ObjectNode xx;

    @GetMapping("/LineItemService/")
    public int createOrder() {
        ILineItem lineItem = new LineItem();
        return InstanceDatabase.addLineItem(lineItem);
    }

    @GetMapping("/LineItemService/{proxy_id}/getOrderId")
	public JsonNode getOrderId(@PathVariable
		    int proxy_id) {
    	ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ILineItem lineItem = InstanceDatabase.getLineItem(proxy_id);
		int return_int = lineItem.getOrderId();
		((ObjectNode)return_node).put("return", return_int);
		return return_node;
	}

    @PostMapping("/LineItemService/{proxy_id}/setOrderId")
	public JsonNode setOrderId(@PathVariable
		    int proxy_id, @RequestBody
		    JsonNode node) {
    	ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ILineItem lineItem = InstanceDatabase.getLineItem(proxy_id);
        int orderId = node.get("orderId").asInt();
        lineItem.setOrderId(orderId);
        return return_node;
	}

	@GetMapping("/LineItemService/{proxy_id}/getLineNumber")
	public JsonNode getLineNumber(@PathVariable
		    int proxy_id) {
		ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ILineItem lineItem = InstanceDatabase.getLineItem(proxy_id);
		int return_int = lineItem.getLineNumber();
		((ObjectNode)return_node).put("return", return_int);
		return return_node;
	}

	@PostMapping("/LineItemService/{proxy_id}/setLineNumber")
	public JsonNode setLineNumber(@PathVariable
		    int proxy_id, @RequestBody
		    JsonNode node) {
		ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ILineItem lineItem = InstanceDatabase.getLineItem(proxy_id);
        int lineNumber = node.get("lineNumber").asInt();
        lineItem.setLineNumber(lineNumber);
        return return_node;
	}

	@GetMapping("/LineItemService/{proxy_id}/getItemId")
	public JsonNode getItemId(@PathVariable
		    int proxy_id) {
		ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ILineItem lineItem = InstanceDatabase.getLineItem(proxy_id);
		String return_string = lineItem.getItemId();
		((ObjectNode)return_node).put("return", return_string);
		return return_node;
	}

	@PostMapping("/LineItemService/{proxy_id}/setItemId")
	public JsonNode setItemId(@PathVariable
		    int proxy_id, @RequestBody
		    JsonNode node) {
		ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ILineItem lineItem = InstanceDatabase.getLineItem(proxy_id);
        String itemId = node.get("itemId").asText();
        lineItem.setItemId(itemId);
        return return_node;
	}

	@GetMapping("/LineItemService/{proxy_id}/getUnitPrice")
	public JsonNode getUnitPrice(@PathVariable
		    int proxy_id) {
		ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ILineItem lineItem = InstanceDatabase.getLineItem(proxy_id);
		BigDecimal return_bigdecimal = lineItem.getUnitPrice();
		((ObjectNode)return_node).put("return", return_bigdecimal);
		return return_node;
	}

	@PostMapping("/LineItemService/{proxy_id}/setUnitPrice")
	public JsonNode setUnitPrice(@PathVariable
		    int proxy_id, @RequestBody
		    JsonNode node) {
		ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ILineItem lineItem = InstanceDatabase.getLineItem(proxy_id);
        BigDecimal unitprice = new BigDecimal(node.get("unitprice").asInt());;
        lineItem.setUnitPrice(unitprice);
        return return_node;
	}

	@GetMapping("/LineItemService/{proxy_id}/getTotal")
	public JsonNode getTotal(@PathVariable
			int proxy_id) {
		ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ILineItem lineItem = InstanceDatabase.getLineItem(proxy_id);
        BigDecimal return_bigdecimal = lineItem.getTotal();
        ((ObjectNode)return_node).put("return", return_bigdecimal);
		return return_node;
	}

	@GetMapping("/LineItemService/{proxy_id}/getItem")
	public JsonNode getItem(@PathVariable
		    int proxy_id) {
		ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ILineItem lineItem = InstanceDatabase.getLineItem(proxy_id);
		IItem return_item = lineItem.getItem();
		((ObjectNode)return_node).put("return", ((Proxy)return_item).getProxyId());
		return return_node;
	}

	@PostMapping("/LineItemService/{proxy_id}/setItem")
	public JsonNode setItem(@PathVariable
		    int proxy_id, @RequestBody
		    JsonNode node) {
		ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ILineItem lineItem = InstanceDatabase.getLineItem(proxy_id);
        IItem item = new IItemImpl(node.get("item").asInt());
        lineItem.setItem(item);
        return return_node;
	}

	@GetMapping("/LineItemService/{proxy_id}/getQuantity")
	public JsonNode getQuantity(@PathVariable
		    int proxy_id) {
		ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ILineItem lineItem = InstanceDatabase.getLineItem(proxy_id);
		int return_int = lineItem.getQuantity();
		((ObjectNode)return_node).put("return", return_int);
		return return_node;
	}

	@PostMapping("/LineItemService/{proxy_id}/setQuantity")
	public JsonNode setQuantity(@PathVariable
		    int proxy_id, @RequestBody
		    JsonNode node) {
		ObjectMapper mapper = new ObjectMapper();
        JsonNode return_node = mapper.createObjectNode();
        ILineItem lineItem = InstanceDatabase.getLineItem(proxy_id);
        int quantity = node.get("quantity").asInt();
        lineItem.setQuantity(quantity);
        return return_node;
	}
}
