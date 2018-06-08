package com.king.bookstore.common.pojo;

import java.io.Serializable;
//收藏表
public class Collection implements Serializable{

    private int id;
    private int bookId;
    private String image;
    private String bookName;
    private String author;
    private int bDBid;
    private int status;
    private int uid;

    public Collection(int bookId, String image, String bookName, String author, int bDBid, int status,int uid) {
        this.bookId = bookId;
        this.image = image;
        this.bookName = bookName;
        this.author = author;
        this.bDBid = bDBid;
        this.status = status;
        this.uid=uid;
    }

    public Collection() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public int getbDBid() {
        return bDBid;
    }

    public void setbDBid(int bDBid) {
        this.bDBid = bDBid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", image='" + image + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", bDBid=" + bDBid +
                ", status=" + status +
                ", uid=" + uid +
                '}';
    }

}