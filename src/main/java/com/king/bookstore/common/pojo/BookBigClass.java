package com.king.bookstore.common.pojo;

import java.io.Serializable;

public class BookBigClass implements Serializable{

    private int bBid;
    private String bBigType;
    private int recommendFlag;

    public BookBigClass(String bBigType) {
        this.bBigType = bBigType;
    }

    public BookBigClass(){};

    public int getbBid() {
        return bBid;
    }

    public void setbBid(int bBid) {
        this.bBid = bBid;
    }

    public String getbBigType() {
        return bBigType;
    }

    public void setbBigType(String bBigType) {
        this.bBigType = bBigType;
    }

    public int getRecommendFlag() {
        return recommendFlag;
    }

    public void setRecommendFlag(int recommendFlag) {
        this.recommendFlag = recommendFlag;
    }

    @Override
    public String toString() {
        return "BookBigClass{" +
                "bBid=" + bBid +
                ", bBigType='" + bBigType + '\'' +
                ", recommendFlag=" + recommendFlag +
                '}';
    }
}
