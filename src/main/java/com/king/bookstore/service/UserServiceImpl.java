package com.king.bookstore.service;

import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.inteface.bo.IUserBo;
import com.king.bookstore.common.inteface.mapper.IUserMapper;
import com.king.bookstore.common.inteface.service.IUserService;
import com.king.bookstore.common.pojo.Account;
import com.king.bookstore.common.pojo.Company;
import com.king.bookstore.utils.AbstractLogger;
import com.king.bookstore.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl extends AbstractLogger implements IUserService {

    @Autowired
    IUserBo iUserBo;

    @Autowired
    IUserMapper userMapper;

    @Override
    public Account queryAccount(Integer userId) {
        return iUserBo.queryAccountById(userId);
    }

    @Override
    public Account queryAccountByNameAndPsd(String username, String password) {
        return iUserBo.queryAccountByNameAndPsd(username,password);
    }

    @Override
    public Company queryErpUserByNameAndPsd(String username, String password) {
        return iUserBo.queryErpUserByNameAndPsd(username,password);
    }

    @Override
    public Account queryAccountById(Integer userId) {
        return iUserBo.queryAccountById(userId);
    }


    @Override
    public Integer saveAccount(Account account) {
        return null;
    }

    @Override
    public String registerUser(Map<String,String>map) {
        return iUserBo.registerUser(map);
    }

    @Override
    public String erpRegister(Map<String, String> map) {
        return iUserBo.erpRegister(map);
    }

    @Override
    public String updateAccount(Account account) {
        return iUserBo.updateAccount(account);
    }

    @Override
    public Account updatePage(int userId) {
        return iUserBo.updatePage(userId);
    }

    @Override
    public Company updateErpPage(int erpUserId) {
        return iUserBo.updateErpPage(erpUserId);
    }

    @Override
    public String updateErpAccount(Company company) {
        return iUserBo.updateErpAccount(company);
    }

    @Override
    public Integer deleteAccount(Account account) {
        return null;
    }

    @Override
    public String deleteAccountById(int UserId) {
        return iUserBo.deleteAccountById(UserId);
    }

    @Override
    public String deleteErpAccountById(int erpUserId) {
        return iUserBo.deleteErpAccountById(erpUserId);
    }

    public int batchDelUser(String[] ids) {
        return iUserBo.batchDelUser(ids);
    }


    @Override
    public PageInfo queryCompanyList(Map<String, String> map) {
        return iUserBo.queryCompanyList(map);
    }

    @Override
    public PageInfo queryAccountList(Map map) {
        return iUserBo.queryAccountList(map);
    }

    //-------------------------------------------------------------------------------------------------------新的后台框架

    @Override
    public PageUtils getUserPages(PageUtils page) {
        return iUserBo.getUserPages(page);
    }

    @Override
    public Integer updateAccountById(int userId, Integer userState) {
        return iUserBo.updateAccountById(userId,userState);
    }
}
