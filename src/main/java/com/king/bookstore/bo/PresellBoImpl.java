package com.king.bookstore.bo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.dto.BookDto;
import com.king.bookstore.common.inteface.bo.IPresellBo;
import com.king.bookstore.common.inteface.mapper.IPresellMapper;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.utils.AbstractLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class PresellBoImpl extends AbstractLogger implements IPresellBo {

    @Autowired
    IPresellMapper iPresellMapper;

    public PageInfo queryPresellBook(int pageNum) {
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(pageNum,1);
        List<BookDto> list=iPresellMapper.queryPresellBook();
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

}
