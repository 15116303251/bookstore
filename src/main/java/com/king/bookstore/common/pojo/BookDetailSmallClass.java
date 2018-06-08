package com.king.bookstore.common.pojo;

import java.io.Serializable;

public class BookDetailSmallClass implements Serializable{

    private int bDBid;

    private String bDSmallType;

    private int bDSid;

    public BookDetailSmallClass(String bDSmallType, int bDSid) {
        this.bDSmallType = bDSmallType;
        this.bDSid = bDSid;
    }

    public BookDetailSmallClass(){}

    public int getbDBid() {
        return bDBid;
    }

    public void setbDBid(int bDBid) {
        this.bDBid = bDBid;
    }

    public String getbDSmallType() {
        return bDSmallType;
    }

    public void setbDSmallType(String bDSmallType) {
        this.bDSmallType = bDSmallType;
    }

    public int getbDSid() {
        return bDSid;
    }

    public void setbDSid(int bDSid) {
        this.bDSid = bDSid;
    }
}
