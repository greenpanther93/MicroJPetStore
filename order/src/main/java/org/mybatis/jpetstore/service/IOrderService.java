package org.mybatis.jpetstore.service;


import java.util.List;


public interface IOrderService {
    public void insertOrder(IOrder order);

    public IOrder getOrder(int orderId);

    public List<IOrder> getOrdersByUsername(String username);

    public int getNextId(String name);
}

