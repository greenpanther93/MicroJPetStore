package org.mybatis.jpetstore.wrapper;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ILineItemImpl implements ILineItem {

  private int lineitem_id;

  private String address = "localhost";
  // private String address = "order";
  private String port = "8082";
  private String serviceName = "LineItemService";

  public ILineItemImpl() {
    this.lineitem_id = RestTemplateFormatter.sendCreateHTTPRequest(address, port, serviceName);
  }

  public ILineItemImpl(int lineitem_id) {
    this.lineitem_id = lineitem_id;
  }

  @Override
  public int getOrderId() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(lineitem_id), "getOrderId", null);
    int return_int = return_node.get("return").asInt();
    return return_int;
  }

  @Override
  public void setOrderId(int orderId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("orderId", orderId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(lineitem_id), "setOrderId", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  @Override
  public int getLineNumber() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(lineitem_id), "getLineNumber", null);
    int return_int = return_node.get("return").asInt();
    return return_int;
  }

  @Override
  public void setLineNumber(int lineNumber) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("lineNumber", lineNumber);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(lineitem_id), "setLineNumber", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  @Override
  public String getItemId() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(lineitem_id), "getItemId", null);
    String return_string = return_node.get("return").asText(null);
    return return_string;
  }

  @Override
  public void setItemId(String itemId) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("itemId", itemId);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(lineitem_id), "setItemId", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  @Override
  public BigDecimal getUnitPrice() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(lineitem_id), "getUnitPrice", null);
    BigDecimal return_bigdecimal = new BigDecimal(return_node.get("return").asText(null));
    return return_bigdecimal;
  }

  @Override
  public void setUnitPrice(BigDecimal unitprice) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("unitprice", unitprice);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(lineitem_id), "setUnitPrice", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  @Override
  public BigDecimal getTotal() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(lineitem_id), "getTotal", null);
    BigDecimal return_bigdecimal = new BigDecimal(return_node.get("return").asText(null));
    return return_bigdecimal;
  }

  @Override
  public IItem getItem() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(lineitem_id), "getItem", null);
    IItem return_bigdecimal = new IItemImpl(return_node.get("return").asInt());
    return return_bigdecimal;
  }

  @Override
  public void setItem(IItem item) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("item", ((Proxy) item).getProxyId());
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(lineitem_id), "setItem", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

  @Override
  public int getQuantity() {
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(lineitem_id), "getQuantity", null);
    int return_int = return_node.get("return").asInt();
    return return_int;
  }

  @Override
  public void setQuantity(int quantity) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode param_node = mapper.createObjectNode();
    ((ObjectNode) param_node).put("quantity", quantity);
    JsonNode return_node = RestTemplateFormatter.sendHTTPRequest(address, port, serviceName,
        Integer.toString(lineitem_id), "setOrderId", param_node);
    // No need to prepare a void type.;
    // void return type, so no return statement.;
  }

}
