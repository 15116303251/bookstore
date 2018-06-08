package com.king.bookstore.common.inteface.mapper;

import com.king.bookstore.common.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IExclusivePushMapper {

    public List<Book> queryExclusivePush(@Param("type")String type);

    //    -----------------------------------------------------------------------------------------------------------独家推荐

    public List<Book> getRecommendList();

    public boolean updateRecommend(Book book);

    public boolean deleteRecommend(Book book);

    public boolean addRecommend(Book book);

    public int getRecommendAmount();
}
