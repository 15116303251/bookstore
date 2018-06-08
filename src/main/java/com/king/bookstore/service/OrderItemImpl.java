package com.king.bookstore.service;

import com.king.bookstore.common.inteface.bo.IOrderItemBo;
import com.king.bookstore.common.inteface.service.IOrderItemService;
import com.king.bookstore.common.pojo.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemImpl implements IOrderItemService {

    @Autowired
    IOrderItemBo iOrderItemBo;
    @Override
    public void insertAll(List<OrderItem> orderItemList) {

    }

    @Override
    public List<OrderItem> selectOrderItemByOrderId(String orderId) {
        return iOrderItemBo.selectOrderItemByOrderId(orderId);
    }
}
