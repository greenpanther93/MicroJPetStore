package org.mybatis.jpetstore.service;

import java.math.BigDecimal;

public interface ILineItem {

	int getOrderId();

	void setOrderId(int orderId);

	int getLineNumber();

	void setLineNumber(int lineNumber);

	String getItemId();

	void setItemId(String itemId);

	BigDecimal getUnitPrice();

	void setUnitPrice(BigDecimal unitprice);

	BigDecimal getTotal();

	IItem getItem();

	void setItem(IItem item);

	int getQuantity();

	void setQuantity(int quantity);

}