package com.king.bookstore.common.dto;

import com.king.bookstore.common.pojo.BookDetailBigClass;

import java.util.List;

/**
 * 二级 三级分类
 */
public class SmallBigDetail {

    private String bSType;
    private String link;
    private List<BookDetailBigClass> bookDetailBigClassesList;

    public SmallBigDetail(String bSType, List<BookDetailBigClass> bookDetailBigClassesList) {
        this.bSType = bSType;
        this.bookDetailBigClassesList = bookDetailBigClassesList;
    }

    public SmallBigDetail(String bSType, String link, List<BookDetailBigClass> bookDetailBigClassesList) {
        this.bSType = bSType;
        this.link = link;
        this.bookDetailBigClassesList = bookDetailBigClassesList;
    }

    public SmallBigDetail() {
    }

    public String getbSType() {
        return bSType;
    }

    public void setbSType(String bSType) {
        this.bSType = bSType;
    }

    public List<BookDetailBigClass> getBookDetailBigClassesList() {
        return bookDetailBigClassesList;
    }

    public void setBookDetailBigClassesList(List<BookDetailBigClass> bookDetailBigClassesList) {
        this.bookDetailBigClassesList = bookDetailBigClassesList;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
