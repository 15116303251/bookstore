package com.king.bookstore.common.pojo;

public class Sub {
    //名字
    private String subName;
    //链接
    private String link;

    public Sub(){}

    public Sub(String subName, String link) {
        this.subName = subName;
        this.link = link;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
