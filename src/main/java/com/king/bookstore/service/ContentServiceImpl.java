package com.king.bookstore.service;

import com.king.bookstore.common.inteface.bo.IContentBo;
import com.king.bookstore.common.inteface.service.IContentService;
import com.king.bookstore.common.pojo.Content;
import com.king.bookstore.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentServiceImpl implements IContentService{

    @Autowired
    IContentBo iContentBo;

    @Override
    public List<Content> queryContent() {
        return iContentBo.queryContent();
    }

    @Override
    public PageUtils queryContent(PageUtils pageUtils) {
        return iContentBo.queryContent(pageUtils);
    }

    @Override
    public boolean insertContent(Content content) {
        return iContentBo.insertContent(content);
    }

    @Override
    public boolean deleteContent(int id) {
        return iContentBo.deleteContent(id);
    }
}
