package com.king.bookstore.common.inteface.service;

import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.common.pojo.Collection;
import com.king.bookstore.utils.PageUtils;

import java.util.List;
import java.util.Map;

public interface IBookService {

    /**
     * 保存书本到数据库中
     * @param book
     * @return
     */
    public int saveBook(Book book);

    /**
     * 删除
     * @param id
     * @param bDBid
     * @return
     */
    public int deleteBook(int id,int bDBid);

    /**
     * 删除
     * @param id
     * @param tableName
     * @return
     */
    public int deleteBook(int id,String tableName);


    /**
     * 根据书本的二级大分类以及书本ID查询书本
     * @param id
     * @param bDBid
     * @return
     */
    public Book queryBook(int id, int bDBid);

    /**
     * 更新书籍
     * @param book
     * @return
     */
    public int updateBook(Book book);

    /**
     * 订单生成后修改数量
     * @param num
     * @param id
     * @return
     */
    public boolean updateBookAmount(int num,int id,int bDBid);

    /**
     * 查询所有该表中的数据
     * @return
     */
    public PageInfo queryBookList(Map<String,String> map);

    /**
     * 查询新书表中的数据
     * @return
     */
    public PageInfo queryNewBookList(int pageNum);

    public PageInfo querySellBook(int pageNum,String type);

    /**
     * 搜索框查询书本
     * @param bDBid
     * @Param bookCode
     * @param bookCode
     * @return
     */
    public PageInfo querySearchBookList(int bDBid,int bookCode);

    /**
     * 跳转bookIndex页面
     * @param page
     * @param map
     * @return
     */
    public PageUtils goBookPages(PageUtils page,Map<String,String>map);

    /**
     * 跳转书管理首页
     *
     * @param map
     * @return
     */
    public PageUtils goBookPages1(PageUtils page, Map<String,String>map);

    /**
     * 获取按条件进行查询的所有书籍的数量
     * @param map
     * @return
     */
    public int selectBookAmount(Map<String, String> map);

    /**
     * 根据bDBid获取所有图书
     * @param bDBid
     * @return
     */
    public List<Book> queryAllBook(int bDBid);


    //===============================================================================================================书籍收藏
    /**
     * 书籍收藏的插入
     *
     * @param bookId
     * @param bDBid
     * @return
     */
    public boolean bookCollection(int bookId, int bDBid,int uid);

    /**
     * 查询收藏的所有书籍
     * @return
     */
    public PageInfo findAllBookCollection(Map<String,String> map);

    /**
     * 根据主键ID更新商品的收藏状态
     * @param id
     * @return
     */
    public boolean updateCollectionStatus( int id,int flag);

    /**
     * 通过收藏id删除收藏的书籍
     * @param id
     * @return
     */
    public boolean deleteCollectionById( int id);

    /**
     * 判断该商品在收藏表中是否存在
     * @param bookId
     * @param bDBid
     * @return
     */
    public Collection collectionIsExist(int bookId, int bDBid,int uid);

    /**
     * 查询用户收藏的商品数
     * @param uid
     * @return
     */
    public int collectionAmount(int uid);

    /**
     * 删除商品收藏
     * @param bookId
     * @param bDBid
     * @param uid
     * @return
     */
    public boolean collectionDelete(String bookId,String bDBid,String uid);
}
