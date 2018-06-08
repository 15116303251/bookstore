package com.king.bookstore.common.pojo;

import java.io.Serializable;

public class Company implements Serializable{

    //企业用户名称
    private String erpUserName;
    //企业用户密码
    private String erpUserPsd;
    //公司名称
    private String companyName;
    //公司地址
    private String companyAdd;
    //公司邮箱
    private String companyEmail;
    //公司电话
    private String companyTel;
    //联系人
    private String linkUser;
    //联系人电话
    private String linkUserPhone;
    //公司ID
    private String companyId;

    private int flag;

    public String getErpUserName() {
        return erpUserName;
    }

    public void setErpUserName(String erpUserName) {
        this.erpUserName = erpUserName;
    }

    public String getErpUserPsd() {
        return erpUserPsd;
    }

    public void setErpUserPsd(String erpUserPsd) {
        this.erpUserPsd = erpUserPsd;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAdd() {
        return companyAdd;
    }

    public void setCompanyAdd(String companyAdd) {
        this.companyAdd = companyAdd;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyTel() {
        return companyTel;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
    }

    public String getLinkUser() {
        return linkUser;
    }

    public void setLinkUser(String linkUser) {
        this.linkUser = linkUser;
    }

    public String getLinkUserPhone() {
        return linkUserPhone;
    }

    public void setLinkUserPhone(String linkUserPhone) {
        this.linkUserPhone = linkUserPhone;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Company{" +
                "erpUserName='" + erpUserName + '\'' +
                ", erpUserPsd='" + erpUserPsd + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyAdd='" + companyAdd + '\'' +
                ", companyEmail='" + companyEmail + '\'' +
                ", companyTel='" + companyTel + '\'' +
                ", linkUser='" + linkUser + '\'' +
                ", linkUserPhone='" + linkUserPhone + '\'' +
                ", companyId='" + companyId + '\'' +
                '}';
    }
}
