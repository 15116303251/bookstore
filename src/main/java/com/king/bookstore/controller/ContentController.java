package com.king.bookstore.controller;

import com.king.bookstore.common.inteface.service.IContentService;
import com.king.bookstore.common.pojo.Content;
import com.king.bookstore.utils.AbstractLogger;
import com.king.bookstore.utils.BackMsg;
import com.king.bookstore.utils.PageUtils;
import com.king.bookstore.utils.ResponseHelp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ContentController extends AbstractLogger{

    @Autowired
    IContentService iContentService;

    @RequestMapping(value="/queryContent",method = RequestMethod.GET )
    @ResponseBody
    public List<Content> queryContent(){
        return iContentService.queryContent();
    }

    @RequestMapping("/content/goContentIndex")
    public String goToContentIndex(){
        return "/content/content_index";
    }

    @RequestMapping("/content/getContentPage")
    @ResponseBody
    public String getContentPage(Model model, HttpServletRequest request){
        logger.info("进入到公告分页界面");
        String page=request.getParameter("pageNumber");
        PageUtils pageUtils=new PageUtils(page);
        pageUtils=iContentService.queryContent(pageUtils);
        return ResponseHelp.responseText(pageUtils);
    }

    @RequestMapping("/content/goToContentAddPage")
    public String goToContentAddPage(){
        return "/content/content_add";
    }

    @RequestMapping("/content/contentAdd")
    @ResponseBody
    public String ContentAdd(HttpServletRequest request){
        BackMsg msg =new BackMsg();
        String content=request.getParameter("content");
        String flag=request.getParameter("flag");
        String href=request.getParameter("href");
        Content content1=new Content();
        content1.setContent(content);
        content1.setFlag(Integer.parseInt(flag));
        content1.setHref(href);
        boolean status=iContentService.insertContent(content1);
        msg.setStatus(status);
        return ResponseHelp.responseText(msg);
    }

    @RequestMapping("content/contentDel")
    @ResponseBody
    public String deleteContent(@RequestParam("id")int id){
        BackMsg msg=new BackMsg();
        boolean flag=iContentService.deleteContent(id);
        msg.setStatus(flag);
        return ResponseHelp.responseText(msg);
    }
}
