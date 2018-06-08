package com.king.bookstore.common.inteface.mapper;

import com.king.bookstore.common.pojo.Content;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IContentMapper {

    /**
     * 查询公告
     * @return
     */
    public List<Content> queryContent();

    /**
     * 查询公告的数量
     * @return
     */
    public int queryContentAmount();

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