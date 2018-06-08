package com.king.bookstore.common.inteface.bo;

import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.utils.PageUtils;
import org.springframework.stereotype.Component;

@Component
public interface IExclusivePushBo {

    public PageInfo queryExclusivePush(String type, int pageNum);

    //--------------------------------------------------------------------------------------------------------------独家推荐

    public PageUtils getRecommendList(PageUtils pageUtils);

    public boolean updateRecommend(Book book);

    public boolean deleteRecommend(Book book);

    public boolean addRecommend(Book book);

    public Integer getRecommendAmount();
}
