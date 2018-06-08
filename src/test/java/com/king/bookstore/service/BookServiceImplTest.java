package com.king.bookstore.service;

import com.king.bookstore.BookstoreApplication;
import com.king.bookstore.common.inteface.service.IBookService;
import com.king.bookstore.utils.PageUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.Map;
@RunWith(SpringJUnit4ClassRunner.class)
//// 指定我们SpringBoot工程的Application启动类
@SpringBootTest(classes=BookstoreApplication.class)
///由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class BookServiceImplTest {

    @Autowired
    IBookService iBookService;
//    @Test
//    public void goBookPages() {
//        PageUtils page=new PageUtils();
//        Map map=new HashMap();
//        map.put("bookName",111);
//        map.put("author","");
//        map.put("bDBid","");
//        map.put("publish",null);
//        PageUtils page1=iBookService.goBookPages(page,map);
//        System.out.println(page1.getList().size());
//    }


    @Test
    public void goBookPages1() {

        Map map=new HashMap();
        PageUtils pageUtils=new PageUtils("1");
        map.put("bookName",null);
        map.put("author",null);
        map.put("bDBid","111");
        map.put("publish",null);
        PageUtils pageUtils1=iBookService.goBookPages(pageUtils,map);
        System.out.println(pageUtils.getList().size());
    }
}