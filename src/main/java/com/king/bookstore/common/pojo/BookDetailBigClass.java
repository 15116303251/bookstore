package com.king.bookstore.common.pojo;

import java.io.Serializable;

public class BookDetailBigClass implements Serializable{

    private int bDBid;

    private String bDBigDetail;

    private int bSid;

    private int recommendFlag;

    private String link;

    public BookDetailBigClass(String bDBigDetail, int bSid) {
        this.bDBigDetail = bDBigDetail;
        this.bSid = bSid;
    }

    public BookDetailBigClass(String bDBigDetail, int bSid,String link) {
        this.bDBigDetail = bDBigDetail;
        this.bSid = bSid;
        this.link=link;
    }

    public BookDetailBigClass(){}

    public int getbDBid() {
        return bDBid;
    }

    public void setbDBid(int bDBid) {
        this.bDBid = bDBid;
    }

    public String getbDBigDetail() {
        return bDBigDetail;
    }

    public void setbDBigDetail(String bDBigDetail) {
        this.bDBigDetail = bDBigDetail;
    }

    public int getbSid() {
        return bSid;
    }

    public void setbSid(int bSid) {
        this.bSid = bSid;
    }

    public int getRecommendFlag() {
        return recommendFlag;
    }

    public void setRecommendFlag(int recommendFlag) {
        this.recommendFlag = recommendFlag;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
