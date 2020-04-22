/**
 * Copyright 2010-2018 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.jpetstore.domain;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Optional;
import java.util.function.Function;
import org.mybatis.jpetstore.service.ICartItem;
import org.mybatis.jpetstore.service.IItem;


/**
 * The Class CartItem.
 *
 * @author Eduardo Macarron
 */
public class CartItem implements Serializable , ICartItem {
    private static final long serialVersionUID = 6620528781626504362L;

    private IItem item;

    private int quantity;

    private boolean inStock;

    private BigDecimal total;

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public IItem getItem() {
        return item;
    }

    public void setItem(IItem item) {
        this.item = item;
        calculateTotal();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        calculateTotal();
    }

    public void incrementQuantity() {
        (quantity)++;
        calculateTotal();
    }

    private void calculateTotal() {
        total = Optional.ofNullable(item).map(IItem::getListPrice).map(( v) -> v.multiply(new BigDecimal(quantity))).orElse(null);
    }
}

