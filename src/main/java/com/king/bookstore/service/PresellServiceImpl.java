package com.king.bookstore.service;

import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.dto.BookDto;
import com.king.bookstore.common.inteface.bo.IPresellBo;
import com.king.bookstore.common.inteface.service.IPresellService;
import com.king.bookstore.utils.AbstractLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresellServiceImpl extends AbstractLogger implements IPresellService {

    @Autowired
    IPresellBo iPresellBo;

    @Override
    public PageInfo queryPresellBook(int pageNum) {
        return iPresellBo.queryPresellBook(pageNum) ;
    }

}
