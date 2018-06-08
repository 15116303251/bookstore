package com.king.bookstore.bo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.inteface.bo.INewHotBookBo;
import com.king.bookstore.common.inteface.mapper.INewHotBookMapper;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.utils.AbstractLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NewHotBookBoImpl extends AbstractLogger implements INewHotBookBo {

    @Autowired
    INewHotBookMapper iNewHotBookMapper;

    @Override
    public PageInfo queryNewHotBook(String type, int pageNum) {
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(pageNum,10);
        List<Book> list=iNewHotBookMapper.queryNewHotBook(type);
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @Override
    public boolean insertNewBook(Book book) {
        return iNewHotBookMapper.insertNewBook(book);
    }

    @Override
    public boolean updateNewBook(Book book) {
        return iNewHotBookMapper.updateNewBook(book);
    }

    @Override
    public boolean deleteNewBook(Book book) {
        return iNewHotBookMapper.deleteNewBook(book);
    }

    @Override
    public boolean updateNewBookAfterPay(int bookId, int bDBid, int num) {
        return iNewHotBookMapper.updateNewBookAfterPay(bookId,bDBid,num);
    }

    @Override
    public int findNewBook(int bookId, int bDBid, int num) {
        return iNewHotBookMapper.findNewBook(bookId, bDBid, num);
    }
}
