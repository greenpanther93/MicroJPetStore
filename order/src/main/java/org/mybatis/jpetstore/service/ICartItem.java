package org.mybatis.jpetstore.service;


import java.math.BigDecimal;


public interface ICartItem {
    public boolean isInStock();

    public void setInStock(boolean inStock);

    public BigDecimal getTotal();

    public IItem getItem();

    public void setItem(IItem item);

    public int getQuantity();

    public void setQuantity(int quantity);

    public void incrementQuantity();
}

