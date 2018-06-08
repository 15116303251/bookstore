package com.king.bookstore.service;

import com.king.bookstore.common.dto.BigSmallDto;
import com.king.bookstore.common.inteface.bo.IBookClassBo;
import com.king.bookstore.common.inteface.service.IBookClassService;
import com.king.bookstore.common.pojo.*;
import com.king.bookstore.utils.AbstractLogger;
import com.king.bookstore.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookClassServiceImpl extends AbstractLogger implements IBookClassService {

    @Autowired
    private IBookClassBo iBookClassBo;

    @Override
    public int saveBigClass(List<String> list) {
        return iBookClassBo.saveBigClass(list);
    }

    @Override
    public int saveSmallClass(List<BookSmallClass> list) {
        return iBookClassBo.saveSmallClass(list);
    }

    @Override
    public int saveDetailBigClass(List<BookDetailBigClass> list) {
        return iBookClassBo.saveDetailBigClass(list);
    }

    @Override
    public int saveDetailSmallClass(List<BookDetailSmallClass> list) {
        return iBookClassBo.saveDetailSmallClass(list);
    }

    @Override
    public List<BookBigClass> queryBigTypeList() {
        return iBookClassBo.queryBigTypeList();
    }


    @Override
    public List<BookSmallClass> querySmallTypeList(int bBid) {
        return iBookClassBo.querySmallTypeList(bBid);
    }

    @Override
    public List<BookDetailBigClass> queryDetailBigTypeList(int bSid) {
        return iBookClassBo.queryDetailBigTypeList(bSid);
    }

    @Override
    public List<BookDetailSmallClass> queryDetailSmallTypeList(int bDBid) {
        return iBookClassBo.queryDetailSmallTypeList(bDBid);
    }

    /**
     * 获取一级大分类以及一级小分类展示的dto
     * @return
     */
    public List<BigSmallDto> queryBigSmall(){
        return iBookClassBo.queryBigSmall();
    }

    public List<Sub> querySub(){
        return iBookClassBo.querySub();
    }

//----------------------------------------------------------------------------------------------------类别删除

    @Override
    public boolean deleteBigTypeByBBid(int bBid) {
        return iBookClassBo.deleteBigTypeByBBid(bBid);
    }
    @Override
    public boolean deleteBSTypeByBSid(int bSid) {
        return iBookClassBo.deleteBSTypeByBSid(bSid);
    }

    @Override
    public boolean deleteBDBigDetail(int bDBid) {
        return iBookClassBo.deleteBDBigDetail(bDBid);
    }

    @Override
    public boolean deleteBDSmallType(int bDSid) {
        return iBookClassBo.deleteBDSmallType(bDSid);
    }

//----------------------------------------------------------------------------------------------------类别查询

    @Override
    public PageUtils queryBigTypeList(PageUtils pageUtils) {
        return iBookClassBo.queryBigTypeList(pageUtils);
    }

    @Override
    public PageUtils querySmallTypeList(PageUtils pageUtils) {
        return iBookClassBo.querySmallTypeList(pageUtils);
    }

    @Override
    public PageUtils queryBigDetailTypeList(PageUtils pageUtils) {
        return iBookClassBo.queryBigDetailTypeList(pageUtils);
    }

    @Override
    public PageUtils querySmallDetailTypeList(PageUtils pageUtils) {
        return iBookClassBo.querySmallDetailTypeList(pageUtils);
    }

    @Override
    public BookDetailBigClass queryBigDetailType1(int bDBid) {
        return iBookClassBo.queryBigDetailType1(bDBid);
    }

    @Override
    public boolean updateBigDetail(BookDetailBigClass bookDetailBigClass) {
        return iBookClassBo.updateBigDetail(bookDetailBigClass);
    }

}
