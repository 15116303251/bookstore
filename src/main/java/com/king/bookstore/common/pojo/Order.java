package com.king.bookstore.common.pojo;

/**
 * 订单表
 * @author Administrator
 *
 */
public class Order {

    //订单编号
	private int id;
	private String orderNumber;
	//用户id
	private Integer uid;
	//支付总额
	private double payPrice;
	//是否已支付
	private Integer isPay;
	//付款时间
	private String payTime;
	//是否已发货
	private Integer isShip;
	//发货时间
	private String shipTime;
	//是否已接收
	private Integer isReceipt;
	//收货时间
	private String receiptTime;
	//快递单号
	private String shipNumber;
	//订单状态
	private Integer status;
	//订单创建时间
	private String createTime;
	//订单更新时间
	private String updateTime;
	//译站编号
	private Integer stageCode;

	public Order(){}

	public Order(String orderNumber, Integer uid, double payPrice, Integer isPay, String payTime, Integer isShip, String shipTime, Integer isReceipt, String receiptTime, String shipNumber, Integer status, String createTime, String updateTime, Integer stageCode) {
		this.orderNumber = orderNumber;
		this.uid = uid;
		this.payPrice = payPrice;
		this.isPay = isPay;
		this.payTime = payTime;
		this.isShip = isShip;
		this.shipTime = shipTime;
		this.isReceipt = isReceipt;
		this.receiptTime = receiptTime;
		this.shipNumber = shipNumber;
		this.status = status;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.stageCode = stageCode;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public double getPayPrice() {
		return payPrice;
	}

	public void setPayPrice(double payPrice) {
		this.payPrice = payPrice;
	}

	public Integer getIsPay() {
		return isPay;
	}

	public void setIsPay(Integer isPay) {
		this.isPay = isPay;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public Integer getIsShip() {
		return isShip;
	}

	public void setIsShip(Integer isShip) {
		this.isShip = isShip;
	}

	public String getShipTime() {
		return shipTime;
	}

	public void setShipTime(String shipTime) {
		this.shipTime = shipTime;
	}

	public Integer getIsReceipt() {
		return isReceipt;
	}

	public void setIsReceipt(Integer isReceipt) {
		this.isReceipt = isReceipt;
	}

	public String getReceiptTime() {
		return receiptTime;
	}

	public void setReceiptTime(String receiptTime) {
		this.receiptTime = receiptTime;
	}

	public String getShipNumber() {
		return shipNumber;
	}

	public void setShipNumber(String shipNumber) {
		this.shipNumber = shipNumber;
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

	public Integer getStageCode() {
		return stageCode;
	}

	public void setStageCode(Integer stageCode) {
		this.stageCode = stageCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Order{" +
				"orderNumber=" + orderNumber +
				", uid=" + uid +
				", payPrice=" + payPrice +
				", isPay=" + isPay +
				", payTime='" + payTime + '\'' +
				", isShip=" + isShip +
				", shipTime='" + shipTime + '\'' +
				", isReceipt=" + isReceipt +
				", receiptTime='" + receiptTime + '\'' +
				", shipNumber='" + shipNumber + '\'' +
				", status=" + status +
				", createTime='" + createTime + '\'' +
				", updateTime='" + updateTime + '\'' +
				", stageCode=" + stageCode +
				'}';
	}
}