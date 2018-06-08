package com.king.bookstore.common.inteface.mapper;

import com.king.bookstore.common.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//购物车的mapper接口
public interface ICartMapper {
    /**
     * 根据主键删除购物车中的记录
     *
     * @param id carID
     * @return
     */
    boolean deleteByPrimaryKey(Integer id);

    /**
     * 往购物车中添加一条记录
     *
     * @param record 一条购物记录
     * @return
     */
    boolean insertCart(Cart record);
//-------------------------------------------------------------------------------------------------------更新购物车商品数量
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
    boolean updateByBookNameUid(@Param("id") int id,@Param("uid") int uid,@Param("num")int num);

    /**
     * 更新数据库中商品的状态
     * @param cartId
     * @return
     */
    boolean updateByCartId(@Param("cartId")int cartId,@Param("flag")int flag);

    /**
     * 更新购物车中所有商品的状态
     * @param uid
     */
    public int updateAllCarGoodStatus(@Param("uid")int uid,@Param("flag")int flag);
    /**
     * 根据用户ID与产品ID选择购物车中某条记录
     *
     * @param uid    用户ID
     * @param productId 产品ID
     * @return
     */
    Cart selectCartByUserIdProductId(@Param("uid") Integer uid, @Param("productId") Integer productId);

    /**
     * 根据用户ID选择购物车中该用户下的所有商品
     *
     * @param uid 用户ID
     * @return
     */
    List<Cart> selectCartByUserId(@Param("uid") Integer uid);

    /**
     * 根据用户ID与产品ID删除购物车中某条记录
     *
     * @param uid    用户ID
     * @param productId 产品ID
     * @return
     */
    boolean deleteByUserIdProductIds(@Param("uid") Integer uid, @Param("productId") Integer productId);

    /**
     * 根据用户ID返回购物车中被选中的记录的集合
     *
     * @param uid 用户ID
     * @return
     */
    List<Cart> selectCheckedCartByUserId(@Param("uid") Integer uid,@Param("goodsChecked")Integer goodsChecked);

    /**
     * 根据用户ID查询购物车记录的数量
     *
     * @param userId 用户ID
     * @return
     */
    int selectCartProductCount(@Param("uid") Integer userId);

    /**
     * 获取购物车中商品的金额
     * @param uid
     * @param flag
     * @return
     */
    List<Cart> getCartMontyAmount(@Param("uid")int uid,@Param("flag")int flag);

    /**
     * 根据购物车id删除商品
     * @param id
     * @return
     */
    public boolean deleteByPrimaryKey(@Param("id")int id);

//  boolean insertSelective(Cart record);
//  根据用户id查询购物车中产品
    Cart selectByPrimaryKey(@Param("carId") Integer carId);
//  int updateByPrimaryKeySelective(Cart record);
//  boolean checkedOrUncheckedProduct(Integer userId,Integer productId,Integer checked);
//  boolean  selectCartProductCheckedStatusByUserId(Integer userId);}
}
