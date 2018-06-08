package com.king.bookstore.common.inteface.mapper;

import com.king.bookstore.common.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface INewHotBookMapper {

    /**
     * 根据热门新书的类型查询
     * @param newBookFavorite
     * @return
     */
    public List<Book> queryNewHotBook(@Param("newBookFavorite") String newBookFavorite);

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

    /**
     * 支付之后新书表中数据的修改
     * @param bookId
     * @param bDBid
     * @param num
     * @return
     */
    public boolean updateNewBookAfterPay(@Param("bookId") int bookId,@Param("bDBid") int bDBid,@Param("num") int num);


    /**
     * 查询新书表中是否有该记录
     * @param bookId
     * @param bDBid
     * @param num
     * @return
     */
    public int findNewBook(@Param("bookId") int bookId,@Param("bDBid") int bDBid,@Param("num") int num);
}
