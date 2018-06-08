package com.king.bookstore.common.pojo;

import java.io.Serializable;

public class BookSmallClass implements Serializable{

    private int bBid;

    private String bSType;

    private int bSid;

    private String  link;

    public BookSmallClass(int bBid, String bSType) {
        this.bBid = bBid;
        this.bSType = bSType;
    }

    public BookSmallClass(int bBid, String bSType, int bSid, String link) {
        this.bSType = bSType;
        this.bSid = bSid;
        this.link = link;
    }

    public BookSmallClass(){}

    public String getbSType() {
        return bSType;
    }

    public void setbSType(String bSType) {
        this.bSType = bSType;
    }

    public int getbSid() {
        return bSid;
    }

    public void setbSid(int bSid) {
        this.bSid = bSid;
    }

    public int getbBid() {

        return bBid;
    }

    public void setbBid(int bBid) {
        this.bBid = bBid;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
