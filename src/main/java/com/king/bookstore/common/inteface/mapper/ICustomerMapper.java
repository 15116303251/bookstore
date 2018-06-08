package com.king.bookstore.common.inteface.mapper;

import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.common.pojo.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

//收货人地址的接口
public interface ICustomerMapper {

    /**
     * 通过收货人id来查找收货人的详细信息
     * @param customer_id 收货人id (唯一)
     * @return Customer收货人信息
     */
    public Customer selectByPrimaryKey(int customer_id);
    /**
     * 通过用户id来查找该用户的默认收货人
     * @param uid
     * @return Customer收货人信息
     */
    public Customer selectDefaultByUserId(@Param("uid") int uid, @Param("customerFlag") int customerFlag);
    /**
     * 通过用户id来得到该用户收货人信息放入list
     * @param user_id
     * @return 收货人list
     */
    public List<Customer> selectCustomerByUserId(int user_id);
    /**
     * 设置用户的属性将传入的用户设为默认用户
     * @param customer_id
     * @param user_id
     * @return 是否设置成功
     */
    public int setDefaultCustomer(@Param("user_id") int user_id,@Param("customerId") int customerId);

    /**
     * 获取地址中不是默认的地址
     * @param user_id
     * @return
     */
    public List<Customer> selectCustomerUncheckedByUserId(int user_id);
    /**
     * 添加收货人
     * @param customer
     * @return
     */
    public int addCustomer(Customer customer);
    /**
     * 找出该用户最新添加的收货人
     * @param userId
     * @return
     */
    public int customerIdNewInsert(int userId);
    /**
     * 删除收货人
     * @param customerId
     * @return
     */
    public int deleteCustomer(int customerId);
    /**
     * 更新收货人
     * @param customer
     * @return
     */
    public int updateCustomer(Customer customer);

    public int updateCustomerStatus(Customer customer);
    /**
     * 根据产品ID与用户ID去查该产品有没有被收藏
     * @param product_id 产品ID
     * @return TRUE FALSE
     */
    boolean findCollection(String product_id,int user_id);

    /**
     * 将收藏的产品添加到数据库中
     * @param user_id 用户ID
     * @param product_id 产品ID
     * @param date 插入日期
     * @return TRUE FALSE
     */
    boolean insertCollection(int user_id,String product_id,Date date);

    /**
     * 根据用户ID获取用户收藏的产品
     * @param user_id 用户ID
     * @return 一个包含收藏产品的集合
     */
    List<Book> listMyCollection(int user_id);

    /**
     * 根据用户ID以及产品ID删除用户收藏的商品
     * @param userId 用户ID
     * @param productId 产品ID
     * @return TRUE FALSE
     */
    public boolean deleteConnection(int userId,String productId);

    /**
     * 根据用户ID以及产品ID来查询用户收藏商品的数量
     * @param userId 用户ID
     * @return 收藏产品的数量
     */
    public int getAmountCollection(int userId);
}
