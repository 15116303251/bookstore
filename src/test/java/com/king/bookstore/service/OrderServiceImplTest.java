package com.king.bookstore.service;

import com.king.bookstore.BookstoreApplication;
import com.king.bookstore.common.inteface.service.IOrderItemService;
import com.king.bookstore.common.inteface.service.IOrderService;
import com.king.bookstore.common.variable.Const;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

//// SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringJUnit4ClassRunner.class)
//// 指定我们SpringBoot工程的Application启动类
@SpringBootTest(classes=BookstoreApplication.class)
///由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class OrderServiceImplTest {

    @Autowired
    IOrderService iOrderService;
    @Autowired
    IOrderItemService iOrderItemService;
//    @Test
//    public void getOrderCount() {
//        System.out.println(iOrderService.getOrderCount(1));
//    }


    @Test
    public void test(){
        iOrderService.changeOrderFlag("15267189274541", Const.OrderStatusEnum.PAID.getCode());
    }


}