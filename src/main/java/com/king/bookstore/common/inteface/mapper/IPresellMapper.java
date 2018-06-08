package com.king.bookstore.common.inteface.mapper;

import com.king.bookstore.common.dto.BookDto;

import java.util.List;

public interface IPresellMapper {

    /**
     * 查询所有的预销售书籍
     * @return
     */
    public List<BookDto> queryPresellBook();


}
