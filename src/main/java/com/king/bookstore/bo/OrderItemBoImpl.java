package com.king.bookstore.bo;

import com.github.pagehelper.PageHelper;
import com.king.bookstore.common.inteface.bo.IOrderBo;
import com.king.bookstore.common.inteface.bo.IOrderItemBo;
import com.king.bookstore.common.inteface.mapper.IOrderItemMapper;
import com.king.bookstore.common.pojo.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderItemBoImpl implements IOrderItemBo{

    @Autowired
    IOrderItemMapper iOrderItemMapper;

    @Override
    public void insertAll(List<OrderItem> orderItemList) {

    }

    @Override
    public List<OrderItem> selectOrderItemByOrderId(String OrderId) {
        return iOrderItemMapper.selectOrderItemByOrderId(OrderId);
    }
}
