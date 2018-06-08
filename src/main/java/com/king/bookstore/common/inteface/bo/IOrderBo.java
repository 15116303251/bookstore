package com.king.bookstore.common.inteface.bo;

import com.king.bookstore.common.dto.OrderVo;
import com.king.bookstore.common.pojo.Order;
import com.king.bookstore.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IOrderBo {
    /**
     * 创建订单
     */
    public OrderVo createOrder(Integer userId, String desc, int orderGet, String orderGetTime);

    /**
     * 取消订单
     * @param userId 用户ID
     * @param order_id 订单ID
     * @return true,false
     */
    public boolean cancel(Integer userId,String order_id);
    /**
     * 确认订单
     * @param userId
     * @return
     */
    public OrderVo confirmOrder(Integer userId);

    /**
     * 查询所有的订单
     * @return
     */
     public PageUtils selectAllOrder(Map<String,String> map,PageUtils pageUtils);

    /**
     * 查询所有的订单
     * @return
     */
    public List<Order> selectAllOrderByUserId(int userId);

    //选中的ServerResponse getOrderCartProduct(Integer userId);
    // ServerResponse<OrderVo> getOrderDetail(Integer userId, Long orderNo);
    // 分页ServerResponse<PageInfo> getOrderList(Integer userId, int pageNum, int pageSize);
    //ServerResponse pay(Long orderNo, Integer userId, String path);
    //ServerResponse aliCallback(Map<String,String> params);
    //支付状态
    // ServerResponse queryOrderPayStatus(Integer userId,Long orderNo);

    /**
     * 获取订单的数量
     * @return
     */
    public int getOrderCount(@Param("userId") int userId);

    /**
     * 根据id删除订单
     * @param id
     * @return
     */
    public boolean deleteOrderById(int id);

    /**
     * 插入订单
     * @param record 订单
     * @return
     */
    int insertOrder(Order record);

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
}
