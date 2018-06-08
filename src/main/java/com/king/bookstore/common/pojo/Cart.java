package com.king.bookstore.common.pojo;
//购物车实体类
public class Cart {

    private Integer id;
    private Integer uid;
    private Integer goodsId;
    private Integer num;
    private Integer status;
    private String createTime;
    private String updateTime;
    private Integer goodsChecked;
    private Integer bDBid;
    private double price;

    public Cart(Integer uid, Integer goodsId, Integer num, String createTime, String updateTime) {
        this.uid = uid;
        this.goodsId = goodsId;
        this.num = num;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Cart(){}

    public Integer getbDBid() {
        return bDBid;
    }

    public void setbDBid(Integer bDBid) {
        this.bDBid = bDBid;
    }

    public Integer getGoodsChecked() {
        return goodsChecked;
    }

    public void setGoodsChecked(Integer goodsChecked) {
        this.goodsChecked = goodsChecked;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", uid=" + uid +
                ", goodsId=" + goodsId +
                ", num=" + num +
                ", status=" + status +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", goodsChecked=" + goodsChecked +
                ", bDBid=" + bDBid +
                '}';
    }
}