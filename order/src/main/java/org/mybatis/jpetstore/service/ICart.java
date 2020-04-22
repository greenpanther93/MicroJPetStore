package org.mybatis.jpetstore.service;


import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;


public interface ICart {
    public Iterator<ICartItem> getCartItems();

    public List<ICartItem> getCartItemList();

    public int getNumberOfItems();

    public Iterator<ICartItem> getAllCartItems();

    public boolean containsItemId(String itemId);

    public void addItem(IItem item, boolean isInStock);

    public IItem removeItemById(String itemId);

    public void incrementQuantityByItemId(String itemId);

    public void setQuantityByItemId(String itemId, int quantity);

    public BigDecimal getSubTotal();
}

