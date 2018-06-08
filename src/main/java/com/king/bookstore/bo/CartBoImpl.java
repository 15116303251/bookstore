package com.king.bookstore.bo;

import com.king.bookstore.common.dto.CartProductVo;
import com.king.bookstore.common.dto.CartVo;
import com.king.bookstore.common.inteface.bo.ICartBo;
import com.king.bookstore.common.inteface.mapper.IBookClassMapper;
import com.king.bookstore.common.inteface.mapper.IBookMapper;
import com.king.bookstore.common.inteface.mapper.ICartMapper;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.common.pojo.Cart;
import com.king.bookstore.common.variable.BookToTableEnum;
import com.king.bookstore.utils.AbstractLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CartBoImpl extends AbstractLogger implements ICartBo {

    @Autowired
    ICartMapper cartMapper;
    @Autowired
    IBookMapper bookMapper;
    @Autowired
    IBookClassMapper bookClassMapper;

    @Override
    public boolean add(Integer user_id, String product_id, Integer product_amount,Integer bDBid,double price) {
        boolean isAdd=false;
        if(product_id == null || product_amount == null||product_amount==0){
            System.out.println("产品id或数量为空");
        }
        //通过用户id和商品id查询 得到Cart对象
        Cart cart=cartMapper.selectCartByUserIdProductId(user_id, Integer.parseInt(product_id));
        //System.out.println(cart);
        if(cart == null){
            //这个产品不在这个购物车里,需要新增一个这个产品的记录
            Cart cartItem = new Cart();
            cartItem.setNum(product_amount);
            cartItem.setGoodsId(Integer.parseInt(product_id));
            cartItem.setUid(user_id);
            cartItem.setbDBid(bDBid);
            cartItem.setPrice(price);
            isAdd=cartMapper.insertCart(cartItem);
        }else{
            logger.info("购物车中已有该商品，进行数量更新");
            //这个产品已经在购物车里了.
            //如果产品已存在,数量相加
            product_amount = cart.getNum()+ product_amount;
            cart.setNum(product_amount);
            cart.setUid(user_id);
            cart.setGoodsId(Integer.parseInt(product_id));
            isAdd=cartMapper.updateByPrimaryKey(cart);
        }
        return isAdd;
    }

    @Override
    public boolean update(Integer user_id, String product_id, Integer product_amount) {
        boolean isUpdate=false;
        if(product_id == null || product_amount == null||product_amount==0){
            System.out.println("产品id或数量为空");
        }
        //通过用户id和商品id查询 得到Cart对象
        Cart cart=cartMapper.selectCartByUserIdProductId(user_id, Integer.parseInt(product_id));
        if(cart != null){
            cart.setNum(product_amount);
        }
        isUpdate=cartMapper.updateByPrimaryKey(cart);
        return isUpdate;
    }

    @Override
    public boolean deleteProduct(Integer user_id, String product_id) {
        boolean isDelete=false;
        isDelete=cartMapper.deleteByUserIdProductIds(user_id,Integer.parseInt(product_id));
        return isDelete;
    }

    @Override
    public CartVo list(Integer userId) {
        CartVo cartVo=getCartVoLimit(userId);
        return cartVo;
    }

    @Override
    public int getCartProductCount(Integer userId) {
        return cartMapper.selectCartProductCount(userId);
    }

    @Override
    public CartVo getCartVoLimit(int userId) {
        //定义一个存储经过变化的数据库购物车对象
        CartVo cartVo=new CartVo();
        //定义一个用来存储从购物车数据库中获取的数据的集合
        List<Cart> cartList=cartMapper.selectCartByUserId(userId);
        //将数据库数据与商品进行连接的结合对象集合
        List<CartProductVo> cpvList=new ArrayList<CartProductVo>();
        //购物车中勾选的商品的总价
        double cartTotalPrice=0;
        //记录读取的数据中被选中
        int rowCount=0;
        if(cartList.size()!=0){
            for (int i = 0; i < cartList.size(); i++) {
                Cart cartItem=cartList.get(i);
                CartProductVo carProductVo=new CartProductVo();
                carProductVo.setCarId(cartItem.getId());
                carProductVo.setUserId(cartItem.getUid());
                carProductVo.setProductId(cartItem.getGoodsId());
                //判断商品表中该ID所对应的商品是否存在
                String bDBigDetail=bookClassMapper.queryBigDetailType(cartItem.getbDBid());
                Book product=bookMapper.queryBook(cartItem.getGoodsId(), BookToTableEnum.getTable(bDBigDetail));

                if(product!=null){//将与商品有关的属性赋值给cpv
                    carProductVo.setProductName(product.getBookName());
                    carProductVo.setDiscountedPrice(product.getDiscountedPrice());
                    carProductVo.setProductOutprice(product.getOriginalPrice());
                    carProductVo.setProductImg(product.getImage());
                    carProductVo.setProductAmount(cartItem.getNum());
                    double product_totalPrice=(cartItem.getNum())*(product.getOriginalPrice())*(product.getDiscountedPrice());
                    carProductVo.setProductTotalPrice(product_totalPrice);
                    carProductVo.setProductChecked(cartItem.getGoodsChecked());
                }
                //将购物车中被选中的商品计算总的金额
                if(cartItem.getGoodsChecked()==1){
                    rowCount+=1;
                    cartTotalPrice+=carProductVo.getProductTotalPrice();
                }
                cpvList.add(carProductVo);
            }
        }
        //将上面的集合配到对象cartVo中
        cartVo.setCartProductVoList(cpvList);
        cartVo.setCartTotalPrice(cartTotalPrice);
        if(cpvList.size()==rowCount){
            cartVo.setAllChecked(true);
        }else {
            cartVo.setAllChecked(false);
        }
        return cartVo;
    }

    @Override
    public boolean updateByPrimaryKey(Cart record) {
        return cartMapper.updateByPrimaryKey(record);
    }

    @Override
    public boolean updateByBookNameUid(int id, int uid, int num) {
        return cartMapper.updateByBookNameUid(id,uid,num);
    }

    @Override
    public boolean updateByCartId(int cartId, int flag) {
        return cartMapper.updateByCartId(cartId,flag);
    }

    @Override
    public double getCartMontyAmount(int uid, int flag) {
        double totalchecked=0.0;
        List<Cart> cartlist=cartMapper.getCartMontyAmount(uid,flag);
        for (Cart cart:cartlist) {
            if(cart.getPrice()!=0.0 && cart.getNum()!=0){
                totalchecked=totalchecked+cart.getNum()*cart.getPrice();
            }else{
                logger.info("价格或数量有误");
                continue;
            }
        }
       totalchecked=Double.parseDouble(String.format("%.2f",totalchecked));
        return totalchecked;
    }

    @Override
    public boolean deleteByPrimaryKey(int id) {
        return cartMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateAllCarGoodStatus(int uid) {
        List<Cart> list=cartMapper.selectCheckedCartByUserId(uid,0);
        if(list.size()>0){
           return cartMapper.updateAllCarGoodStatus(uid,1);
        }else{
           return cartMapper.updateAllCarGoodStatus(uid,0);
        }
    }

    @Override
    public Cart selectByPrimaryKey(Integer carId) {

        Cart cart=cartMapper.selectByPrimaryKey(carId);
        if(cart==null){
            logger.info("购物车中没有此物品");
            return null;
        }else{
             return cart;
        }
    }
}
