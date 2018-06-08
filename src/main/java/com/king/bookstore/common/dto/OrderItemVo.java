package com.king.bookstore.common.dto;

//订单中子项的展示类
public class OrderItemVo {

    // 订单编号
    private String orderId;
    //产品编号
    private Integer goodsId;
    //产品名称
    private String goodsName;
    //产品图片
    private String goodsImg;
    //商品下单时价格
    private double goodsPrice;
    //下单数量
    private int goodsNum;
    //商品下单时价格*下单数量
    private double product_totalPrice;
    // 下单时间
    private String createTime;

    public OrderItemVo(String orderId, Integer goodsId, String goodsName, String goodsImg, double goodsPrice, int goodsNum, double product_totalPrice, String createTime) {
        this.orderId = orderId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsImg = goodsImg;
        this.goodsPrice = goodsPrice;
        this.goodsNum = goodsNum;
        this.product_totalPrice = product_totalPrice;
        this.createTime = createTime;
    }

    public OrderItemVo() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public double getProduct_totalPrice() {
        return product_totalPrice;
    }

    public void setProduct_totalPrice(double product_totalPrice) {
        this.product_totalPrice = product_totalPrice;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "OrderItemVo{" +
                "orderId='" + orderId + '\'' +
                ", goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsNum=" + goodsNum +
                ", product_totalPrice=" + product_totalPrice +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
