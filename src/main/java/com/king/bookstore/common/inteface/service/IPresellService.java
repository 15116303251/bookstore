package com.king.bookstore.common.inteface.service;

import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.dto.BookDto;

import java.util.Map;

public interface IPresellService {

    /**
     * 查询所有的预销售书籍
     * @return
     */
    public PageInfo queryPresellBook(int pageNum);

}
