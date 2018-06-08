package com.king.bookstore.common.inteface.service;

import com.king.bookstore.common.dto.BookDto;
import com.king.bookstore.common.pojo.QueryHelp;

public interface IQueryHelpService {

    /**
     * 根据查询的内容返回BDBid
     * @param content
     * @return
     */
    public QueryHelp queryBDBid(String content);


    public boolean insertQueryHelp(BookDto bookDto);

    /**
     * 更新查询帮助
     * @param bookDto
     * @return
     */
    public boolean updateQueryHelp(BookDto bookDto);
}
