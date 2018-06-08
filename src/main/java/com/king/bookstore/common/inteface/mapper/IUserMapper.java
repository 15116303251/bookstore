package com.king.bookstore.common.inteface.mapper;

import com.king.bookstore.common.pojo.Account;
import com.king.bookstore.common.pojo.AccountExample;
import com.king.bookstore.common.pojo.Company;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface IUserMapper {

    //------------------------------------------------------------------------------------------------------------------查找区域

    /**
     * 根据用户id获取用户信息
     * @param userId 用户id
     * @return
     */
    public Account queryAccount(int userId);

    /**
     * 根据企业用户id获取用户信息
     * @param erpUserId 用户id
     * @return
     */
    public Company queryErpAccount(int erpUserId);

    /**
     * 根据用户姓名以及密码进行查询
     * @param username
     * @param password
     * @return
     */
//    @Select("SELECT * FROM test.account a WHERE a.UserName=#{username} AND a.UserPassword=#{password}")
    public Account queryAccountByNameAndPsd(@Param("username") String username, @Param("password") String password);
    //------------------------------------------------------------------------------------------------------------------保存区域

    /**
     * 查询erp用户
     * @param username
     * @param password
     * @return
     */
    public Company queryErpAccountByNameAndPsd(@Param("username") String username, @Param("password") String password);

    /**
     * 注册用户
     * @return
     */
    public int registerUser(Map<String,String> map);

    /**
     * 注册企业用户
     * @param map 存储参数的map
     * @return
     */
    public int erpRegister(Map<String,String> map);
    //------------------------------------------------------------------------------------------------------------------更新区域
    /**
     * 根据企业用户id进行删除
     * @param erpUserId
     * @return
     */
    public int  updateErpAccount(@Param("erpUserId") int erpUserId);

    /**
     * 更新用户
     * @param
     * @return
     */
    public int  updateAccountById(@Param("userId")Integer userId,@Param("userState")Integer userState);

    /**
     * 更新用户
     * @param account
     * @return
     */
    public int  updateAccount(Account account);

    /**
     * 更新企业用户
     * @param company
     * @return
     */
    public int  updateErpAccount(Company company);
    //------------------------------------------------------------------------------------------------------------------删除区域

    /**
     * 删除用户
     * @param account
     * @return
     */
    public Integer deleteAccount(Account account);

    /**
     * 根据企业用户id进行删除
     * @param erpUserId
     * @return
     */
    public int  deleteErpAccountById(@Param("erpUserId") int erpUserId);

    /**
     * 根据用户id进行删除
     * @param UserId
     * @return
     */
    public int  deleteAccountById(@Param("UserId") int UserId);

    /**
     * 获取用户
     * @return
     */
    public List<Account> queryAccountList(Account account) ;

    /**
     * 根据用户ID获取用户
     * @param userId
     * @return
     */
    public Account queryAccountById(@Param("userId")Integer userId);

    /**
     * 根据企业条件查询企业信息
     * @param comapny
     * @return
     */
    public List<Company> queryCompanyList(Company comapny);


    //-------------------------------------------------------------------------------------------------------新的后台框架

    /**
     * 获取用户分页数据
     * @return
     */
    List<Account> queryAccountByExample(@Param("example") AccountExample example);

    int countByExample(AccountExample example);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    public int batchDelUser(String[] ids);
}
