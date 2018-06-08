package com.king.bookstore.common.pojo;

import java.io.Serializable;

public class Content implements Serializable{

    private Integer id;
    private String content;
    private Integer flag;
    private String href;

    public Content(String content) {
        this.content = content;
    }

    public Content(String content, String href) {
        this.content = content;
        this.href = href;
    }

    public Content() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
