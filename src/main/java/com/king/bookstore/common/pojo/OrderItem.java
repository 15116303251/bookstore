package com.king.bookstore.common.pojo;
/**
 * 订单子项
 * @author Administrator
 *
 */
public class OrderItem {

	//自增id
	private Integer id;
	//订单编号
    private String orderId;
    //商品编号
    private Integer goodsId ;
    //下单数量
    private int goodsNum;
    //商品下单时价格
    private double goodsPrice;
    //订单的状态
    private Integer status;
    //订单的创建时间
	private String createTime;
	//订单的更新时间
	private String updateTime;
	//商品名称
	private String goodsName;
	//商品图片
    private String image;
    private int bDBid;
    private double discount_price;
	public OrderItem(String orderId, Integer goodsId, int goodsNum, double goodsPrice, Integer status, String createTime) {
		this.orderId = orderId;
		this.goodsId = goodsId;
		this.goodsNum = goodsNum;
		this.goodsPrice = goodsPrice;
		this.status = status;
		this.createTime = createTime;
	}

	public OrderItem(String orderId, Integer goodsId, int goodsNum, double goodsPrice, Integer status, String createTime, String updateTime) {
		this.orderId = orderId;
		this.goodsId = goodsId;
		this.goodsNum = goodsNum;
		this.goodsPrice = goodsPrice;
		this.status = status;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public OrderItem() {}

	public int getbDBid() {
		return bDBid;
	}

	public void setbDBid(int bDBid) {
		this.bDBid = bDBid;
	}


	public double getDiscount_price() {
		return discount_price;
	}

	public void setDiscount_price(double discount_price) {
		this.discount_price = discount_price;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public int getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}

	public double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
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



	@Override
	public String toString() {
		return "OrderItem{" +
				"id=" + id +
				", orderId='" + orderId + '\'' +
				", goodsId=" + goodsId +
				", goodsNum=" + goodsNum +
				", goodsPrice=" + goodsPrice +
				", status=" + status +
				", createTime='" + createTime + '\'' +
				", updateTime='" + updateTime + '\'' +
				", goodsName='" + goodsName + '\'' +
				", image='" + image + '\'' +
				", bDBid=" + bDBid +
				", discount_price=" + discount_price +
				'}';
	}
}