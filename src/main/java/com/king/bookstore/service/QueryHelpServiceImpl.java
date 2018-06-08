package com.king.bookstore.service;

import com.king.bookstore.common.dto.BookDto;
import com.king.bookstore.common.inteface.bo.IQueryHelpBo;
import com.king.bookstore.common.inteface.service.IQueryHelpService;
import com.king.bookstore.common.pojo.QueryHelp;
import com.king.bookstore.utils.AbstractLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryHelpServiceImpl extends AbstractLogger implements IQueryHelpService {

    @Autowired
    IQueryHelpBo iQueryHelpBo;

    @Override
    public QueryHelp queryBDBid(String content) {
        return iQueryHelpBo.queryBDBid(content);

    }


    @Override
    public boolean insertQueryHelp(BookDto bookDto) {
        return iQueryHelpBo.insertQueryHelp(bookDto);
    }

    @Override
    public boolean updateQueryHelp(BookDto bookDto) {
        return iQueryHelpBo.updateQueryHelp(bookDto);
    }
}
