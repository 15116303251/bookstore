package com.king.bookstore.service;

import com.king.bookstore.common.dto.OrderVo;
import com.king.bookstore.common.inteface.bo.IOrderBo;
import com.king.bookstore.common.inteface.service.IOrderService;
import com.king.bookstore.common.pojo.Order;
import com.king.bookstore.utils.AbstractLogger;
import com.king.bookstore.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl extends AbstractLogger implements IOrderService {

    @Autowired
    IOrderBo iOrderBo;

    @Override
    public OrderVo createOrder(Integer userId, String desc, int orderGet, String orderGetTime) {
        return iOrderBo.createOrder(userId,desc,orderGet,orderGetTime);
    }

    @Override
    public boolean cancel(Integer userId, String order_id) {
        return iOrderBo.cancel(userId,order_id);
    }

    @Override
    public OrderVo confirmOrder(Integer userId) {
        return iOrderBo.confirmOrder(userId);
    }

    @Override
    public PageUtils selectAllOrder(Map<String,String> map,PageUtils pageUtils) {
        return iOrderBo.selectAllOrder(map,pageUtils);
    }

    @Override
    public List<Order> selectAllOrderByUserId(int userId) {
        return iOrderBo.selectAllOrderByUserId(userId);
    }

    @Override
    public int getOrderCount(int userId) {
        return iOrderBo.getOrderCount(userId);
    }

    @Override
    public boolean deleteOrderById(int id) {
        return iOrderBo.deleteOrderById(id);
    }

    @Override
    public int insertOrder(Order record) {
        return iOrderBo.insertOrder(record);
    }

    @Override
    public boolean changeOrderFlag(String order_id, int order_flag) {
        return iOrderBo.changeOrderFlag(order_id,order_flag);
    }

    @Override
    public String selectBigId() {
        return iOrderBo.selectBigId();
    }

    @Override
    public boolean updateIsShipStatus(int id, int status) {
        return iOrderBo.updateIsShipStatus(id,status);
    }

    @Override
    public boolean updateIsReceiptStatus(int id, int status) {
        return iOrderBo.updateIsReceiptStatus(id,status);
    }


}
