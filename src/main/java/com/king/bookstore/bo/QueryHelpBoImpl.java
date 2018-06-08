package com.king.bookstore.bo;

import com.king.bookstore.common.dto.BookDto;
import com.king.bookstore.common.inteface.bo.IQueryHelpBo;
import com.king.bookstore.common.inteface.mapper.IQueryHelpMapper;
import com.king.bookstore.common.pojo.QueryHelp;
import com.king.bookstore.utils.AbstractLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueryHelpBoImpl extends AbstractLogger implements IQueryHelpBo {

    @Autowired
    IQueryHelpMapper iQueryHelpMapper;

    @Override
    public QueryHelp queryBDBid(String content) {
        return iQueryHelpMapper.queryBDBid(content);
    }

    @Override
    public boolean insertQueryHelp(BookDto bookDto) {
        return iQueryHelpMapper.insertQueryHelp(bookDto);
    }

    @Override
    public boolean updateQueryHelp(BookDto bookDto) {
        return iQueryHelpMapper.updateQueryHelp(bookDto);
    }
}
