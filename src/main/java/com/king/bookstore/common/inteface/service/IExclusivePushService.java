package com.king.bookstore.common.inteface.service;

import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.utils.PageUtils;

public interface IExclusivePushService {

    public PageInfo queryExclusivePush(String type, int pageNum);

    public PageUtils getRecommendList(PageUtils pageUtils);

    public boolean updateRecommend(Book book);

    public boolean deleteRecommend(Book book);

    public boolean addRecommend(Book book);
}
