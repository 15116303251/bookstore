package com.king.bookstore.common.dto;

import com.king.bookstore.common.pojo.Customer;

import java.util.List;

//用于订单展示的所有信息
public class OrderVo {

    // 订单编号
    private String orderId;
    //该订单需支付金额
    private double payment;
    //邮费
    private double postage;
    //订单状态的具体内容
    private String statusDesc;
    //订单创建时间
    private String orderCreateTime;
    // 客户预约取货时间
    private String orderGetTime;
    //订单的明细
    private List<OrderItemVo> orderItemVoList;
    //收货人
    private Customer address;

    private List<Customer> customers;

    public OrderVo() {
    }

    public OrderVo(String orderId, double payment, double postage, String statusDesc, String orderCreateTime, String orderGetTime, List<OrderItemVo> orderItemVoList, Customer address) {
        this.orderId = orderId;
        this.payment = payment;
        this.postage = postage;
        this.statusDesc = statusDesc;
        this.orderCreateTime = orderCreateTime;
        this.orderGetTime = orderGetTime;
        this.orderItemVoList = orderItemVoList;
        this.address = address;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getPostage() {
        return postage;
    }

    public void setPostage(double postage) {
        this.postage = postage;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public String getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getOrderGetTime() {
        return orderGetTime;
    }

    public void setOrderGetTime(String orderGetTime) {
        this.orderGetTime = orderGetTime;
    }

    public List<OrderItemVo> getOrderItemVoList() {
        return orderItemVoList;
    }

    public void setOrderItemVoList(List<OrderItemVo> orderItemVoList) {
        this.orderItemVoList = orderItemVoList;
    }

    public Customer getAddress() {
        return address;
    }

    public void setAddress(Customer address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrderVo{" +
                "orderId='" + orderId + '\'' +
                ", payment=" + payment +
                ", postage=" + postage +
                ", statusDesc='" + statusDesc + '\'' +
                ", orderCreateTime='" + orderCreateTime + '\'' +
                ", orderGetTime='" + orderGetTime + '\'' +
                ", orderItemVoList=" + orderItemVoList +
                ", address=" + address +
                '}';
    }
}
