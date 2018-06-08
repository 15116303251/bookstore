package com.king.bookstore.common.pojo;

import java.io.Serializable;

public class Book implements Serializable{

    private int id;
    private String bookName;
    private int bDSid;
    private String author;
    private String publish;
    private String publishDate;
    private int bDBid;
    private int bBid;
    private int bSid;
    private int status;
    private double originalPrice;
    private double discountedPrice;
    private String description;
    private int Amount;
    private String table;
    private String image;
    private int pageNum;
    private int saleNum;
    private int stock;
    private String smallImage1;
    private String smallImage2;
    private String smallImage3;
    private String smallImage4;
    private String newBookFavorite;
    private String link;
    private Integer bookCode;
    //其他书中的id
    private Integer bookId;
    private Integer bussinessId;



    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Book(String bookName, int bDSid, String author, String publish, String publishDate, int bDBid, int bBid, int bSid, double originalPrice, double discountedPrice, String description, int amount, String image) {
        this.bookName = bookName;
        this.bDSid = bDSid;
        this.author = author;
        this.publish = publish;
        this.publishDate = publishDate;
        this.bDBid = bDBid;
        this.bBid = bBid;
        this.bSid = bSid;
        this.originalPrice = originalPrice;
        this.discountedPrice = discountedPrice;
        this.description = description;
        Amount = amount;
        this.image=image;

    }

    public Book(String bookName, int bDSid, String author, String publish,  int bDBid, int bBid, int bSid, double originalPrice, double discountedPrice, String description, int amount, String image) {
        this.bookName = bookName;
        this.bDSid = bDSid;
        this.author = author;
        this.publish = publish;
        this.bDBid = bDBid;
        this.bBid = bBid;
        this.bSid = bSid;
        this.originalPrice = originalPrice;
        this.discountedPrice = discountedPrice;
        this.description = description;
        Amount = amount;
        this.image=image;
    }

    public Book(int id,String bookName, int bDSid, String author, String publish,  int bDBid, int bBid, int bSid, double originalPrice, double discountedPrice, String description, int amount, String image) {
        this.bookName = bookName;
        this.bDSid = bDSid;
        this.author = author;
        this.publish = publish;
        this.bDBid = bDBid;
        this.bBid = bBid;
        this.bSid = bSid;
        this.originalPrice = originalPrice;
        this.discountedPrice = discountedPrice;
        this.description = description;
        Amount = amount;
        this.image=image;
        this.id=id;
    }

    public Book(String bookName, int bDSid, String author, String publish, String publishDate, int bDBid, int bBid, int bSid, double originalPrice, double discountedPrice, String description, int amount, String image, int saleNum, int stock, String smallImage1, String smallImage2, String smallImage3, String smallImage4,String newBookFavorite,String link,Integer bookCode) {
        this.bookName = bookName;
        this.bDSid = bDSid;
        this.author = author;
        this.publish = publish;
        this.publishDate = publishDate;
        this.bDBid = bDBid;
        this.bBid = bBid;
        this.bSid = bSid;
        this.originalPrice = originalPrice;
        this.discountedPrice = discountedPrice;
        this.description = description;
        Amount = amount;
        this.image = image;
        this.saleNum = saleNum;
        this.stock = stock;
        this.newBookFavorite=newBookFavorite;
        this.link=link;
        this.bookCode=bookCode;
        this.smallImage1 = smallImage1;
        this.smallImage2 = smallImage2;
        this.smallImage3 = smallImage3;
        this.smallImage4 = smallImage4;
    }

    public Book(){}

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

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getbDSid() {
        return bDSid;
    }

    public void setbDSid(int bDSid) {
        this.bDSid = bDSid;
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

    public int getbDBid() {
        return bDBid;
    }

    public void setbDBid(int bDBid) {
        this.bDBid = bDBid;
    }

    public int getbBid() {
        return bBid;
    }

    public void setbBid(int bBid) {
        this.bBid = bBid;
    }

    public int getbSid() {
        return bSid;
    }

    public void setbSid(int bSid) {
        this.bSid = bSid;
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

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNewBookFavorite() {
        return newBookFavorite;
    }

    public void setNewBookFavorite(String newBookFavorite) {
        this.newBookFavorite = newBookFavorite;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getBookCode() {
        return bookCode;
    }

    public void setBookCode(Integer bookCode) {
        this.bookCode = bookCode;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(Integer bussinessId) {
        this.bussinessId = bussinessId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bDSid=" + bDSid +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", bDBid=" + bDBid +
                ", bBid=" + bBid +
                ", bSid=" + bSid +
                ", status=" + status +
                ", originalPrice=" + originalPrice +
                ", discountedPrice=" + discountedPrice +
                ", description='" + description + '\'' +
                ", Amount=" + Amount +
                ", table='" + table + '\'' +
                ", image='" + image + '\'' +
                ", pageNum=" + pageNum +
                ", saleNum=" + saleNum +
                ", stock=" + stock +
                ", smallImage1='" + smallImage1 + '\'' +
                ", smallImage2='" + smallImage2 + '\'' +
                ", smallImage3='" + smallImage3 + '\'' +
                ", smallImage4='" + smallImage4 + '\'' +
                ", newBookFavorite='" + newBookFavorite + '\'' +
                ", link='" + link + '\'' +
                ", bookCode=" + bookCode +
                '}';
    }
}
