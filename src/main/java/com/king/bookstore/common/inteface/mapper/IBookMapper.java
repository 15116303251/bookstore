package com.king.bookstore.common.inteface.mapper;

import com.king.bookstore.common.dto.BookDto;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.common.pojo.Collection;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IBookMapper {

    /**
     * 存书的过程
     * （1）通过二级大分类找到要保存到的表名
     * （2）通过表名将书信息保存到数据库中
     */

    /**
     * 保存书本到数据库中
     *
     * @param book
     * @return
     */
    public int saveBook(Book book);

    /**
     * 根据二级大分类id获取大分类名称
     *
     * @param bDBid
     * @return
     */
    public String queryTable(int bDBid);

    /**
     * 根据书本的二级大分类以及书本ID输出书本
     *
     * @param id
     * @param tableName
     * @return
     */
    public int deleteBook(@Param("id") int id, @Param("tableName") String tableName);

    /**
     * 根据书本的二级大分类以及书本ID查询书本
     *
     * @param id
     * @param tableName
     * @return
     */
    public Book queryBook(@Param("id") int id, @Param("tableName") String tableName);

    public int updateBook(Book book);

    /**
     * 订单生成后修改数量
     * @param num
     * @param id
     * @return
     */
    public boolean updateBookAmount(@Param("num")int num,@Param("id")int id,@Param("table")String table);

    /**
     * 查询所有该表中的数据
     *
     * @return
     */
    public List<Book> queryBookList(Book book);

    /**
     * 查询新书表中的数据
     *
     * @return
     */
    public List<BookDto> queryNewBookList();

    /**
     * 查询所有新书的数量
     *
     * @return
     */
    public int queryNewBookNum();

    /**
     * 获取畅销版面的数据
     *
     * @param table
     * @return
     */
    public List<Book> querySellBook(@Param("table") String table);

    /**
     * 搜索框查询书本
     *
     * @param table
     * @param bookCode
     * @return
     */
    public List<Book> querySearchBookList(@Param("table") String table, @Param("bookCode") int bookCode);

    /**
     * 跳转书管理首页
     *
     * @param map
     * @return
     */
    public List<Book> goBookPages(Map<String, String> map);

    /**
     * 跳转书管理首页
     *
     * @param map
     * @return
     */
    public List<Book> goBookPages1(Map<String, String> map);

    /**
     * 获取按条件进行查询的所有书籍的数量
     * @param map
     * @return
     */
    public int selectBookAmount(Map<String, String> map);

    /**
     * 获取按条件进行查询的所有书籍的数量
     * @param map
     * @return
     */
    public int selectBookAmount1(Map<String, String> map);

    public List<Book> queryAllBook(@Param("table") String table);

//===============================================================================================================书籍收藏
    /**
     * 书籍收藏的插入
     *
     * @param collection
     * @return
     */
    public boolean bookCollection(Collection collection);

    /**
     * 查询收藏的所有书籍
     * @return
     */
    public List<Collection> findAllBookCollection(@Param("uid")int uid);

    /**
     * 根据主键ID更新商品的收藏状态
     * @param id
     * @return
     */
    public boolean updateCollectionStatus(@Param("id") int id,@Param("flag")int flag);

    /**
     * 通过收藏id删除收藏的书籍
     * @param id
     * @return
     */
    public boolean deleteCollectionById(@Param("id") int id);

    /**
     * 判断该商品在收藏表中是否存在
     * @param bookId
     * @param bDBid
     * @return
     */
    public Collection collectionIsExist(@Param("bookId")int bookId,@Param("bDBid")int bDBid,@Param("uid")int uid);

    /**
     * 查询用户收藏的商品数
     * @param uid
     * @return
     */
    public int collectionAmount(@Param("uid")int uid);

    /**
     * 删除商品收藏
     * @param bookId
     * @param bDBid
     * @param uid
     * @return
     */
    public boolean collectionDelete(@Param("bookId") int bookId,@Param("bDBid")int bDBid,@Param("uid")int uid);
}