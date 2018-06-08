package com.king.bookstore.common.dto;

/**
 * 
 * @author Administrator
 *
 */
public class CartProductVo {
	
     //结合了产品和购物车的一个抽象对象
    private Integer carId;
    private Integer userId;
    private Integer productId;
    //购物车中此商品的数量
    private Integer productAmount;
    private String productName;
    private String productImg;
    private double productOutprice;
    private Integer productFlag;
    private double productTotalPrice;
    private double discountedPrice;
    //此商品是否勾选
    private Integer productChecked;
    
	public CartProductVo() {
	}

	public CartProductVo(Integer carId, Integer userId, Integer productId, Integer productAmount, String productName, String productImg, double productOutprice, Integer productFlag, double productTotalPrice, Integer productChecked) {
		this.carId = carId;
		this.userId = userId;
		this.productId = productId;
		this.productAmount = productAmount;
		this.productName = productName;
		this.productImg = productImg;
		this.productOutprice = productOutprice;
		this.productFlag = productFlag;
		this.productTotalPrice = productTotalPrice;
		this.productChecked = productChecked;
	}

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(Integer productAmount) {
		this.productAmount = productAmount;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImg() {
		return productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}

	public double getProductOutprice() {
		return productOutprice;
	}

	public void setProductOutprice(double productOutprice) {
		this.productOutprice = productOutprice;
	}

	public Integer getProductFlag() {
		return productFlag;
	}

	public void setProductFlag(Integer productFlag) {
		this.productFlag = productFlag;
	}

	public double getProductTotalPrice() {
		return productTotalPrice;
	}

	public void setProductTotalPrice(double productTotalPrice) {
		this.productTotalPrice = productTotalPrice;
	}

	public Integer getProductChecked() {
		return productChecked;
	}

	public void setProductChecked(Integer productChecked) {
		this.productChecked = productChecked;
	}

	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	@Override
	public String toString() {
		return "CartProductVo{" +
				"carId=" + carId +
				", userId=" + userId +
				", productId='" + productId + '\'' +
				", productAmount=" + productAmount +
				", productName='" + productName + '\'' +
				", productImg='" + productImg + '\'' +
				", productOutprice=" + productOutprice +
				", productFlag=" + productFlag +
				", productTotalPrice=" + productTotalPrice +
				", productChecked=" + productChecked +
				'}';
	}
}
