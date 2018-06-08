package com.king.bookstore.bo;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.inteface.bo.IUserBo;
import com.king.bookstore.common.inteface.mapper.IUserMapper;

import com.king.bookstore.common.pojo.Account;
import com.king.bookstore.common.pojo.AccountExample;
import com.king.bookstore.common.pojo.Company;
import com.king.bookstore.utils.AbstractLogger;
import com.king.bookstore.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

@Component
public class UserBoImpl extends AbstractLogger implements IUserBo {

    @Autowired
    private IUserMapper iUserMapper;

    @Override
    public Account queryAccount(Integer userId) {
        return null;
    }

    @Override
    public Account queryAccountByNameAndPsd(String username,String password) {
        Account account=iUserMapper.queryAccountByNameAndPsd(username,password);
        if(account==null){
            logger.info("this user is not exsit");
            return null;
        }else{
            return account;
        }
    }

    @Override
    public Company queryErpUserByNameAndPsd(String username, String password) {
        Company company=iUserMapper.queryErpAccountByNameAndPsd(username,password);
        if(company==null){
            logger.info("this user is not exsit");
            return null;
        }else{
            return company;
        }
    }

    @Override
    public String updateAccount(Account account) {
        return iUserMapper.updateAccount(account)>=1?"success":"error";
    }

    @Override
    public Account updatePage(int userId) {
        Account account=iUserMapper.queryAccount(userId);
        return account;
    }

    @Override
    public Company updateErpPage(int erpUserId) {
        Company company=iUserMapper.queryErpAccount(erpUserId);
        return company;
    }

    @Override
    public String updateErpAccount(Company company) {
        return iUserMapper.updateErpAccount(company)>=1?"success":"error";
    }

    @Override
    public Integer deleteAccount(Account account) {
        return null;
    }

    @Override
    public String deleteAccountById(int UserId) {
         String flag=null;
         int a=iUserMapper.deleteAccountById(UserId);
         if(iUserMapper.deleteAccountById(UserId)>=1){
             logger.info("delete success");
             flag="success";
         }else{
             flag="error";
         }
         return flag;
    }

    @Override
    public String deleteErpAccountById(int erpUserId) {
        String flag=null;
        if(iUserMapper.deleteErpAccountById(erpUserId)>=1){
            logger.info("delete success");
            flag="success";
        }else{
            flag="error";
        }
        return flag;
    }

    @Override
    public int batchDelUser(String[] ids) {
        return iUserMapper.batchDelUser(ids);
    }

    /**
     * 获取用户
     * @return
     */
    public PageInfo queryAccountList(Map<String,String> map){
        PageHelper page=new PageHelper();
        page.startPage(Integer.parseInt(map.get("pageNum")),1);
        Account account=new Account();
        account.setUserTel(map.get("userTel").equals("")?null:map.get("userTel"));
        account.setUserName(map.get("userTel").equals("")?null:map.get("userTel"));
        List<Account> list=iUserMapper.queryAccountList(account);
        PageInfo pageInfo=new PageInfo();
        pageInfo.setList(list);
        return pageInfo;
    }

    @Override
    public Account queryAccountById(Integer userId) {
        return iUserMapper.queryAccountById(userId);
    }

    @Override
    public PageInfo queryCompanyList(Map<String, String> map) {
        PageHelper page=new PageHelper();
        page.startPage(Integer.parseInt(map.get("pageNum")),1);
        Company company=new Company();
        logger.info("erpUserName"+map.get("pageNum"));
        logger.info("erpUserName"+map.get("erpUserName"));
        logger.info("companyName"+map.get("companyName"));
        company.setErpUserName(map.get("erpUserName").equals("")?null:map.get("erpUserName"));
        company.setCompanyName(map.get("companyName").equals("")?null:map.get("companyName"));
        List<Company> list=iUserMapper.queryCompanyList(company);
        PageInfo pageInfo=new PageInfo();
        pageInfo.setList(list);
        return pageInfo;
    }

    @Override
    public PageUtils getUserPages(PageUtils page) {
        AccountExample example = (AccountExample) page.getQueryParames();
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(page.getPage(),page.getLimit());
        List<Account> list=iUserMapper.queryAccountByExample(example);
        int count = iUserMapper.countByExample(example);
        page.setList(list);
        page.setCountNum(count);
        return page;
    }

    @Override
    public Integer updateAccountById(int userId, Integer userState) {
        return iUserMapper.updateAccountById(userId,userState);
    }


    @Override
    public String registerUser(Map<String,String>map) {
        return iUserMapper.registerUser(map)==1?"fontpage/user/fontLogin":"error";
    }

    @Override
    public String erpRegister(Map<String, String> map) {
        return iUserMapper.erpRegister(map)==1?"backpage/backLogin":"error";
    }

    /**
     * 将字符串进行urlEncode的转化
     * @param s
     * @return
     */
    public static String getUrlEncode(String s){
        String s1=null;
        try {
            s1= java.net.URLEncoder.encode(s,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return s1;
    }

}
