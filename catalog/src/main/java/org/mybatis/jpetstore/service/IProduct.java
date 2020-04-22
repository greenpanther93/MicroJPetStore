package org.mybatis.jpetstore.service;


public interface IProduct {
    public String getProductId();

    public void setProductId(String productId);

    public String getCategoryId();

    public void setCategoryId(String categoryId);

    public String getName();

    public void setName(String name);

    public String getDescription();

    public void setDescription(String description);

    public String toString();
}

