package com.king.bookstore.service;

import com.github.pagehelper.PageHelper;
import com.king.bookstore.BookstoreApplication;
import com.king.bookstore.common.inteface.bo.IUserBo;
import com.king.bookstore.common.inteface.mapper.IUserMapper;
import com.king.bookstore.common.pojo.Account;
import com.king.bookstore.common.pojo.AccountExample;
import com.king.bookstore.utils.PageUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//// 指定我们SpringBoot工程的Application启动类
@SpringBootTest(classes=BookstoreApplication.class)
///由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class UserServiceImplTest {

    @Autowired
    IUserBo userMapper;

//    @Test
//    public void getUserPages() {
//        PageUtils page=new PageUtils();
//        PageUtils pageUtils=userMapper.getUserPages(page);
//        System.out.println(pageUtils.getList().size());
//    }

    @Test
    public void updateAccountById(){
        userMapper.updateAccountById(12,0);
    }
}