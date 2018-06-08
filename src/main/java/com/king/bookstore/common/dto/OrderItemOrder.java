package com.king.bookstore.common.dto;

import com.king.bookstore.common.pojo.Customer;
import com.king.bookstore.common.pojo.Order;
import com.king.bookstore.common.pojo.OrderItem;

import java.util.List;

/**
 *前端订单查询
 */
public class OrderItemOrder {

    private Order order;

    private List<OrderItem> orderItemList;

    private Customer address;

    public OrderItemOrder(Order order, List<OrderItem> orderItemList, Customer address) {
        this.order = order;
        this.orderItemList = orderItemList;
        this.address = address;
    }

    public OrderItemOrder() {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Customer getAddress() {
        return address;
    }

    public void setAddress(Customer address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrderItemOrder{" +
                "order=" + order +
                ", orderItemList=" + orderItemList +
                ", address=" + address +
                '}';
    }
}
