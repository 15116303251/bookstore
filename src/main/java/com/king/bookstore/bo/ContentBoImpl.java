package com.king.bookstore.bo;

import com.github.pagehelper.PageHelper;
import com.king.bookstore.common.inteface.bo.IContentBo;
import com.king.bookstore.common.inteface.mapper.IContentMapper;
import com.king.bookstore.common.pojo.Content;
import com.king.bookstore.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContentBoImpl implements IContentBo {

    @Autowired
    IContentMapper iContentMapper;

    @Override
    public List<Content> queryContent() {
        return iContentMapper.queryContent();
    }

    @Override
    public PageUtils queryContent(PageUtils pageUtils) {
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(pageUtils.getPage(),pageUtils.getLimit());
        List<Content> list=iContentMapper.queryContent();
        int amount=iContentMapper.queryContentAmount();
        pageUtils.setList(list);
        pageUtils.setCountNum(amount);
        return pageUtils;
    }

    @Override
    public boolean insertContent(Content content) {
        return iContentMapper.insertContent(content);
    }

    @Override
    public boolean deleteContent(int id) {
        return iContentMapper.deleteContent(id);
    }
}
