package org.mybatis.jpetstore.service;


public interface ICategory {
    public String getCategoryId();

    public void setCategoryId(String categoryId);

    public String getName();

    public void setName(String name);

    public String getDescription();

    public void setDescription(String description);

    public String toString();
}

