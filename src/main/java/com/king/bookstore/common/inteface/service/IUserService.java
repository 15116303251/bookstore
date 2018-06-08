package com.king.bookstore.common.inteface.service;

import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.pojo.Account;
import com.king.bookstore.common.pojo.Company;
import com.king.bookstore.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IUserService {

    //------------------------------------------------------------------------------------------------------------------查找区域

    /**
     * 根据用户id获取用户信息
     * @param userId 用户id
     * @return
     */
    public Account queryAccount(Integer userId);

    /**
     * 根据用户姓名以及密码进行查询
     * @param username
     * @param password
     * @return
     */
    public Account queryAccountByNameAndPsd(String username, String password);

    public Company queryErpUserByNameAndPsd(String username, String password);

    public Account queryAccountById(Integer userId);

    //------------------------------------------------------------------------------------------------------------------保存区域

    /**
     * 保存用户
     * @param account
     * @return
     */
    public Integer saveAccount(Account account);

    /**
     * 注册用户
     * @param userPhone 用户电话
     * @param userPsd 用户密码
     * @return
     */
    public String registerUser(Map<String,String>map);

    /**
     * 注册企业用户
     * @param map 存储参数的map
     * @return
     */
    public String erpRegister(Map<String,String> map);
    //------------------------------------------------------------------------------------------------------------------更新区域

    /**
     * 更新用户
     * @param account
     * @return
     */
    public String updateAccount(Account account);

    /**
     * 根据用户ID查询要更新的用户返回界面
     * @param userId 用户ID
     * @return
     */
    public Account updatePage(int userId);

    /**
     * 根据企业用户ID查询要更新的用户返回界面
     * @param erpUserId 用户ID
     * @return
     */
    public Company updateErpPage(int erpUserId);

    /**
     * 更新企业用户
     * @param company
     * @return
     */
    public String  updateErpAccount(Company company);
    //------------------------------------------------------------------------------------------------------------------删除区域

    /**
     * 删除用户
     * @param account
     * @return
     */
    public Integer deleteAccount(Account account);

    /**
     * 根据用户id进行删除
     * @param UserId
     * @returnString
     */
    public String deleteAccountById(int UserId);

    /**
     * 根据企业用户id进行删除
     * @param erpUserId
     * @return
     */
    public String  deleteErpAccountById(@Param("erpUserId") int erpUserId);


    public int batchDelUser(String[] ids);
    /**
     * 获取用户
     * @return
     */
    public PageInfo queryAccountList(Map<String,String> map) ;

//    public Account queryAccountById(@Param("userId")String userId);

    /**
     * 根据企业条件查询企业信息
     * @param map
     * @return
     */
    public PageInfo queryCompanyList(Map<String,String> map);

    //-------------------------------------------------------------------------------------------------------新的后台框架
    /**
     * 获取用户分页数据
     * @param Page
     * @return
     */
    PageUtils getUserPages(PageUtils Page);

    Integer updateAccountById(int userId,Integer userState);
}
