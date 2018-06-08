package com.king.bookstore.common.pojo;

//收货人地址信息
public class Customer {

    //账号用户ID
    private Integer uid;
    //收货人ID
    private Integer customerId;
    //地址
    private String address;
    //地址状态
    private int status;
    //收货人电话号码
    private String customerName;
    //收货人电话号码
    private String customerPhone;
    //收货大地址
    private String bigAddress;

    public Customer(Integer uid, String address, int status, String customerName, String customerPhone,String bigAddress) {
        this.uid = uid;
        this.address = address;
        this.status = status;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.bigAddress=bigAddress;
    }

    public Customer(Integer uid, String address, String customerName, String customerPhone,String bigAddress,Integer customerId) {
        this.uid = uid;
        this.address = address;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.bigAddress=bigAddress;
        this.customerId=customerId;
    }
    public Customer() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getBigAddress() {
        return bigAddress;
    }

    public void setBigAddress(String bigAddress) {
        this.bigAddress = bigAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "uid=" + uid +
                ", customerId=" + customerId +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", bigAddress='" + bigAddress + '\'' +
                '}';
    }
}
