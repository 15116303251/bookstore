package com.king.bookstore.bo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.dto.BookDto;
import com.king.bookstore.common.inteface.bo.IBookBo;
import com.king.bookstore.common.inteface.mapper.IBookClassMapper;
import com.king.bookstore.common.inteface.mapper.IBookMapper;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.common.pojo.Collection;
import com.king.bookstore.common.variable.BookToTableEnum;
import com.king.bookstore.common.variable.SystemParam;
import com.king.bookstore.utils.AbstractLogger;
import com.king.bookstore.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class BookBoImpl extends AbstractLogger implements IBookBo {

    @Autowired
    private IBookMapper iBookMapper;
    @Autowired
    private IBookClassMapper iBookClassMapper;

    @Override
    public int saveBook(Book book) {
        logger.info("book"+book);
        int flag=iBookMapper.saveBook(book);
        if(flag>0){
            logger.info("save success");
            return SystemParam.BOOK_SAVE_SUCCESS;
        }else{
            logger.info("save fail");
            return SystemParam.BOOK_SAVE_FAIL;
        }

    }

    @Override
    public String queryTable(int bDBid) {
        return iBookMapper.queryTable(bDBid);
    }

    @Override
    public int deleteBook(int id, String tableName) {
        int flag=iBookMapper.deleteBook(id,tableName);
        if(flag>0){
            logger.info("delete success");
            return SystemParam.BOOK_SAVE_SUCCESS;
        }else{
            logger.info("delete fail");
            return SystemParam.BOOK_SAVE_FAIL;
        }
    }

    @Override
    public Book queryBook(int id, String tableName) {
        logger.info("query book is begin");
        Book book =iBookMapper.queryBook(id, tableName);
        if(book==null){
            logger.info("this book is not exsit");
            return null;
        }else{
//            BookDto bt=new BookDto();
//            bt.setAmount(book.getAmount());
//            bt.setAuthor(book.getAuthor());
//            bt.setbBigType(iBookClassMapper.queryBigType(book.getbBid()));
//            bt.setbDBigDetail(iBookClassMapper.queryBigDetailType(book.getbDBid()));
//            bt.setbDSmallType(iBookClassMapper.querySmallDetailType(book.getbDSid()));
//            bt.setbSType(iBookClassMapper.querySmallType(book.getbSid()));
//            bt.setBookName(book.getBookName());
//            bt.setDescription(book.getDescription());
//            bt.setDiscountedPrice(book.getDiscountedPrice());
//            bt.setId(book.getId());
//            bt.setOriginalPrice(book.getOriginalPrice());
//            bt.setPublish(book.getPublish());
//            bt.setPublishDate(book.getPublishDate());
            return book;
        }
    }

    @Override
    public int updateBook(Book book) {
        book.setTable(BookToTableEnum.getTable(iBookClassMapper.queryBigDetailType(book.getbDBid())));
        return iBookMapper.updateBook(book);
    }

    @Override
    public boolean updateBookAmount(int num, int id, int bDBid) {
        String type=iBookClassMapper.queryBigDetailType(bDBid);
        String table=BookToTableEnum.getTable(type);
        return iBookMapper.updateBookAmount(num,id,table);
    }

    @Override
    public PageInfo queryBookList(Map<String,String> map) {
        Book book=new Book();
        book.setTable(BookToTableEnum.getTable(iBookClassMapper.queryBigDetailType(Integer.parseInt(map.get("bDBid")))));
        book.setbDBid(Integer.parseInt(map.get("bDBid")));
        book.setbDSid(Integer.parseInt(map.get("bDSid")));
        book.setbBid(Integer.parseInt(map.get("bBid")));
        book.setbSid(Integer.parseInt(map.get("bSid")));

        String bookName= map.get("bookName");
        book.setBookName(map.get("bookName").equals("")?null:map.get("bookName"));
        book.setAuthor(map.get("author").equals("")?null:map.get("author"));
        book.setPublish(map.get("publish").equals("")?null:map.get("publish"));
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(Integer.parseInt(map.get("pageNum")),10);
//        pageHelper.startPage(1,2);
        List<Book> list=iBookMapper.queryBookList(book);
        PageInfo page=new PageInfo(list);
        logger.info("page"+page.getTotal());
        logger.info("page"+page.getList().get(0));
        return page;
    }

    /**
     * 查询新书表中的数据
     * @return
     */
    public PageInfo queryNewBookList(int pageNum){
        PageHelper page=new PageHelper();
        page.startPage(pageNum,8);
        List<BookDto> list=iBookMapper.queryNewBookList();
        PageInfo pageInfo=new PageInfo();
        pageInfo.setList(list);
        return pageInfo;
    }

    @Override
    public PageInfo querySellBook(int pageNum, String type) {
        String tableName=BookToTableEnum.getTable(type);
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(pageNum,10);
        List<Book> list=iBookMapper.querySellBook(tableName);
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    public PageInfo querySearchBookList(int bDBid,int bookCode){
        String bigDetail=iBookClassMapper.queryBigDetailType(bDBid);
        String table=BookToTableEnum.getTable(bigDetail);
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(1,20);
        List<Book>list=iBookMapper.querySearchBookList(table,bookCode);
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }

    @Override
    public PageUtils goBookPages(PageUtils page, Map<String, String> map) {
        String bDBid=map.get("bDBid");
        if(bDBid==null||bDBid.equals("")){
            bDBid="105";
        }
        String table=BookToTableEnum.getTable(iBookClassMapper.queryBigDetailType(Integer.parseInt(bDBid)));
        map.put("table",table);
        PageHelper pageHelper =new PageHelper();
        logger.info("1223--------"+page.getPage());
        pageHelper.startPage(page.getPage(),page.getLimit());
        List<Book> list=iBookMapper.goBookPages(map);
        int count = iBookMapper.selectBookAmount(map);
        page.setList(list);
        page.setCountNum(count);
        return page;
    }

    @Override
    public PageUtils goBookPages1(PageUtils page, Map<String, String> map) {
        String bDBid= (String) map.get("bDBid");
        if(bDBid==null||bDBid.equals("")){
            bDBid="105";
        }
        String table=BookToTableEnum.getTable(iBookClassMapper.queryBigDetailType(Integer.parseInt(bDBid)));
        map.put("table",table);
        PageHelper pageHelper =new PageHelper();
        logger.info("1223--------"+page.getPage());
        pageHelper.startPage(page.getPage(),page.getLimit());
        List<Book> list=iBookMapper.goBookPages1(map);
        int count = iBookMapper.selectBookAmount1(map);
        page.setList(list);
        page.setCountNum(count);
        return page;
    }


    @Override
    public int selectBookAmount(Map<String, String> map) {
        return iBookMapper.selectBookAmount(map);
    }

    @Override
    public List<Book> queryAllBook(int bDBid) {
        String bDType=iBookClassMapper.queryBigDetailType(bDBid);
        String table=BookToTableEnum.getTable(bDType);
        return iBookMapper.queryAllBook(table);
    }

    @Override
    public boolean bookCollection(int bookId, int bDBid,int uid) {
        String type=iBookClassMapper.queryBigDetailType(bDBid);
        if(type==null){
            logger.info("此类别不存在");
            return false;
        }else{
            String table=BookToTableEnum.getTable(type);
            if(table==null){
                logger.info("此类别没有对应的表");
                return false;
            }else{
                Book book=iBookMapper.queryBook(bookId,table);
                if(book==null){
                    logger.info("书籍ID对应的书籍不存在");
                    return false;
                }else{
                    boolean flag=iBookMapper.bookCollection(new Collection(bookId,book.getImage(),book.getBookName(),book.getAuthor(),bDBid,1,uid));
                    if(flag){
                        logger.info("插入收藏成功");
                        return true;
                    }else{
                        logger.info("插入收藏失败");
                        return false;
                    }
                }
            }

        }

    }

    @Override
    public PageInfo findAllBookCollection(Map<String,String> map) {
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(Integer.parseInt(map.get("pageNumber")),Integer.parseInt(map.get("pageSize")));
        List<Collection> collectionList=iBookMapper.findAllBookCollection(Integer.parseInt(map.get("uid")));
        List<Book> booklist=new ArrayList<Book>();
        for (Collection collection:collectionList) {
            String type=iBookClassMapper.queryBigDetailType(collection.getbDBid());
            String table=BookToTableEnum.getTable(type);
            Book book=iBookMapper.queryBook(collection.getBookId(),table);
            booklist.add(book);
        }
        PageInfo pageInfo=new PageInfo();
        pageInfo.setList(booklist);
        return pageInfo;
    }

    @Override
    public boolean updateCollectionStatus(int id,int flag) {
        return iBookMapper.updateCollectionStatus(id,flag);
    }

    @Override
    public boolean deleteCollectionById(int id) {
        return iBookMapper.deleteCollectionById(id);
    }

    @Override
    public Collection collectionIsExist(int bookId, int bDBid,int uid) {
        return iBookMapper.collectionIsExist(bookId,bDBid,uid);
    }

    @Override
    public int collectionAmount(int uid) {
        return iBookMapper.collectionAmount(uid);
    }

    @Override
    public boolean collectionDelete(String bookId, String bDBid, String uid) {
        return iBookMapper.collectionDelete(Integer.parseInt(bookId),Integer.parseInt(bDBid),Integer.parseInt(uid));
    }


}
