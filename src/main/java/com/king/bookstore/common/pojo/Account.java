package com.king.bookstore.common.pojo;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable{

    //用户id
    private Integer userId;
    //用户名字
    private String userName;
    //用户邮箱
    private String userEmail;
    //用户密码
    private String userPassword;
    //用户性别
    private String userSex;
    //用户注册日期
    private String userRegisterDate;
    //用户生日
    private String userBirthday;
    //地址id
    private Integer addressId;
    //用户电话
    private String userTel;
    //用户支付方式
    private String userPayWay;
    //用户省份
    private String userProvince;
    //用户城市
    private String userCity;
    //用户状态
    private Integer userState;
    //积分数
    private Integer grade;
    //用户-权限 id
    private Integer userAuthId;
    //微信openid
    private String  wxOpenId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserRegisterDate() {
        return userRegisterDate;
    }

    public void setUserRegisterDate(String userRegisterDate) {
        this.userRegisterDate = userRegisterDate;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserPayWay() {
        return userPayWay;
    }

    public void setUserPayWay(String userPayWay) {
        this.userPayWay = userPayWay;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getUserAuthId() {
        return userAuthId;
    }

    public void setUserAuthId(Integer userAuthId) {
        this.userAuthId = userAuthId;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userRegisterDate=" + userRegisterDate +
                ", userBirthday=" + userBirthday +
                ", addressId=" + addressId +
                ", userTel='" + userTel + '\'' +
                ", userPayWay='" + userPayWay + '\'' +
                ", userProvince='" + userProvince + '\'' +
                ", userCity='" + userCity + '\'' +
                ", userState=" + userState +
                ", grade=" + grade +
                ", userAuthId=" + userAuthId +
                ", wxOpenId='" + wxOpenId + '\'' +
                '}';
    }
}
