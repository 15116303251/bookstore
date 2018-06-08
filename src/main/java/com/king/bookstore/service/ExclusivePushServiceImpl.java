package com.king.bookstore.service;

import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.inteface.bo.IExclusivePushBo;
import com.king.bookstore.common.inteface.service.IExclusivePushService;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.utils.AbstractLogger;
import com.king.bookstore.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExclusivePushServiceImpl extends AbstractLogger implements IExclusivePushService {

    @Autowired
    IExclusivePushBo iExclusivePushBo;

    @Override
    public PageInfo queryExclusivePush(String type, int pageNum) {
        return iExclusivePushBo.queryExclusivePush(type,pageNum);
    }

    @Override
    public PageUtils getRecommendList(PageUtils pageUtils) {
        return iExclusivePushBo.getRecommendList(pageUtils);
    }

    @Override
    public boolean updateRecommend(Book book) {
        return iExclusivePushBo.updateRecommend(book);
    }

    @Override
    public boolean deleteRecommend(Book book) {
        return iExclusivePushBo.deleteRecommend(book);
    }

    @Override
    public boolean addRecommend(Book book) {
        return iExclusivePushBo.addRecommend(book);
    }
}
