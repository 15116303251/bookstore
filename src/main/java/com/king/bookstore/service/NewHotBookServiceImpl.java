package com.king.bookstore.service;

import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.inteface.bo.INewHotBookBo;
import com.king.bookstore.common.inteface.service.INewHotBookService;
import com.king.bookstore.common.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewHotBookServiceImpl implements INewHotBookService {

    @Autowired
    INewHotBookBo iNewHotBookBo;

    @Override
    public PageInfo queryNewHotBook(String type, int pageNum) {
        return iNewHotBookBo.queryNewHotBook(type,pageNum);
    }

    @Override
    public boolean insertNewBook(Book book) {
        return iNewHotBookBo.insertNewBook(book);
    }

    @Override
    public boolean updateNewBook(Book book) {
        return iNewHotBookBo.updateNewBook(book);
    }

    @Override
    public boolean deleteNewBook(Book book) {
        return iNewHotBookBo.deleteNewBook(book);
    }

    @Override
    public boolean updateNewBookAfterPay(int bookId, int bDBid, int num) {
        return iNewHotBookBo.updateNewBookAfterPay(bookId,bDBid,num);
    }

    @Override
    public int findNewBook(int bookId, int bDBid, int num) {
        return iNewHotBookBo.findNewBook(bookId, bDBid, num);
    }
}
