package com.king.bookstore.service;

import com.king.bookstore.common.dto.CartVo;
import com.king.bookstore.common.inteface.bo.ICartBo;
import com.king.bookstore.common.inteface.service.ICartService;
import com.king.bookstore.common.pojo.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements ICartService {

    @Autowired
    ICartBo cartBo;

    @Override
    public boolean add(Integer user_id, String product_id, Integer product_amount,Integer bDBid,double price) {
        return cartBo.add(user_id,product_id,product_amount,bDBid,price);
    }

    @Override
    public boolean update(Integer user_id, String product_id, Integer product_amount) {
        return cartBo.update(user_id,product_id,product_amount);
    }

    @Override
    public boolean deleteProduct(Integer user_id, String product_id) {
        return cartBo.deleteProduct(user_id,product_id);
    }

    @Override
    public CartVo list(Integer userId) {
        return cartBo.list(userId);
    }

    @Override
    public int getCartProductCount(Integer userId) {
        return cartBo.getCartProductCount(userId);
    }

    @Override
    public CartVo getCartVoLimit(int userId) {
        return cartBo.getCartVoLimit(userId);
    }

    @Override
    public boolean updateByPrimaryKey(Cart record) {
        return cartBo.updateByPrimaryKey(record);
    }

    @Override
    public boolean updateByBookNameUid(int id, int uid, int num) {
        return cartBo.updateByBookNameUid(id,uid,num);
    }

    @Override
    public boolean updateByCartId(int cartId, int flag) {
        return cartBo.updateByCartId(cartId,flag);
    }

    @Override
    public double getCartMontyAmount(int uid, int flag) {
        return cartBo.getCartMontyAmount(uid,flag);
    }

    @Override
    public boolean deleteByPrimaryKey(int id) {
        return cartBo.deleteByPrimaryKey(id);
    }

    @Override
    public int updateAllCarGoodStatus(int uid) {
        return cartBo.updateAllCarGoodStatus(uid);
    }

    @Override
    public Cart selectByPrimaryKey(Integer carId) {
        return cartBo.selectByPrimaryKey(carId);
    }

}
