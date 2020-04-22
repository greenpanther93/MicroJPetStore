package org.mybatis.jpetstore.service;


import java.util.List;

import org.mybatis.jpetstore.domain.Category;
import org.mybatis.jpetstore.domain.Item;
import org.mybatis.jpetstore.domain.Product;


public interface ICatalogService {
    public List<Category> getCategoryList();

    public Category getCategory(String categoryId);

    public Product getProduct(String productId);

    public List<Product> getProductListByCategory(String categoryId);

    public List<Product> searchProductList(String keywords);

    public List<Item> getItemListByProduct(String productId);

    public Item getItem(String itemId);

    public boolean isItemInStock(String itemId);
}

