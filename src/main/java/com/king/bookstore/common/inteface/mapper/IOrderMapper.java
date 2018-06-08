package com.king.bookstore.common.inteface.mapper;

import com.king.bookstore.common.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

//订单接口
public interface IOrderMapper {

    /**
     * 取消订单
     * @param uid 用户ID
     * @param order_id 订单编号
     * @return TRUE FALSE
     */
    public boolean cancelOrder(@Param("uid") Integer uid, @Param("order_id") String order_id);

    /**
     * 根据用户ID返回存储有用户购买记录的集合
     * @param uid 用户ID
     * @return 存储有记录的集合
     */
    List<Order> selectByUserId(Integer uid);

    /**
     * 插入订单
     * @param record 订单
     * @return
     */
    int insertOrder(Order record);
    /**
     * 返回未评论的订单
     * @return
     */
    public List<Order> selectUncommentOrder(@Param("uid") int uid,@Param("order_flag") int order_flag);
    /**
     * 修改订单状态
     * @param order_id
     * @param order_flag
     * @return
     */
    public boolean changeOrderFlag(@Param("order_id") String order_id,@Param("order_flag")int order_flag);


    /**
     * 获取当前最新插入的订单
     * @return
     */
    public String selectBigId();

    /**
     * 根据主键查询订单
     * @param id
     * @return
     */
    public Order selectByPrimaryKey(String id);

    /**
     * 获取订单的数量
     * @return
     */
    public int getOrderCount(@Param("userId") int userId);

    /**
     * 查询所有的订单
     * @return
     */
    public List<Order> selectAllOrder(Map<String,String> map);


    /**
     * 查询所有的订单
     * @return
     */
    public List<Order> selectAllOrderByUserId(@Param("userId") int userId);
    /**
     * 查询所有订单的数量
     * @return
     */
    public int queryAllOrderAmount();

    /**
     * 根据id删除订单
     * @param id
     * @return
     */
    public boolean deleteOrderById(@Param("id") int id);

    /**
     * 修改是否发货的状态
     * @param id
     * @param status
     * @return
     */
    public boolean updateIsShipStatus(@Param("id")int id,@Param("status")int status);

    /**
     * 修改是否收货的状态
     * @param id
     * @param status
     * @return
     */
    public boolean updateIsReceiptStatus(@Param("id")int id,@Param("status")int status);

//    public int updateByOrderNumSelective(String orderNum);
    //    int deleteByPrimaryKey(Integer id);
    //    int insertSelective(Order record);
    //    int updateByPrimaryKey(Order record);
    //    Order selectByUserIdAndOrderNo(Integer userId,Long orderNo);
    //    Order selectByOrderNo(Long orderNo);
}
