package com.king.bookstore.common.inteface.mapper;

import com.king.bookstore.common.pojo.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//订单详情接口
public interface IOrderItemMapper {

    /**
     * 插入所有订单中子订单
     * @param list 子订单集合
     */
    public void insertAll(List<OrderItem> list);
    /**
     * 通过订单号来查询该订单中的订单项
     * @param orderId
     * @return
     */
    public List<OrderItem> selectOrderItemByOrderId(@Param("orderId") String orderId);



}
