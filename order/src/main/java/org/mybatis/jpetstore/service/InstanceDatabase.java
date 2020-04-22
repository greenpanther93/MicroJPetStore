package org.mybatis.jpetstore.service;


import java.util.List;


public class InstanceDatabase {
    private static List<ICartItem> cartitems = new java.util.ArrayList<ICartItem>();

    private static List<IOrderService> orderservices = new java.util.ArrayList<IOrderService>();

    private static List<IOrder> orders = new java.util.ArrayList<IOrder>();

    private static List<ICart> carts = new java.util.ArrayList<ICart>();

    public static int addCart(ICart cart) {
        carts.add(cart);
        return carts.size()-1;
    }

    public static ICart getCart(int index) {
        return carts.get(index);
    }

    public static int addOrder(IOrder order) {
        orders.add(order);
        return orders.size()-1;
    }

    public static IOrder getOrder(int index) {
        return orders.get(index);
    }

    public static int addOrderService(IOrderService orderservice) {
        orderservices.add(orderservice);
        return orderservices.size()-1;
    }

    public static IOrderService getOrderService(int index) {
        return orderservices.get(index);
    }

    public static int addCartItem(ICartItem cartitem) {
        cartitems.add(cartitem);
        return cartitems.size()-1;
    }

    public static ICartItem getCartItem(int index) {
        return cartitems.get(index);
    }
}

