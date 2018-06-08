package com.king.bookstore.common.inteface.bo;

import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.pojo.Book;
import org.springframework.stereotype.Component;

@Component
public interface INewHotBookBo {

    public PageInfo queryNewHotBook(String type,int pageNum);

    /**
     * 插入新的书籍
     * @param book
     * @return
     */
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
