package com.king.bookstore.bo;

import com.github.pagehelper.PageHelper;
import com.king.bookstore.common.dto.BigSmallDto;
import com.king.bookstore.common.dto.SmallBigDetail;
import com.king.bookstore.common.inteface.bo.IBookClassBo;
import com.king.bookstore.common.inteface.mapper.IBookClassMapper;
import com.king.bookstore.common.pojo.*;
import com.king.bookstore.utils.AbstractLogger;
import com.king.bookstore.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class BookClassBoImpl extends AbstractLogger implements IBookClassBo {

    @Autowired
    private IBookClassMapper iBookClassMapper;

    @Override
    public int saveBigClass(List<String> list) {
        int flag=iBookClassMapper.saveBigClass(list);
        if(flag>0){
            logger.info("amount insert success");
        }else{
            logger.info("amount insert fail");
        }
        return flag;
    }

    @Override
    public int saveSmallClass(List<BookSmallClass> list) {
        int flag=iBookClassMapper.saveSmallClass(list);
        if(flag>0){
            logger.info("amount insert success");
        }else{
            logger.info("amount insert fail");
        }
        return flag;
    }

    @Override
    public int saveDetailBigClass(List<BookDetailBigClass> list) {
        int flag=iBookClassMapper.saveDetailBigClass(list);
        if(flag>0){
            logger.info("amount insert success");
        }else{
            logger.info("amount insert fail");
        }
        return flag;
    }

    @Override
    public int saveDetailSmallClass(List<BookDetailSmallClass> list) {
        int flag=iBookClassMapper.saveDetailSmallClass(list);
        if(flag>0){
            logger.info("amount insert success");
        }else{
            logger.info("amount insert fail");
        }
        return flag;
    }

    @Override
    public List<BookBigClass> queryBigTypeList() {
        return iBookClassMapper.queryBigTypeList();

    }

    @Override
    public BookDetailBigClass queryBigDetailType1(int bDBid) {
        return iBookClassMapper.queryBigDetailType1(bDBid);
    }


    @Override
    public List<BookSmallClass> querySmallTypeList(int bBid) {
        return iBookClassMapper.querySmallTypeList(bBid);
    }

    @Override
    public List<BookDetailBigClass> queryDetailBigTypeList(int bSid) {
        return iBookClassMapper.queryDetailBigTypeList(bSid);
    }

    @Override
    public List<BookDetailSmallClass> queryDetailSmallTypeList(int bDBid) {
        return iBookClassMapper.queryDetailSmallTypeList(bDBid);
    }



    public List<Sub> querySub(){
        return iBookClassMapper.querySub();
    }

    /**
     * 获取一级大分类，一级小分类，二级大分类
     * @return
     */
   public List<BigSmallDto> queryBigSmall(){
        List<BigSmallDto> bigSmallDtos=new ArrayList<BigSmallDto>();
        List<BookBigClass> list=iBookClassMapper.queryBigTypeList();
        for (BookBigClass bookBigClass:list) {
            List<SmallBigDetail> smallBigDetailsList=new ArrayList<SmallBigDetail>();
            List<BookSmallClass> bookSmallClassList=iBookClassMapper.querySmallTypeList(bookBigClass.getbBid());
            for(BookSmallClass bookSmallClass:bookSmallClassList){
                List<BookDetailBigClass> bookDetailBigClassesList=iBookClassMapper.queryDetailBigTypeList(bookSmallClass.getbSid());
                smallBigDetailsList.add(new SmallBigDetail(bookSmallClass.getbSType(),bookSmallClass.getLink(),bookDetailBigClassesList));
            }
            bigSmallDtos.add(new BigSmallDto(bookBigClass.getbBigType(),smallBigDetailsList));
        }
        return bigSmallDtos;
    }
//----------------------------------------------------------------------------------------------------类别删除

    @Override
    public boolean deleteBigTypeByBBid(int bBid) {
        return iBookClassMapper.deleteBigTypeByBBid(bBid);
    }

    @Override
    public boolean deleteBSTypeByBSid(int bSid) {
        return iBookClassMapper.deleteBSTypeByBSid(bSid);
    }

    @Override
    public boolean deleteBDBigDetail(int bDBid) {
        return iBookClassMapper.deleteBDBigDetail(bDBid);
    }

    @Override
    public boolean deleteBDSmallType(int bDSid) {
        return iBookClassMapper.deleteBDSmallType(bDSid);
    }
//---------------------------------------------------------------------------------------------------------------类别添加

    @Override
    public PageUtils queryBigTypeList(PageUtils pageUtils) {
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(pageUtils.getPage(),pageUtils.getLimit());
        List list=iBookClassMapper.queryBigTypeList();
        pageUtils.setList(list);
        pageUtils.setCountNum(iBookClassMapper.queryBigTypeAmount());
        return pageUtils;

    }


    @Override
    public PageUtils querySmallTypeList(PageUtils pageUtils) {
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(pageUtils.getPage(),pageUtils.getLimit());
        List list=iBookClassMapper.querySmallTypeList1();
        pageUtils.setList(list);
        pageUtils.setCountNum(iBookClassMapper.querySmallTypeAmount());
        return pageUtils;

    }

    @Override
    public PageUtils querySmallDetailTypeList(PageUtils pageUtils) {
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(pageUtils.getPage(),pageUtils.getLimit());
        List list=iBookClassMapper.querySmallDetailTypeList();
        pageUtils.setList(list);
        pageUtils.setCountNum(iBookClassMapper.querySmallDetailTypeAmount());
        return pageUtils;

    }

    @Override
    public boolean updateBigDetail(BookDetailBigClass bookDetailBigClass) {
        return iBookClassMapper.updateBigDetail(bookDetailBigClass);
    }

    @Override
    public PageUtils queryBigDetailTypeList(PageUtils pageUtils) {
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(pageUtils.getPage(),pageUtils.getLimit());
        List list=iBookClassMapper.queryBigDetailTypeList();
        pageUtils.setList(list);
        pageUtils.setCountNum(iBookClassMapper.queryBigDetailTypeAmount());
        return pageUtils;

    }
}
