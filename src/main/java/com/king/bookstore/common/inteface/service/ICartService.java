package com.king.bookstore.common.inteface.service;

import com.king.bookstore.common.dto.CartVo;
import com.king.bookstore.common.pojo.Cart;
import org.apache.ibatis.annotations.Param;

public interface ICartService {
    /**
     * 购物车添加物品
     * @param user_id 用户id
     * @param product_id 商品id
     * @param product_amount 适用于加减情况下购物车数量的调整
     * @return 是否添加成功
     */
    public boolean add(Integer user_id, String product_id, Integer product_amount,Integer bDBid,double price);

    /**
     * 购物车更新物品数量
     * @param user_id 用户id
     * @param product_id 商品id
     * @param product_amount 适用于加减情况下购物车数量的调整
     * @return 是否更新成功
     */
    public boolean update(Integer user_id, String product_id, Integer product_amount);

    /**
     * 购物车删除商品
     * @param user_id 用户id
     * @param product_id 商品id
     * @return 是否删除成功
     */
    public boolean deleteProduct(Integer user_id, String product_id);

    /**
     * 根据用户ID返回cartVo
     * @param userId 用户ID
     * @return
     */
    public CartVo list(Integer userId);
    /**
     * 根据用户ID获取购物车中商品的数量
     * @param userId 用户ID
     * @return 数量
     */
    public int getCartProductCount(Integer userId);

    public CartVo getCartVoLimit(int userId);
    //  public List<CartVo> selectOrUnSelect (Integer userId,Integer productId,Integer checked);

    /**
     * 根据carID修改购物车中产品记录
     *
     * @param record 要修改的产品
     * @return
     */
    boolean updateByPrimaryKey(Cart record);

    /**
     * 根据购物车id与用户id更新数量
     * @param id
     * @param uid
     * @return
     */
    boolean updateByBookNameUid(@Param("id") int id, @Param("uid") int uid, @Param("num")int num);

    /**
     * 更新数据库中商品的状态
     * @param cartId
     * @return
     */
    boolean updateByCartId(@Param("cartId")int cartId,@Param("flag")int flag);

    /**
     * 获取购物车中商品的金额
     * @param uid
     * @param flag
     * @return
     */
    double getCartMontyAmount (int uid,int flag);

    /**
     * 根据购物车id删除商品
     * @param id
     * @return
     */
    public boolean deleteByPrimaryKey(@Param("id")int id);

    /**
     * 更新购物车中所有商品的状态
     * @param uid
     */
    public int updateAllCarGoodStatus(int uid);

    public Cart selectByPrimaryKey(@Param("carId") Integer carId);
}
