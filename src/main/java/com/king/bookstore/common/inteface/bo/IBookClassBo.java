package com.king.bookstore.common.inteface.bo;

import com.king.bookstore.common.dto.BigSmallDto;
import com.king.bookstore.common.pojo.*;
import com.king.bookstore.utils.AbstractLogger;
import com.king.bookstore.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface IBookClassBo {

    /**
     * 批量插入大的分类
     * @param list
     * @return
     */
    public int saveBigClass(List<String> list);

    /**
     * 批量插入小分类
     * @param list
     * @return
     */
    public int saveSmallClass(List<BookSmallClass> list);

    /**
     * 批量插入二级大分类
     * @param list
     * @return
     */
    public int saveDetailBigClass(List<BookDetailBigClass> list);

    /**
     * 批量插入二级大小分类
     * @param list
     * @return
     */
    public int saveDetailSmallClass(List<BookDetailSmallClass> list);

    /**
     * 查询所有的一级分类的类型
     * @return 集合包含所有的类型
     */
    public List<BookBigClass> queryBigTypeList();


    public BookDetailBigClass queryBigDetailType1(@Param("bDBid")int bDBid);

    /**
     * 根据一级大分类的ID获取所有的一级小分类
     * @param bBid 大分类ID
     * @return
     */
    public List<BookSmallClass> querySmallTypeList(int bBid);

    /**
     * 根据一级分类的小分类查询二级分类的大分类
     * @param bSid 一级分类的二级大分类ID
     * @return
     */
    public List<BookDetailBigClass> queryDetailBigTypeList(int bSid);

    /**
     * 根据二级分类的ID查询二级分类小分类
     * @param bDBid
     * @return
     */
    public List<BookDetailSmallClass> queryDetailSmallTypeList(int bDBid);

    //查找sub
     public List<Sub> querySub();

    /**
     * 获取一级大分类，一级小分类，二级大分类
     * @return
     */
    List<BigSmallDto> queryBigSmall();

    //---------------------------------------------------------------------------------------------------------删除类别
    public boolean deleteBigTypeByBBid(int bBid);

    public boolean deleteBSTypeByBSid(int bSid);

    public boolean deleteBDBigDetail(int bDBid);

    public boolean deleteBDSmallType(int bDSid);

    //---------------------------------------------------------------------------------------------------------删除类别

    /**
     * 查询所有的一级分类的类型
     * @return 集合包含所有的类型
     */
    public PageUtils queryBigTypeList(PageUtils pageUtils);

    /**
     * 查询所有的一级分类的类型
     * @return 集合包含所有的类型
     */
    public PageUtils querySmallTypeList(PageUtils pageUtils);

    /**
     * 查询所有的一级分类的类型
     * @return 集合包含所有的类型
     */
    public PageUtils queryBigDetailTypeList(PageUtils pageUtils);

    /**
     * 查询所有的一级分类的类型
     * @return 集合包含所有的类型
     */
    public PageUtils querySmallDetailTypeList(PageUtils pageUtils);

    /**
     * 更新二级大分类
     * @param bookDetailBigClass
     * @return
     */
    public boolean updateBigDetail(BookDetailBigClass bookDetailBigClass);
}
