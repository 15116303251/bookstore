package com.king.bookstore.common.pojo;

import java.io.Serializable;

/***
 * 查询帮助的实体类
 */
public class QueryHelp implements Serializable {

    private Integer id;
    private Integer bookId;
    private Integer bDBid;
    private String bookName;
    private String author;
    private String publish;
    private Integer bookCode;

    public QueryHelp(Integer bookId, Integer bDBid, String bookName, String author, String publish,Integer bookCode) {
        this.bookId = bookId;
        this.bDBid = bDBid;
        this.bookName = bookName;
        this.author = author;
        this.publish = publish;
        this.bookCode=bookCode;
    }

    public QueryHelp() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getbDBid() {
        return bDBid;
    }

    public void setbDBid(Integer bDBid) {
        this.bDBid = bDBid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public Integer getBookCode() {
        return bookCode;
    }

    public void setBookCode(Integer bookCode) {
        this.bookCode = bookCode;
    }

    @Override
    public String toString() {
        return "QueryHelp{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", bDBid=" + bDBid +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", bookCode=" + bookCode +
                '}';
    }
}
