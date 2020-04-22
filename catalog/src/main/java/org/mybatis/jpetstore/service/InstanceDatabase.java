package org.mybatis.jpetstore.service;


import java.util.List;

import org.mybatis.jpetstore.domain.Category;
import org.mybatis.jpetstore.domain.Item;
import org.mybatis.jpetstore.domain.Product;


public class InstanceDatabase {
    private static List<Product> products = new java.util.ArrayList<Product>();

    private static List<Item> items = new java.util.ArrayList<Item>();

    private static List<Category> categorys = new java.util.ArrayList<Category>();

    private static List<ICatalogService> catalogservices = new java.util.ArrayList<ICatalogService>();

    public static int addCatalogService(ICatalogService catalogservice) {
        catalogservices.add(catalogservice);
        return catalogservices.size()-1;
    }

    public static ICatalogService getCatalogService(int index) {
        return catalogservices.get(index);
    }

    public static int addCategory(Category category) {
        categorys.add(category);
        return categorys.size()-1;
    }

    public static Category getCategory(int index) {
        return categorys.get(index);
    }

    public static int addItem(Item item) {
        items.add(item);
        return items.size()-1;
    }

    public static Item getItem(int index) {
        return items.get(index);
    }

    public static int addProduct(Product product) {
        products.add(product);
        return products.size()-1;
    }

    public static Product getProduct(int index) {
        return products.get(index);
    }
}

