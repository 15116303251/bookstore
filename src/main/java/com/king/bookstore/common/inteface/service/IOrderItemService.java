package com.king.bookstore.common.inteface.service;

import com.king.bookstore.common.pojo.OrderItem;

import java.util.List;

public interface IOrderItemService {

    /**
     * 插入所有订单中子订单
     * @param orderItemList 子订单集合
     */
    public void insertAll(List<OrderItem> orderItemList);
    /**
     * 通过订单号来查询该订单中的订单项
     * @param OrderId
     * @return
     */
    public List<OrderItem> selectOrderItemByOrderId(String OrderId);
}
