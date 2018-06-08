package com.king.bookstore.common.dto;

public class BookDto {

    private int id;
    private String bookName;
    private String author;
    private String publish;
    private String publishDate;
    private int status;
    private double originalPrice;
    private double discountedPrice;
    private String description;
    private int Amount;
    private String image;
    private String link;
    private Integer bDBid;
    private Integer businessId;
    private Integer bookId;
    private String smallImage1;
    private String smallImage2;
    private String smallImage3;
    private String smallImage4;
    private String discountedAfterPrice;
    private Integer bookCode;
    private int stock;


    public String getSmallImage1() {
        return smallImage1;
    }

    public void setSmallImage1(String smallImage1) {
        this.smallImage1 = smallImage1;
    }

    public String getSmallImage2() {
        return smallImage2;
    }

    public void setSmallImage2(String smallImage2) {
        this.smallImage2 = smallImage2;
    }

    public String getSmallImage3() {
        return smallImage3;
    }

    public void setSmallImage3(String smallImage3) {
        this.smallImage3 = smallImage3;
    }

    public String getSmallImage4() {
        return smallImage4;
    }

    public void setSmallImage4(String smallImage4) {
        this.smallImage4 = smallImage4;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiscountedAfterPrice() {
        return discountedAfterPrice;
    }

    public void setDiscountedAfterPrice(String discountedAfterPrice) {
        this.discountedAfterPrice = discountedAfterPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getbDBid() {
        return bDBid;
    }

    public void setbDBid(Integer bDBid) {
        this.bDBid = bDBid;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBookCode() {
        return bookCode;
    }

    public void setBookCode(Integer bookCode) {
        this.bookCode = bookCode;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", status=" + status +
                ", originalPrice=" + originalPrice +
                ", discountedPrice=" + discountedPrice +
                ", description='" + description + '\'' +
                ", Amount=" + Amount +
                ", image='" + image + '\'' +
                ", link='" + link + '\'' +
                ", bDBid=" + bDBid +
                ", businessId=" + businessId +
                ", bookId=" + bookId +
                ", smallImage1='" + smallImage1 + '\'' +
                ", smallImage2='" + smallImage2 + '\'' +
                ", smallImage3='" + smallImage3 + '\'' +
                ", smallImage4='" + smallImage4 + '\'' +
                ", discountedAfterPrice='" + discountedAfterPrice + '\'' +
                ", bookCode=" + bookCode +
                ", stock=" + stock +
                '}';
    }
}
