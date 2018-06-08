package com.king.bookstore.common.dto;

import java.io.Serializable;
import java.util.List;

//将一级大分类以及一级小分类展示的dto
public class BigSmallDto implements Serializable{

    //大分类
    private String bBigType;
    private List<SmallBigDetail> smallBigDetailsList;

    public BigSmallDto(String bBigType, List<SmallBigDetail> smallBigDetailsList) {
        this.bBigType = bBigType;
        this.smallBigDetailsList = smallBigDetailsList;
    }

    public BigSmallDto() {
    }

    public String getbBigType() {
        return bBigType;
    }

    public void setbBigType(String bBigType) {
        this.bBigType = bBigType;
    }

    public List<SmallBigDetail> getSmallBigDetailsList() {
        return smallBigDetailsList;
    }

    public void setSmallBigDetailsList(List<SmallBigDetail> smallBigDetailsList) {
        this.smallBigDetailsList = smallBigDetailsList;
    }
}
