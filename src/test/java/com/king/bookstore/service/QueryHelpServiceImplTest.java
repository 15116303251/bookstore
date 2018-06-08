package com.king.bookstore.service;

import com.king.bookstore.BookstoreApplication;
import com.king.bookstore.common.inteface.service.IBookService;
import com.king.bookstore.common.inteface.service.IQueryHelpService;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.common.pojo.QueryHelp;
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
public class QueryHelpServiceImplTest {

    @Autowired
    public IQueryHelpService iQueryHelpService;
    @Autowired
    public IBookService iBookService;
    @Test
    public void queryBDBid() {
        QueryHelp q = iQueryHelpService.queryBDBid(" 有效管理的5大兵法（柳传志 俞敏洪做序推荐 孙陶然管理巨著）（团购，请致电010-57993149）");
        System.out.println(q.getbDBid());
        Book book=iBookService.queryBook(q.getBookId(),q.getbDBid());
        System.out.println(book);

    }
}