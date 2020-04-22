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
package org.mybatis.jpetstore.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.mybatis.jpetstore.domain.LineItem;
import org.mybatis.jpetstore.domain.Order;
import org.mybatis.jpetstore.domain.Sequence;
import org.mybatis.jpetstore.mapper.LineItemMapper;
import org.mybatis.jpetstore.mapper.OrderMapper;
import org.mybatis.jpetstore.mapper.SequenceMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class OrderService.
 *
 * @author Eduardo Macarron
 */
@Service
public class OrderService implements IOrderService {
	
	// FIX commented out itemMapper as it should be a webservice instead
	// ignored for now as it is a dbb connection problem, not a migration problem
//    private final ItemMapper itemMapper;

    private final OrderMapper orderMapper;

    private final SequenceMapper sequenceMapper;

    private final LineItemMapper lineItemMapper;

    //ItemMapper itemMapper, !
    public OrderService(OrderMapper orderMapper, SequenceMapper sequenceMapper, LineItemMapper lineItemMapper) {
//        this.itemMapper = itemMapper;
        this.orderMapper = orderMapper;
        this.sequenceMapper = sequenceMapper;
        this.lineItemMapper = lineItemMapper;
    }

    /**
     * Insert order.
     *
     * @param order
     * 		the order
     */
    @Transactional
    public void insertOrder(IOrder order) {
        order.setOrderId(getNextId("ordernum"));
        order.getLineItems().forEach(( lineItem) -> {
            String itemId = lineItem.getItemId();
            Integer increment = lineItem.getQuantity();
            Map<String, Object> param = new HashMap<>(2);
            param.put("itemId", itemId);
            param.put("increment", increment);
//            itemMapper.updateInventoryQuantity(param);
        });
        orderMapper.insertOrder((Order)order);
        orderMapper.insertOrderStatus((Order)order);
        order.getLineItems().forEach(( lineItem) -> {
            lineItem.setOrderId(order.getOrderId());
            lineItemMapper.insertLineItem(lineItem);
        });
    }

    /**
     * Gets the order.
     *
     * @param orderId
     * 		the order id
     * @return the order
     */
    @Transactional
    public IOrder getOrder(int orderId) {
        IOrder order = orderMapper.getOrder(orderId);
        order.setLineItems((List<ILineItem>)(List<?>)lineItemMapper.getLineItemsByOrderId(orderId));
        order.getLineItems().forEach(( lineItem) -> {
//            IItem item = itemMapper.getItem(lineItem.getItemId());
//            item.setQuantity(itemMapper.getInventoryQuantity(lineItem.getItemId()));
            lineItem.setItem(new IItemImpl());
        });
        return order;
    }

    /**
     * Gets the orders by username.
     *
     * @param username
     * 		the username
     * @return the orders by username
     */
    public List<IOrder> getOrdersByUsername(String username) {
        return (List<IOrder>)(List<?>)orderMapper.getOrdersByUsername(username);
    }

    /**
     * Gets the next id.
     *
     * @param name
     * 		the name
     * @return the next id
     */
    public int getNextId(String name) {
        Sequence sequence = sequenceMapper.getSequence(new Sequence(name, (-1)));
        if (sequence == null) {
            throw new RuntimeException((("Error: A null sequence was returned from the database (could not get next " + name) + " sequence)."));
        }
        Sequence parameterObject = new Sequence(name, ((sequence.getNextId()) + 1));
        sequenceMapper.updateSequence(parameterObject);
        return sequence.getNextId();
    }
}

