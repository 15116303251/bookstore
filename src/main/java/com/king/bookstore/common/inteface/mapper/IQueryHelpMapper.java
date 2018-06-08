package com.king.bookstore.common.inteface.mapper;

import com.king.bookstore.common.dto.BookDto;
import com.king.bookstore.common.pojo.QueryHelp;
import org.apache.ibatis.annotations.Param;

/**
 * 搜索协助表
 */
public interface IQueryHelpMapper {

    /**
     * 根据查询的内容返回BDBid
     * @param content
     * @return
     */
    public QueryHelp queryBDBid(@Param("content") String content);

    /**
     *
     * @return
     */
    public boolean insertQueryHelp(BookDto bookDto);

    /**
     * 更新查询帮助
     * @param bookDto
     * @return
     */
    public boolean updateQueryHelp(BookDto bookDto);


}
