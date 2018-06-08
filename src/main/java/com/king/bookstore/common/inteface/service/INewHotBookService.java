package com.king.bookstore.common.inteface.service;

import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.pojo.Book;

public interface INewHotBookService {

    public PageInfo queryNewHotBook(String type, int pageNum);

    public boolean insertNewBook(Book book);

    /**
     * 更新新书
     * @param book
     * @return
     */
    public boolean updateNewBook(Book book);

    /**
     * 删除新书
     * @param book
     * @return
     */
    public boolean deleteNewBook(Book book);

    public boolean updateNewBookAfterPay(int bookId,int bDBid,int num);

    public int findNewBook(int bookId,int bDBid,int num);
}
