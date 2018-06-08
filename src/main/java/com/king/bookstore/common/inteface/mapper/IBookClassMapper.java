package com.king.bookstore.common.inteface.mapper;

import com.king.bookstore.common.dto.BigSmallDto;
import com.king.bookstore.common.pojo.*;
import com.king.bookstore.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 插入一级大分类
 */
public interface IBookClassMapper {

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
     * 通过一级分类ID获取类型
     * @param bBigType
     * @return
     */
    public int queryBigTypeId(@Param("bBigType") String bBigType);
    public String queryBigType(@Param("bBid") int bBid);

    /**
     * 通过一级小分类ID获取类型
     * @param bSType
     * @return
     */
    public int querySmallTypeId(@Param("bSType")String bSType);
    public String querySmallType(@Param("bSid")int bSid);

    /**
     * 根据二级分类大ID获取类型
     * @param bDBigDetail
     * @return
     */
    public int queryBigDetailTypeId(@Param("bDBigDetail")String bDBigDetail);
    public String queryBigDetailType(@Param("bDBid")int bDBid);

    public BookDetailBigClass queryBigDetailType1(@Param("bDBid")int bDBid);
    /**
     * 根据二级分类小ID获取类型
     * @param bDSmallType
     * @return
     */
    public int querySmallDetailTypeId(@Param("bDSmallType")String bDSmallType);

    /**
     * 根据ID查询二级小分类类型
     * @param bDSid
     * @return
     */
    public String querySmallDetailType(@Param("bDSid")int bDSid);


    /**
     * 根据一级大分类的ID获取所有的一级小分类
     * @param bBid 大分类ID
     * @return
     */
    public List<BookSmallClass>querySmallTypeList(int bBid);

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
    List<Sub> querySub();


    //---------------------------------------------------------------------------------------------------------删除类别
    public boolean deleteBigTypeByBBid(int bBid);

    public boolean deleteBSTypeByBSid(int bSid);

    public boolean deleteBDBigDetail(int bDBid);

    public boolean deleteBDSmallType(int bDSid);


    //---------------------------------------------------------------------------------------------------------查询类别
    /**
     * 查询所有的一级分类的类型
     * @return 集合包含所有的类型
     */
    public List<BookBigClass> queryBigTypeList();

    /**
     * 查询所有的一级分类的类型
     * @return 集合包含所有的类型
     */
    public List<BookSmallClass> querySmallTypeList1();

    /**
     * 查询所有的一级分类的类型
     * @return 集合包含所有的类型
     */
    public List<BookDetailBigClass> queryBigDetailTypeList();

    /**
     * 查询所有的一级分类的类型
     * @return 集合包含所有的类型
     */
    public List<BookDetailSmallClass> querySmallDetailTypeList();



    //---------------------------------------------------------------------------------------------------------查询类别
    //查询一级大分类的数量
    public int queryBigTypeAmount();

    //查询一级大分类的数量
    public int querySmallTypeAmount();

    //查询一级大分类的数量
    public int queryBigDetailTypeAmount();

    //查询一级大分类的数量
    public int querySmallDetailTypeAmount();

    /**
     * 更新二级大分类
     * @param bookDetailBigClass
     * @return
     */
    public boolean updateBigDetail(BookDetailBigClass bookDetailBigClass);


}
