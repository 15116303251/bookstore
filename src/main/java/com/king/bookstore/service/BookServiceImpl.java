package com.king.bookstore.service;

import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.inteface.bo.IBookBo;
import com.king.bookstore.common.inteface.service.IBookService;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.common.pojo.Collection;
import com.king.bookstore.common.variable.BookToTableEnum;
import com.king.bookstore.utils.AbstractLogger;
import com.king.bookstore.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl extends AbstractLogger implements IBookService {

    @Autowired
    IBookBo iBookBo;
    @Override
    public int saveBook(Book book) {
        String tableName=iBookBo.queryTable(book.getbDBid());
        book.setTable(BookToTableEnum.getTable(tableName));
        return iBookBo.saveBook(book);
    }

    @Override
    public int deleteBook(int id, int bDBid) {
        String type=iBookBo.queryTable(bDBid);
        if(type==null){
            logger.info("don't have this class");
            return 0;
        }else{
            return iBookBo.deleteBook(id,BookToTableEnum.getTable(type));
        }

    }

    @Override
    public int deleteBook(int id, String tableName) {
        return iBookBo.deleteBook(id,tableName);
    }

    @Override
    public Book queryBook(int id, int bDBid) {
        String type=iBookBo.queryTable(bDBid);
        if(type==null){
            logger.info("don't have this class");
            return null;
        }else{
            return iBookBo.queryBook(id,BookToTableEnum.getTable(type));
        }
    }

    @Override
    public int updateBook(Book book) {
        return iBookBo.updateBook(book);
    }

    @Override
    public boolean updateBookAmount(int num, int id, int bDBid) {
        return iBookBo.updateBookAmount(num,id,bDBid);
    }

    @Override
    public PageInfo queryBookList(Map<String,String> map) {
        return iBookBo.queryBookList(map);
    }

    @Override
    public PageInfo queryNewBookList(int pageNum) {
        return iBookBo.queryNewBookList(pageNum);
    }

    @Override
    public PageInfo querySellBook(int pageNum, String type) {
        return iBookBo.querySellBook(pageNum,type);
    }

    @Override
    public PageInfo querySearchBookList(int bDBid, int bookCode) {
        return iBookBo.querySearchBookList(bDBid,bookCode);
    }

    @Override
    public PageUtils goBookPages(PageUtils page, Map<String, String> map) {
        return iBookBo.goBookPages(page,map);
    }

    @Override
    public PageUtils goBookPages1(PageUtils page, Map<String, String> map) {
        return iBookBo.goBookPages1(page,map);
    }

    @Override
    public int selectBookAmount(Map<String, String> map) {
        return iBookBo.selectBookAmount(map);
    }

    @Override
    public List<Book> queryAllBook(int bDBid) {
        return iBookBo.queryAllBook(bDBid);
    }

    @Override
    public boolean bookCollection(int bookId, int bDBid,int uid) {
        return iBookBo.bookCollection(bookId,bDBid,uid);
    }

    @Override
    public PageInfo findAllBookCollection(Map<String, String> map) {
        return iBookBo.findAllBookCollection(map);
    }

    @Override
    public boolean updateCollectionStatus(int id, int flag) {
        return iBookBo.updateCollectionStatus(id,flag);
    }

    @Override
    public boolean deleteCollectionById(int id) {
        return iBookBo.deleteCollectionById(id);
    }

    @Override
    public Collection collectionIsExist(int bookId, int bDBid,int uid) {
        return iBookBo.collectionIsExist(bookId,bDBid,uid);
    }

    @Override
    public int collectionAmount(int uid) {
        return iBookBo.collectionAmount(uid);
    }

    @Override
    public boolean collectionDelete(String bookId, String bDBid, String uid) {
        return iBookBo.collectionDelete(bookId,bDBid,uid);
    }

}
