package com.king.bookstore.bo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.inteface.bo.IExclusivePushBo;
import com.king.bookstore.common.inteface.mapper.IExclusivePushMapper;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.utils.AbstractLogger;
import com.king.bookstore.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExclusivePushBoImpl extends AbstractLogger implements IExclusivePushBo {

    @Autowired
    IExclusivePushMapper iExclusivePushMapper;

    @Override
    public PageInfo queryExclusivePush(String type, int pageNum) {
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(pageNum,10);
        List<Book> list=iExclusivePushMapper.queryExclusivePush(type);
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }


    //--------------------------------------------------------------------------------------------------------------独家推荐

    @Override
    public PageUtils getRecommendList(PageUtils pageUtils) {
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(pageUtils.getPage(),pageUtils.getLimit());
        List<Book> bookList=iExclusivePushMapper.getRecommendList();
        int amount=iExclusivePushMapper.getRecommendAmount();
        pageUtils.setList(bookList);
        pageUtils.setCountNum(amount);
        return pageUtils;
    }

    @Override
    public boolean updateRecommend(Book book) {
        return iExclusivePushMapper.updateRecommend(book);
    }

    @Override
    public boolean deleteRecommend(Book book) {
        return iExclusivePushMapper.deleteRecommend(book);
    }

    @Override
    public boolean addRecommend(Book book) {
        return iExclusivePushMapper.addRecommend(book);
    }

    @Override
    public Integer getRecommendAmount() {
        return iExclusivePushMapper.getRecommendAmount();
    }
}
