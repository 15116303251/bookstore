package com.king.bookstore.service;

import com.king.bookstore.BookstoreApplication;
import com.king.bookstore.common.inteface.service.ICartService;
import com.king.bookstore.common.pojo.Cart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//// 指定我们SpringBoot工程的Application启动类
@SpringBootTest(classes=BookstoreApplication.class)
///由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class CartServiceImplTest {

    @Autowired
    ICartService iCartService;

//    @Test
//    public void updateByPrimaryKey() {
//        Boolean flag=iCartService.updateByBookNameUid(14,1,5);
//        if(flag){
//            System.out.println("update success");
//        }else{
//            System.out.println("update fail");
//        }
//    }
//
//    @Test
//    public void add() {
//        iCartService.add(1,"44",5,105,55);
//    }
    @Test
    public void updateAllCarGoodStatus(){
        iCartService.updateAllCarGoodStatus(1);
    }
}