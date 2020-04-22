package org.mybatis.jpetstore.service;


import java.math.BigDecimal;


public interface IItem {
    public String getItemId();

    public void setItemId(String itemId);

    public int getQuantity();

    public void setQuantity(int quantity);

    public int getSupplierId();

    public void setSupplierId(int supplierId);

    public BigDecimal getListPrice();

    public void setListPrice(BigDecimal listPrice);

    public BigDecimal getUnitCost();

    public void setUnitCost(BigDecimal unitCost);

    public String getStatus();

    public void setStatus(String status);

    public String getAttribute1();

    public void setAttribute1(String attribute1);

    public String getAttribute2();

    public void setAttribute2(String attribute2);

    public String getAttribute3();

    public void setAttribute3(String attribute3);

    public String getAttribute4();

    public void setAttribute4(String attribute4);

    public String getAttribute5();

    public void setAttribute5(String attribute5);

    public String toString();
}

