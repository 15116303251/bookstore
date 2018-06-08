package com.king.bookstore.service;

import com.king.bookstore.BookstoreApplication;
import com.king.bookstore.common.inteface.service.ICustomerService;
import com.king.bookstore.common.pojo.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
//// 指定我们SpringBoot工程的Application启动类
@SpringBootTest(classes=BookstoreApplication.class)
///由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class CustomerServiceImplTest {

    @Autowired
    ICustomerService iCustomerService;

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void selectDefaultByUserId() {
    }

    @Test
    public void selectCustomerByUserId() {
    }

    @Test
    public void setDefaultCustomer() {
        iCustomerService.setDefaultCustomer(1,13);
    }

    @Test
    public void addCustomer() {
    }

    @Test
    public void customerIdNewInsert() {
    }

    @Test
    public void deleteCustomer() {
    }

//    @Test
//    public void updateCustomer() {
//        Customer customer =new Customer(1,"洪冷","12","151","151",3);
//        iCustomerService.updateCustomer(customer);
//    }

    @Test
    public void findCollection() {
    }
}