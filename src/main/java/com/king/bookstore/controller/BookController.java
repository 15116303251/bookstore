package com.king.bookstore.controller;

import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.dto.BigSmallDto;
import com.king.bookstore.common.dto.BookDto;
import com.king.bookstore.common.inteface.mapper.IBookClassMapper;
import com.king.bookstore.common.inteface.service.IBookClassService;
import com.king.bookstore.common.inteface.service.IBookService;
import com.king.bookstore.common.inteface.service.ICartService;
import com.king.bookstore.common.inteface.service.IExclusivePushService;
import com.king.bookstore.common.inteface.service.INewHotBookService;
import com.king.bookstore.common.inteface.service.IPresellService;
import com.king.bookstore.common.inteface.service.IQueryHelpService;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.common.pojo.BookBigClass;
import com.king.bookstore.common.pojo.BookDetailBigClass;
import com.king.bookstore.common.pojo.BookDetailSmallClass;
import com.king.bookstore.common.pojo.BookSmallClass;
import com.king.bookstore.common.pojo.Cart;
import com.king.bookstore.common.pojo.Collection;
import com.king.bookstore.common.pojo.QueryHelp;
import com.king.bookstore.common.pojo.Sub;
import com.king.bookstore.utils.AbstractLogger;
import com.king.bookstore.utils.BackMsg;
import com.king.bookstore.utils.DateUtils;
import com.king.bookstore.utils.PageUtils;
import com.king.bookstore.utils.ResponseHelp;
import com.king.bookstore.utils.StringUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class BookController extends AbstractLogger {

    @Autowired
    private IBookClassService iBookClassService;
    @Autowired
    private IBookService iBookService;
    @Autowired
    private IBookClassMapper iBookClassMapper;
    @Autowired
    private IPresellService iPresellService;
    @Autowired
    private INewHotBookService iNewHotBookService;
    @Autowired
    private IExclusivePushService iExclusivePushService;
    @Autowired
    private IQueryHelpService iQueryHelpService;
    @Autowired
    private ICartService iCartService;


    @RequestMapping(value = "/saveBigClass", method = RequestMethod.POST)
    @ResponseBody
    public int saveBigClass(@RequestParam("class1") String class1, @RequestParam("idClassParent") String idClassParent) {
        List<String> list = new ArrayList<String>();
        list.add(class1);
        int flag = iBookClassService.saveBigClass(list);
        return flag;
    }


    @RequestMapping(value = "/saveSmallClass", method = RequestMethod.POST)
    @ResponseBody
    public int saveBookSmallClass(@RequestParam("class1") String class1, @RequestParam("idClassParent") String idClassParent) {
        List<BookSmallClass> list = new ArrayList<BookSmallClass>();
        BookSmallClass bookSmallClass = new BookSmallClass();
        bookSmallClass.setbBid(Integer.parseInt(idClassParent));
        bookSmallClass.setbSType(class1);
        list.add(bookSmallClass);
        int flag = iBookClassService.saveSmallClass(list);
        return flag;
    }

    @RequestMapping(value = "/saveDetailBigClass", method = RequestMethod.POST)
    @ResponseBody
    public int saveBookBigDetailClass(@RequestParam("class1") String class1, @RequestParam("idClassParent") String idClassParent) {
        List<BookDetailBigClass> list = new ArrayList<BookDetailBigClass>();
        BookDetailBigClass bookDetailBigClass = new BookDetailBigClass();
        bookDetailBigClass.setbSid(Integer.parseInt(idClassParent));
        bookDetailBigClass.setbDBigDetail(class1);
        list.add(bookDetailBigClass);
        int flag = iBookClassService.saveDetailBigClass(list);
        return flag;
    }

    @RequestMapping(value = "/saveDetailSmallClass", method = RequestMethod.POST)
    @ResponseBody
    public int saveBookSmallDetailClass(@RequestParam("class1") String class1, @RequestParam("idClassParent") String idClassParent) {
        List<BookDetailSmallClass> list = new ArrayList<BookDetailSmallClass>();
        BookDetailSmallClass bookDetailSmallClass = new BookDetailSmallClass();
        bookDetailSmallClass.setbDBid(Integer.parseInt(idClassParent));
        bookDetailSmallClass.setbDSmallType(class1);
        list.add(bookDetailSmallClass);
        int flag = iBookClassService.saveDetailSmallClass(list);
        return flag;
    }

    @RequestMapping(value = "addBook", method = RequestMethod.GET)
    public String addBook() {
        return "good/book/book_add";
    }


    @RequestMapping(value = "/bookUpload", method = RequestMethod.POST)
    @ResponseBody
    public String upLoadBook(HttpServletRequest request) throws IOException {
        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        String bookName = req.getParameter("bookName");
        String bDSid = req.getParameter("bDSid");
        String author = req.getParameter("author");
        String publish = req.getParameter("publish");
        String publishDate = req.getParameter("publishDate");
        String bDBid = req.getParameter("bDBid");
        String bBid = req.getParameter("bBid");
        String bSid = req.getParameter("bSid");
        String originalPrice = req.getParameter("originalPrice");
        String discountedPrice = req.getParameter("discountedPrice");
        String description = req.getParameter("description");
        String amount = req.getParameter("Amount");
        String bussinessId = (String) request.getSession().getAttribute("backUser");
        //将文件上传到指定的服务器文件
        String path = request.getSession().getServletContext().getRealPath("\\WEB-INF\\classes\\static\\assets\\images/");
        logger.info("path" + path);
        logger.info("files" + files.get(0).getOriginalFilename());

        String smallImage0 = null;
        String smallImage1 = null;
        String smallImage2 = null;
        String smallImage3 = null;
        String smallImage4 = null;
        Integer bookCode = StringUtil.getBookCode();
        for (int i = 0; i < files.size(); i++) {

            String fileName = files.get(i).getOriginalFilename();
            if (i == 0) {
                smallImage0 = fileName;
            }
            if (i == 1) {
                smallImage1 = fileName;
            }
            if (i == 2) {
                smallImage2 = fileName;
            }
            if (i == 3) {
                smallImage3 = fileName;
            }
            if (i == 4) {
                smallImage4 = fileName;
            }
            logger.info("files-----------" + files.get(i).getOriginalFilename());
            File file = new File(path + "/" + fileName);
            files.get(i).transferTo(file);
        }
        Book book = new Book(bookName, Integer.parseInt(bDSid), author, publish, publishDate, Integer.parseInt(bDBid), Integer.parseInt(bBid), Integer.parseInt(bSid), Double.parseDouble(originalPrice), Double.parseDouble(discountedPrice), description, Integer.parseInt(amount), smallImage0);
        book.setSmallImage1(smallImage1);
        book.setSmallImage2(smallImage2);
        book.setSmallImage3(smallImage3);
        book.setSmallImage4(smallImage4);
        book.setBookCode(bookCode);
        book.setLink("goodToDetail");
        book.setNewBookFavorite(iBookClassMapper.queryBigDetailType(Integer.parseInt(bDBid)));
        book.setBussinessId(Integer.parseInt(bussinessId));
        iBookService.saveBook(book);

        book.setBookId(book.getId());
        //书籍预销售插入
        if (DateUtils.compare_date(DateUtils.getCurrentTime(), publishDate) <= 0 || (DateUtils.daysBetween(publishDate, DateUtils.getCurrentTime()) <= 90 && (DateUtils.daysBetween(publishDate, DateUtils.getCurrentTime()) >= 0))) {
            if (DateUtils.compare_date(DateUtils.getCurrentTime(), publishDate) <= 0) {
                book.setStatus(2);
            } else {
                book.setStatus(1);
            }
            iNewHotBookService.insertNewBook(book);
        }
        //插入查询帮助
        BookDto bookDto = new BookDto();
        bookDto.setPublish(publishDate);
        bookDto.setAuthor(author);
        bookDto.setBookName(bookName);
        bookDto.setbDBid(Integer.parseInt(bDBid));
        bookDto.setBookCode(bookCode);
        bookDto.setBookId(book.getId());
        iQueryHelpService.insertQueryHelp(bookDto);
        return "添加成功";
    }

    @RequestMapping(value = "/bookDelete", method = RequestMethod.POST)
    @ResponseBody
    public String deleteBook(@RequestParam("id") String id, @RequestParam("bDBid") String bDBid, HttpServletRequest request) {
        BackMsg msg = new BackMsg();
        iBookService.deleteBook(Integer.parseInt(id), Integer.parseInt(bDBid));
        return ResponseHelp.responseText(msg);
    }

    /**
     * 获取要更新的书籍信息
     *
     * @param id
     * @param bDBid
     * @param request
     * @param reponse
     */
    @RequestMapping(value = "/updateBook", method = RequestMethod.GET)
    public void updateBook(@RequestParam("id") String id, @RequestParam("bDBid") String bDBid, HttpServletRequest request, HttpServletResponse reponse) {
        Book bt = iBookService.queryBook(Integer.parseInt(id), Integer.parseInt(bDBid));
        logger.info("bt" + bt);
        request.getSession().setAttribute("bt", bt);
        try {
            request.getRequestDispatcher("/WEB-INF/jsp/good/book/book_update.jsp").forward(request, reponse);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/bookUpdate", method = RequestMethod.POST)
    @ResponseBody
    public String updateBook(HttpServletRequest request) throws IOException {
        BackMsg msg = new BackMsg();
        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        String flag = req.getParameter("flag");
        String id = req.getParameter("Id");
        String bookName = req.getParameter("bookName");
        String bDSid = req.getParameter("bDSid");
        String author = req.getParameter("author");
        String publish = req.getParameter("publish");
        String publishDate = req.getParameter("publishDate");
        String bDBid = req.getParameter("bDBid");
        String bBid = req.getParameter("bBid");
        String bSid = req.getParameter("bSid");
        String originalPrice = req.getParameter("originalPrice");
        String discountedPrice = req.getParameter("discountedPrice");
        String description = req.getParameter("description");
        String amount = req.getParameter("Amount");
        Integer bookCode = StringUtil.getBookCode();
        String bDBidType = iBookClassMapper.queryBigDetailType(Integer.parseInt(bDBid));
        //将文件上传到指定的服务器文件
        String path = request.getSession().getServletContext().getRealPath("\\WEB-INF\\classes\\static\\assets\\images/");
        logger.info("path" + path);
        logger.info("files" + files.get(0).getOriginalFilename());

        String smallImage0 = null;
        String smallImage1 = null;
        String smallImage2 = null;
        String smallImage3 = null;
        String smallImage4 = null;
        for (int i = 0; i < files.size(); i++) {

            String fileName = files.get(i).getOriginalFilename();
            if (i == 0) {
                smallImage0 = fileName;
            }
            if (i == 1) {
                smallImage1 = fileName;
            }
            if (i == 2) {
                smallImage2 = fileName;
            }
            if (i == 3) {
                smallImage3 = fileName;
            }
            if (i == 4) {
                smallImage4 = fileName;
            }
            logger.info("files-----------" + files.get(i).getOriginalFilename());
            File file = new File(path + "/" + fileName);
            files.get(i).transferTo(file);
        }
        Book book = new Book(Integer.parseInt(id), bookName, Integer.parseInt(bDSid), author, publish, Integer.parseInt(bDBid), Integer.parseInt(bBid), Integer.parseInt(bSid), Double.parseDouble(originalPrice), Double.parseDouble(discountedPrice), description, Integer.parseInt(amount), smallImage0);
        book.setSmallImage1(smallImage1);
        book.setSmallImage2(smallImage2);
        book.setSmallImage3(smallImage3);
        book.setSmallImage4(smallImage4);
        book.setPublishDate(publishDate);


        BookDto bookDto = new BookDto();
        bookDto.setBookCode(bookCode);
        bookDto.setbDBid(Integer.parseInt(bDBid));
        bookDto.setBookName(bookName);
        bookDto.setAuthor(author);
        bookDto.setPublish(publish);
        //如果二级大分类相等
        if (flag.equals(bDBid)) {
            iBookService.updateBook(book);
            iQueryHelpService.updateQueryHelp(bookDto);
            if (DateUtils.compare_date(DateUtils.getCurrentTime(), publishDate) <= 0 || (DateUtils.daysBetween(publishDate, DateUtils.getCurrentTime()) <= 90 && (DateUtils.daysBetween(publishDate, DateUtils.getCurrentTime()) >= 0))) {
                if (DateUtils.compare_date(DateUtils.getCurrentTime(), publishDate) <= 0) {
                    book.setStatus(2);
                } else {
                    book.setStatus(1);
                }
                book.setBookId(Integer.parseInt(id));
                iNewHotBookService.updateNewBook(book);
            } else {
                logger.info("book" + book);
                iNewHotBookService.deleteNewBook(book);
            }

            return "更新成功";
        } else {
            iQueryHelpService.updateQueryHelp(bookDto);
            book.setBookCode(bookCode);
            book.setNewBookFavorite(bDBidType);
            if (iBookService.saveBook(book) > 0) {
                iBookService.deleteBook(Integer.parseInt(id), Integer.parseInt(flag));
                Book book1 = new Book();
                book1.setBookId(Integer.parseInt(id));
                book1.setbDBid(Integer.parseInt(flag));
                iNewHotBookService.deleteNewBook(book1);
                book.setBookId(book.getId());
                iNewHotBookService.insertNewBook(book);
            }
            return "保存成功，并删除了原数据库表中数据";
        }
    }

    @RequestMapping(value = "/queryBookList", method = RequestMethod.POST)
    @ResponseBody
    public PageInfo queryBookList(@RequestParam Map<String, String> map) {
        PageInfo pageInfo = iBookService.queryBookList(map);
        logger.info("list " + pageInfo.getList().size());
        return pageInfo;
    }

    //-------------------------------------------------------------------------------------------------------查询所有大类
    @RequestMapping(value = "queryBigTypeList", method = RequestMethod.POST)
    @ResponseBody
    public List<BookBigClass> queryBigTypeList() {
        return iBookClassService.queryBigTypeList();
    }


    /**
     * 通过一级大分类的ID获取所有的一级小分类
     *
     * @param bBid
     * @return
     */
    @RequestMapping(value = "querySmallTypeList", method = RequestMethod.POST)
    @ResponseBody
    public List<BookSmallClass> querySmallTypeList(@RequestParam("bBid") String bBid) {
        return iBookClassService.querySmallTypeList(Integer.parseInt(bBid));
    }

    /**
     * 根据一级小分类获取二级所有二级大分类
     *
     * @param bSid
     * @return
     */
    @RequestMapping(value = "queryDetailBigTypeList", method = RequestMethod.POST)
    @ResponseBody
    public List<BookDetailBigClass> queryDetailBigTypeList(@RequestParam("bSid") String bSid) {
        return iBookClassService.queryDetailBigTypeList(Integer.parseInt(bSid));
    }

    @RequestMapping(value = "queryDetailSmallTypeList", method = RequestMethod.POST)
    @ResponseBody
    public List<BookDetailSmallClass> queryDetailSmallTypeList(@RequestParam("bDBid") String bDBid) {
        return iBookClassService.queryDetailSmallTypeList(Integer.parseInt(bDBid));
    }

    @RequestMapping(value = "queryBigSmall", method = RequestMethod.POST)
    @ResponseBody
    public List<BigSmallDto> queryBigSmall() {
        return iBookClassService.queryBigSmall();
    }

    @RequestMapping(value = "querySub", method = RequestMethod.POST)
    @ResponseBody
    public List<Sub> querySub() {
        return iBookClassService.querySub();
    }

    @RequestMapping(value = "queryNewBookList", method = RequestMethod.POST)
    @ResponseBody
    public PageInfo queryNewBookList(@RequestParam("pageNum") int pageNum) {
        return iBookService.queryNewBookList(pageNum);
    }

    @RequestMapping(value = "goodToDetail", method = RequestMethod.GET)
    @ResponseBody
    public void goodToDetail(HttpServletRequest request, HttpServletResponse response) {
        int bDBid = Integer.parseInt(request.getParameter("bDBid"));
        int bookId = Integer.parseInt(request.getParameter("bookId"));
        //根据这两个参数查找对应的商品
        logger.info("bDBid" + bDBid + "bookId" + bookId);
        Book book = iBookService.queryBook(bookId, bDBid);
        BookDto bookDto = new BookDto();
        BeanUtils.copyProperties(book, bookDto);
        bookDto.setDiscountedAfterPrice(new DecimalFormat("###,###,###.##").format(bookDto.getDiscountedPrice() * bookDto.getOriginalPrice()));
        request.setAttribute("bookDto", bookDto);
        logger.info("bookDto", bookDto);
        try {
            request.getRequestDispatcher("/WEB-INF/jsp/fontpage/main/productDetail.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //----------------------------------------------------------------预销售
    @RequestMapping(value = "/queryPresell", method = RequestMethod.POST)
    @ResponseBody
    public PageInfo presell(@RequestParam("pageNum") int pageNum) {
        return iPresellService.queryPresellBook(pageNum);
    }

    //  --*------------------------------------------------------------新书热卖榜
    @RequestMapping(value = "/queryNewHotBook", method = RequestMethod.POST)
    @ResponseBody
    public PageInfo newHotBook(@RequestParam("type") String type, @RequestParam("pageNum") int pageNum) {
        return iNewHotBookService.queryNewHotBook(type, pageNum);
    }

    //------------------------------------------------------------------独家推荐
    @RequestMapping(value = "/exclusivePush", method = RequestMethod.POST)
    @ResponseBody
    public PageInfo exclusivePush(@RequestParam("type") String type, @RequestParam("pageNum") int pageNum) {
        return iExclusivePushService.queryExclusivePush(type, pageNum);
    }

    //-------------------------------------------------------------------图书畅销版
    @RequestMapping(value = "/querySellBook", method = RequestMethod.POST)
    @ResponseBody
    public PageInfo querySellBook(@RequestParam("pageNum") int pageNum, @RequestParam("type") String type) {
        return iBookService.querySellBook(pageNum, type);
    }

    //-------------------------------------------------------------------搜索框
    @RequestMapping(value = "/toBookList", method = RequestMethod.POST)
    public String toBookList(@RequestParam("key") String key, HttpServletRequest request) {
        List<String> list = new ArrayList<String>();
        list.add(key);
        request.getSession().setAttribute("searchList", list);
        logger.info("key---" + key + "type:--" + key.getClass());
        if (key.equals("")) {
            return "fontpage/main/main";
        } else {
            QueryHelp queryHelp = iQueryHelpService.queryBDBid(key);
            if (queryHelp == null) {
                return "fontpage/main/main";
            } else {
                return "fontpage/main/bookList";
            }
        }
    }

    @RequestMapping(value = "/queryBookList", method = RequestMethod.GET)
    @ResponseBody
    public PageInfo queryBookList(HttpServletRequest request) {
        List<String> searchList = (List<String>) request.getSession().getAttribute("searchList");
        String key = searchList.get(searchList.size() - 1);
        logger.info("key---" + key + "type:--" + key.getClass());
        QueryHelp queryHelp = iQueryHelpService.queryBDBid(key);
        logger.info("queryHelp" + queryHelp);
        PageInfo pageInfo = iBookService.querySearchBookList(queryHelp.getbDBid(), queryHelp.getBookCode());
        return pageInfo;
    }


    //----------------------------------------------------------------------------------------------------------新后台框架

    @RequestMapping("/book/bookIndex")
    public String goBookPage() {
        logger.info("进入书本管理界面");
        return "/good/book/book_index";
    }

    @RequestMapping(value = "/good/getBookPage",method = RequestMethod.POST)
    @ResponseBody
    public String getBookPage(HttpServletRequest request) {
        String bookName= request.getParameter("bookName");
        String pageNumber=request.getParameter("pageNumber");
        String author=request.getParameter("author");
        String bDBid=request.getParameter("bDBid");
        String publish=request.getParameter("publish");
        String backUser= (String) request.getSession().getAttribute("backUser");
        int backFlag= (int) request.getSession().getAttribute("backFlag");
        HashMap<String,String> map=new HashMap<>();
        if(bookName==null ||bookName.equals("")){
            map.put("bookName",null);
        }else{
            map.put("bookName",bookName);
        }
        if(author==null || author.equals("") ){
            map.put("author",null);
        }else{
            map.put("author",author);
        }
        if(publish==null ||publish.equals("")){
            map.put("publish",null);
        }else{
            map.put("publish",publish);
        }
        map.put("bDBid",bDBid);
        map.put("bussinessId",backUser);

        PageUtils Page = new PageUtils(pageNumber);
        if(backFlag==1) {
            logger.info("come into backFlag==1");
            Page = iBookService.goBookPages(Page, map);
        }else{
            Page=iBookService.goBookPages1(Page, map);
        }
        return ResponseHelp.responseText(Page);
    }

    //------------------------------------------------------------------------------------------------------------类别管理
    @RequestMapping("/class/goBigClassIndex")
    public String goToBigClassIndex() {
        return "good/class/bigclass_index";
    }

    @RequestMapping("/class/goSmallClassIndex")
    public String goToSmallClassIndex() {
        return "good/class/smallclass_index";
    }

    @RequestMapping("/class/goBigDetailClassIndex")
    public String goToBigDetailClassIndex() {
        return "good/class/bigdetailclass_index";
    }

    @RequestMapping("/class/goSmallDetailClassIndex")
    public String goToSmallDetailClassIndex() {
        return "good/class/smalldetailclass_index";
    }

    @RequestMapping(value = "/class/queryBigTypeList", method = RequestMethod.POST)
    @ResponseBody
    public String queryBigTypeList(HttpServletRequest request) {

        String pageNumber = request.getParameter("pageNumber");
        PageUtils pageUtils = new PageUtils(pageNumber);
        pageUtils = iBookClassService.queryBigTypeList(pageUtils);
        return ResponseHelp.responseText(pageUtils);
    }

    @RequestMapping(value = "/class/querySmallTypeList", method = RequestMethod.POST)
    @ResponseBody
    public String querySmallTypeList(HttpServletRequest request) {

        String pageNumber = request.getParameter("pageNumber");
        PageUtils pageUtils = new PageUtils(pageNumber);
        pageUtils = iBookClassService.querySmallTypeList(pageUtils);
        return ResponseHelp.responseText(pageUtils);
    }

    @RequestMapping(value = "/class/queryBigDetailTypeList", method = RequestMethod.POST)
    @ResponseBody
    public String queryBigDetailTypeList(HttpServletRequest request) {

        String pageNumber = request.getParameter("pageNumber");
        PageUtils pageUtils = new PageUtils(pageNumber);
        pageUtils = iBookClassService.queryBigDetailTypeList(pageUtils);
        return ResponseHelp.responseText(pageUtils);
    }

    @RequestMapping(value = "/class/querySmallDetailTypeList", method = RequestMethod.POST)
    @ResponseBody
    public String querySmallDetailTypeList(HttpServletRequest request) {

        String pageNumber = request.getParameter("pageNumber");
        PageUtils pageUtils = new PageUtils(pageNumber);
        pageUtils = iBookClassService.querySmallDetailTypeList(pageUtils);
        return ResponseHelp.responseText(pageUtils);
    }

    @RequestMapping("/class/goToClassAddPage")
    public String goToClassAddPage() {
        return "good/class/class_add";
    }


    @RequestMapping("/class/goToBigDetailClassUpdatePage")
    public String goToBigDetailClassUpdatePage(Model model, HttpServletRequest request) {
        int bDBid = Integer.parseInt(request.getParameter("bDBid"));
        BookDetailBigClass bigDetail = iBookClassService.queryBigDetailType1(bDBid);
        model.addAttribute("bigDetail", bigDetail);
        return "good/class/bigdetailclass_update";
    }

    @RequestMapping("/class/updateBookBigDeail")
    @ResponseBody
    public String bigDetailToBook(HttpServletRequest request) {
        BackMsg backMsg = new BackMsg();
        String bDBid = request.getParameter("bDBid");
        String bDBigDetail = request.getParameter("bDBigDetail");
        String bSid = request.getParameter("bSid");
        String recommendFlag = request.getParameter("recommendFlag");
        String link = request.getParameter("link");
        link = link + "?bDBid=" + bDBid;
        BookDetailBigClass bookDetailBigClass = new BookDetailBigClass();
        bookDetailBigClass.setbDBid(bDBid.equals("") ? null : Integer.parseInt(bDBid));
        bookDetailBigClass.setbSid(Integer.parseInt(bSid));
        bookDetailBigClass.setLink(link);
        bookDetailBigClass.setbDBigDetail(bDBigDetail);
        bookDetailBigClass.setRecommendFlag(Integer.parseInt(recommendFlag));
        boolean flag = iBookClassService.updateBigDetail(bookDetailBigClass);
        backMsg.setStatus(flag);
        return ResponseHelp.responseText(backMsg);
    }

    //------------------------------------------------------------------------------------------------------------类别管理
    @RequestMapping("/class/bigClassDelete")
    @ResponseBody
    public String bigClassDelete(@RequestParam("bBid") int bBid) {
        BackMsg msg = new BackMsg();
        boolean flag = iBookClassService.deleteBigTypeByBBid(bBid);
        msg.setStatus(flag);
        return ResponseHelp.responseText(msg);
    }

    @RequestMapping("/class/smallClassDel")
    @ResponseBody
    public String smallClassDelete(@RequestParam("bSid") int bSid) {
        BackMsg msg = new BackMsg();
        boolean flag = iBookClassService.deleteBSTypeByBSid(bSid);
        msg.setStatus(flag);
        return ResponseHelp.responseText(msg);
    }


    @RequestMapping("/class/bigDetailClassDel")
    @ResponseBody
    public String bigDetailClassDel(@RequestParam("bDBid") int bDBid) {
        BackMsg msg = new BackMsg();
        boolean flag = iBookClassService.deleteBDBigDetail(bDBid);
        msg.setStatus(flag);
        return ResponseHelp.responseText(msg);
    }

    @RequestMapping("/class/smallDetailClassDel")
    @ResponseBody
    public String smallDetailClassDel(@RequestParam("bDSid") int bDSid) {
        BackMsg msg = new BackMsg();
        boolean flag = iBookClassService.deleteBDSmallType(bDSid);
        msg.setStatus(flag);
        return ResponseHelp.responseText(msg);
    }


    @RequestMapping("good/bigDetailToBook")

    public String bigDetailToBookList(HttpServletRequest request, Model model) {
        if (!request.getParameter("bDBid").equals("")) {
            String bDBid = (request.getParameter("bDBid"));
            List<Book> booklist = iBookService.queryAllBook(Integer.parseInt(bDBid));
            model.addAttribute("booklist", booklist);
            return "good/book/bigDetailToBookList";
        }
        return "error";
    }

    //--------------------------------------------------------------------------------------------------------------独家推荐
    @RequestMapping("good/goToExplusiveIndex")
    public String goToExplusiveIndex() {
        return "/good/book/explusive_index";
    }


    @RequestMapping("/good/getExplusivePageData")
    @ResponseBody
    public String getExplusivePageData(HttpServletRequest request) {
        String pageNumber = request.getParameter("pageNumber");
        PageUtils pageUtils = new PageUtils(pageNumber);
        pageUtils = iExclusivePushService.getRecommendList(pageUtils);
        return ResponseHelp.responseText(pageUtils);
    }

    @RequestMapping("/good/goToExplusiveAddPage")
    public String goToExplusiveAddPage() {
        return "/good/book/explusive_add";
    }

    @RequestMapping("/good/ExplusiveAdd")
    @ResponseBody
    public String ExplusiveAdd(HttpServletRequest request) {
        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        String bookName = req.getParameter("bookName");
        String bDSid = req.getParameter("bDSid");
        String author = req.getParameter("author");
        String publish = req.getParameter("publish");
        String publishDate = req.getParameter("publishDate");
        String bDBid = req.getParameter("bDBid");
        String bBid = req.getParameter("bBid");
        String bSid = req.getParameter("bSid");
        String originalPrice = req.getParameter("originalPrice");
        String discountedPrice = req.getParameter("discountedPrice");
        String description = req.getParameter("description");
        String amount = req.getParameter("Amount");
        String backUser= (String) request.getSession().getAttribute("backUser");
        //将文件上传到指定的服务器文件
        String path = request.getSession().getServletContext().getRealPath("\\WEB-INF\\classes\\static\\assets\\images/");
        logger.info("path" + path);
        logger.info("files" + files.get(0).getOriginalFilename());

        String smallImage0 = null;
        String smallImage1 = null;
        String smallImage2 = null;
        String smallImage3 = null;
        String smallImage4 = null;
        Integer bookCode = StringUtil.getBookCode();
        for (int i = 0; i < files.size(); i++) {

            String fileName = files.get(i).getOriginalFilename();
            if (i == 0) {
                smallImage0 = fileName;
            }
            if (i == 1) {
                smallImage1 = fileName;
            }
            if (i == 2) {
                smallImage2 = fileName;
            }
            if (i == 3) {
                smallImage3 = fileName;
            }
            if (i == 4) {
                smallImage4 = fileName;
            }
            logger.info("files-----------" + files.get(i).getOriginalFilename());
            File file = new File(path + "/" + fileName);
            try {
                files.get(i).transferTo(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Book book = new Book(bookName, Integer.parseInt(bDSid), author, publish, publishDate, Integer.parseInt(bDBid), Integer.parseInt(bBid), Integer.parseInt(bSid), Double.parseDouble(originalPrice), Double.parseDouble(discountedPrice), description, Integer.parseInt(amount), smallImage0);
        book.setSmallImage1(smallImage1);
        book.setSmallImage2(smallImage2);
        book.setSmallImage3(smallImage3);
        book.setSmallImage4(smallImage4);
        book.setBookCode(bookCode);
        book.setBussinessId(Integer.parseInt(backUser));
        book.setNewBookFavorite(iBookClassMapper.queryBigDetailType(Integer.parseInt(bDBid)));
        iBookService.saveBook(book);
        boolean flag = iExclusivePushService.addRecommend(book);

        return "添加成功";
    }

    @RequestMapping("/good/ExplusiveDel")
    @ResponseBody
    public String ExplusiveDel(HttpServletRequest request) {
        BackMsg msg = new BackMsg();
        int id = Integer.parseInt(request.getParameter("id"));
        Book book = new Book();
        book.setId(id);
        boolean flag = iExclusivePushService.deleteRecommend(book);
        msg.setStatus(flag);
        return ResponseHelp.responseText(msg);

    }

    //--------------------------------------------------------------------------------------------------------------商品的收藏

    @RequestMapping(value = "/bookCollection", method = RequestMethod.POST)
    @ResponseBody
    public int bookCollection(@RequestParam("bookId") String bookId, @RequestParam("bDBid") String bDBid, HttpServletRequest request) {
        int uid = (int) request.getSession().getAttribute("fontUser");
        if (bookId != null && bDBid != null) {
            Collection collection = iBookService.collectionIsExist(Integer.parseInt(bookId), Integer.parseInt(bDBid), uid);
            if (collection == null) {
                logger.info("此时收藏表中不存在此数据，要进行插入");
                boolean flag = iBookService.bookCollection(Integer.parseInt(bookId), Integer.parseInt(bDBid), uid);
                if (flag) {
                    return iBookService.collectionAmount(uid);
                }else{
                    return iBookService.collectionAmount(uid);
                }
            } else {
                logger.info("此时收藏表中存在此数据，要进行更新");
                boolean flag = iBookService.updateCollectionStatus(collection.getId(), collection.getStatus() == 1 ? 1 : 1);
                if (flag) {
                    return iBookService.collectionAmount(uid);
                }else{
                    return iBookService.collectionAmount(uid);
                }
            }
        } else {
            return 0;
        }
    }

    @RequestMapping(value = "/bookCollection1", method = RequestMethod.GET)
    public String bookCollection1(@RequestParam("carId") String carId, HttpServletRequest request) {
        int uid = (int) request.getSession().getAttribute("fontUser");
        Cart cart=iCartService.selectByPrimaryKey(Integer.parseInt(carId));
        if(cart!=null) {
            Collection collection = iBookService.collectionIsExist(cart.getGoodsId(), cart.getbDBid(), uid);
            if (collection == null) {
                logger.info("此时收藏表中不存在此数据，要进行插入");
                boolean flag = iBookService.bookCollection(cart.getGoodsId(), cart.getbDBid(), uid);
                return "/fontpage/main/collection";
            } else {
                logger.info("此时收藏表中存在此数据，要进行更新");
                boolean flag = iBookService.updateCollectionStatus(collection.getId(), collection.getStatus() == 1 ? 1 : 1);
                return "/fontpage/main/collection";
            }
        }else{
            logger.info("不存在此商品");
            return "/fontpage/main/collection";
        }

    }

    @RequestMapping(value="toMyCollection",method = RequestMethod.GET)
    public String toMyCollection(){
        return "/fontpage/main/collection";
    }

    @RequestMapping(value="/getCollecton",method = RequestMethod.GET)
    @ResponseBody
    public PageInfo getCollecton(HttpServletRequest request){
        Integer uid= (int) request.getSession().getAttribute("fontUser");
        HashMap map=new HashMap();
        map.put("pageNumber","1");
        map.put("pageSize","10");
        map.put("uid",uid+"");
        PageInfo pageInfo=iBookService.findAllBookCollection(map);
        logger.info("pageInfo++收藏"+pageInfo.getList());
        return pageInfo;
    }

    @RequestMapping(value="/collectionDelete",method = RequestMethod.GET)
    public String collectionDelete(@RequestParam("bookId")String bookId,@RequestParam("bDBid")String bDBid,HttpServletRequest request){
        Integer uid= (int) request.getSession().getAttribute("fontUser");
        boolean flag=iBookService.collectionDelete(bookId,bDBid,uid+"");
        if(flag){
            logger.info("删除收藏成功");return "/fontpage/main/collection";
        }else{
            logger.info("删除收藏失败");return "/fontpage/main/collection";
        }
    }
}
