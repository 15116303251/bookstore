package com.king.bookstore.common.inteface.service;

import com.king.bookstore.common.pojo.Content;
import com.king.bookstore.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IContentService {

    public List<Content> queryContent();

    /**
     * 查询所有的公告
     * @param pageUtils
     * @return
     */
    public PageUtils queryContent(PageUtils pageUtils);

    /**
     * 插入公告
     * @return
     */
    public boolean insertContent(Content content);

    /**
     * 删除公告
     * @return
     */
    public boolean deleteContent(@Param("id")int id);
}
