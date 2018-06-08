package com.king.bookstore.controller;
import com.github.pagehelper.PageInfo;
import com.king.bookstore.common.inteface.service.IMenuService;
import com.king.bookstore.common.inteface.service.IUserService;
import com.king.bookstore.common.pojo.Account;
import com.king.bookstore.common.pojo.AccountExample;
import com.king.bookstore.common.pojo.Company;
import com.king.bookstore.common.pojo.Tree;
import com.king.bookstore.utils.BackMsg;
import com.king.bookstore.utils.PageUtils;
import com.king.bookstore.utils.ResponseHelp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class UserController{

    private Logger logger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private IUserService iUserService;
    @Autowired
    private IMenuService menuService;

    /**
     * 点击退出时跳转登录界面
     * @return
     */
    @RequestMapping(value="/UserExit",method= RequestMethod.GET)
    public String  UserExit(){
        return "/fontpage/user/fontLogin";
    }

//--------------------------------------------------------------------------------------------------------------前后端登录
    /**
     * 用户登录并验证用户是否存在
     * @param map 用来接受参数的map
     */
    @RequestMapping(value="/backlogin",method=RequestMethod.POST)
    public String login(@RequestParam Map<String ,String> map,HttpServletRequest request,Model model){
        String username=map.get("username");
        String password=map.get("password");
        Company company=null;
        if(username!=null && password!=null){
            company =iUserService.queryErpUserByNameAndPsd(username,password);
        }
        if(company!=null){
            if(company.getFlag()==1){
                List<Tree> menus = menuService.selectTreeNodes(0L);
                model.addAttribute("menus", menus);
                request.getSession().setAttribute("backUser",company.getCompanyId());
                request.getSession().setAttribute("backFlag",company.getFlag());
                request.getSession().setAttribute("backName",company.getErpUserName());
            }else{
                List<Tree> menus = menuService.selectTreeNodes1(0L,"商品管理");
                model.addAttribute("menus", menus);
                 request.getSession().setAttribute("backUser",company.getCompanyId());
                 request.getSession().setAttribute("backFlag",company.getFlag());
                 request.getSession().setAttribute("backName",company.getErpUserName());
            }
            return "backpage/backIndex";
        }else{
            return "backpage/login";
        }
    }

    /**
     * 用户登录并验证用户是否存在
     * @param map 用来接受参数的map
     */
    @RequestMapping(value="/fontlogin",method=RequestMethod.POST)
    public String fontLogin(@RequestParam Map<String ,String> map,HttpServletRequest request){
        String username=map.get("username");
        String password=map.get("password");
        Account account=null;
        if(username!=null && password!=null){
            account=iUserService.queryAccountByNameAndPsd(username,password);
        }
        if(account!=null){
            request.getSession().setAttribute("fontUser",account.getUserId());
            request.getSession().setAttribute("fontUserName",account.getUserName());
            return "fontpage/main/main";
        }else{
            return "fontpage/user/fontLogin";
        }
    }
//---------------------------------------------------------------------------------------------------------------用户注册
    /**
     * 普通用户注册
     * @param map
     * @return
     */
    @RequestMapping(value="/register",method =RequestMethod.POST)
    public String userRegister(@RequestParam Map<String,String> map){
        return iUserService.registerUser(map);
    }

    @RequestMapping(value="/deleteUser" ,method=RequestMethod.GET)

    public String deleteUserById(@RequestParam("userId")String userId){
//        return iUserService.deleteAccountById(Integer.parseInt(userId));
          System.out.println(iUserService.deleteAccountById(Integer.parseInt(userId)));
          return "/backpage/userIndex";
    }

    @RequestMapping(value="/deleteErpUser" ,method=RequestMethod.GET)
    public String deleteErpUserById(@RequestParam("erpUserId")String erpUserId){
//        return iUserService.deleteAccountById(Integer.parseInt(userId));
        System.out.println(iUserService.deleteErpAccountById(Integer.parseInt(erpUserId)));
        return "backpage/erpUserIndex";
    }

    @RequestMapping(value="/toErpRegister",method=RequestMethod.GET)
    public String toErpRegister(){
        return "backpage/erpRegister";
    }

    /**
     * 企业用户注册
     * @param map
     * @return
     */
    @RequestMapping(value="/erpRegister",method=RequestMethod.POST)
    public String erpRegister(@RequestParam Map<String,String> map){
        return iUserService.erpRegister(map);
    }

    /**
     * 更新用户信息
     * @param map
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/updateAccount",method= RequestMethod.POST)
    public String updateAccount(@RequestParam Map<String ,String> map,HttpServletRequest request,HttpServletResponse response){
        Account account=new Account();
        account.setUserSex(map.get("userSex").equals("")?null:map.get("userSex"));
        account.setUserBirthday(map.get("userBirthday").equals("")?null:map.get("userBirthday"));
        account.setUserTel(map.get("userTel").equals("")?null:map.get("userTel"));
        account.setUserState(Integer.parseInt(map.get("userState").equals("")?"-1":map.get("userState")));
        account.setUserProvince(map.get("userProvince").equals("")?null:map.get("userProvince"));
        account.setUserCity(map.get("userCity").equals("")?null:map.get("userCity"));
        account.setUserId(Integer.parseInt(map.get("userId")));
        account.setUserEmail(map.get("userEmail").equals("")?null:map.get("userEmail"));
        account.setUserName(map.get("userName").equals("")?null:map.get("userName"));
        account.setGrade(Integer.parseInt(map.get("grade").equals("")?"0":map.get("grade")));
        iUserService.updateAccount(account);
        return "/backpage/userIndex";
    }

    @RequestMapping(value="/updateAccountById",method=RequestMethod.GET)
    public void updateAccountById(@RequestParam("userId")String userId,HttpServletRequest request,HttpServletResponse response){
        try {
            Account account=iUserService.updatePage(Integer.parseInt(userId));
            request.setAttribute("account",account);
            logger.info("update success "+account);
            request.getRequestDispatcher("/WEB-INF/jsp/fontpage/user/updateUser.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value="/updateErpAccountById",method=RequestMethod.GET)
    public void updateErpAccountById(@RequestParam("erpUserId")String erpUserId,HttpServletRequest request,HttpServletResponse response){
        try {
            Company company=iUserService.updateErpPage(Integer.parseInt(erpUserId));
            request.setAttribute("company",company);
            logger.info("update success "+company);
            request.getRequestDispatcher("/WEB-INF/jsp/backpage/updateErpUser.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 更新企业用户信息
     * @param map
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/updateErpAccount",method= RequestMethod.POST)
    public String updateErpAccount(@RequestParam Map<String ,String> map,HttpServletRequest request,HttpServletResponse response){
        Company company=new Company();
        company.setCompanyAdd(map.get("companyAdd"));
        company.setCompanyEmail(map.get("companyEmail"));
        company.setCompanyId(map.get("companyId"));
        company.setCompanyName(map.get("companyName"));
        company.setLinkUserPhone(map.get("linkUserPhone"));
        company.setErpUserName(map.get("erpUserName"));
        company.setLinkUser(map.get("linkUser"));
        company.setCompanyTel(map.get("companyTel"));
        logger.info("cone into company");
        iUserService.updateErpAccount(company);
        return "backpage/erpUserIndex";
    }

    /**
     * 查询按页码返回的用户信息
     * @param map
     * @return
     */
    @RequestMapping(value="/queryAccountList",method = RequestMethod.POST)
    @ResponseBody
    public PageInfo queryAccount(@RequestParam Map<String ,String> map){
        PageInfo pageInfo=iUserService.queryAccountList(map);
        logger.info("list "+pageInfo.getList().size());
        return pageInfo;
    }

    /**
     * 返回按页码返回的企业用户信息
     * @param map
     * @return
     */
    @RequestMapping(value="/queryCompanyList",method = RequestMethod.POST)
    @ResponseBody
    public PageInfo queryCompanyList(@RequestParam Map<String ,String> map){
        logger.info("come into companyList");
        PageInfo pageInfo=iUserService.queryCompanyList(map);
        return pageInfo;
    }

    // 跳转企业用户查询
    @RequestMapping(value="/erpUserIndex",method = RequestMethod.GET)
    public String toErpUserIndex(){
        return "backpage/erpUserIndex";
    }

    // 跳转普通用户查询
    @RequestMapping(value="/userIndex",method = RequestMethod.GET)
    public String toUserIndex(){
        return "backpage/userIndex";
    }

    // 跳转普通用户查询
    @RequestMapping(value="/classAdd",method = RequestMethod.GET)
    public String toClassAdd(){
        return "backpage/classAdd";
    }

    // 跳转企业用户注册界面
    @RequestMapping(value="/toErpUserResiger",method = RequestMethod.GET)
    public String toErpUserResiger(){
        return "backpage/erpRegister";
    }

    // 跳转普通用户注册界面
    @RequestMapping(value="/toUserResiger",method = RequestMethod.GET)
    public String toUserResiger(){
        return "fontpage/user/register";
    }






    //-------------------------------------------------------------------------------------------------------新的后台框架
    @RequestMapping("/system/userIndex")
    public String goUserIndex(Model model){
        logger.info("进入用户管理界面");
        return "/system/user/user_index";
    }

    /**
     * 用户列表分页数据
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping("/system/getUserPage")
    public String getPageData(Model model,HttpServletRequest request){
        logger.info(">>> 进入用户分页列表");
        String page = request.getParameter("pageNumber");
        String username = request.getParameter("userName");

        AccountExample example = new AccountExample();
        AccountExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike("%"+username+"%");
        }

        PageUtils Page = new PageUtils(page);
        Page.setQueryParames(example);
        Page = iUserService.getUserPages(Page);
        return ResponseHelp.responseText(Page);
    }

    @RequestMapping("/system/goAddUserPage")
    public String goAddUserPage(Model model){
        logger.info("进入用户添加界面");
//        List<Organization> list = organizationService.selectByExample(null);
//        model.addAttribute("organizationList", list);
        return "/system/user/user_add";
    }

    /**
     * 添加用户
     * @return
     */
    @ResponseBody
    @RequestMapping("/system/userAdd")
    public String userAdd(@RequestParam Map<String,String> map){
         iUserService.registerUser(map);
        return ResponseHelp.responseText();

    }

    @RequestMapping("/system/goUpdateUserPage")
    public String goUpdateUserPage(Model model,HttpServletRequest request){
        logger.info("进入用户修改界面");

        String userId = request.getParameter("id");
        logger.info("userId----"+userId);
        Account account=iUserService.queryAccount(Integer.parseInt(userId));
//        List<Organization> list = organizationService.selectByExample(null);

//        model.addAttribute("organizationList", list);
        model.addAttribute("account", account);
        return "/system/user/user_update";
    }

    /**
     * 更新用户
     * @return
     */
    @ResponseBody
    @RequestMapping("/system/userUpdate")
    public String userUpdate(@RequestParam Map<String,String> map){
        BackMsg msg = new BackMsg();
        Account account=new Account();
        account.setUserId(Integer.parseInt(map.get("userId")));
        account.setUserSex(map.get("userSex").equals("")?null:map.get("userSex"));
        account.setUserBirthday(map.get("userBirthday").equals("")?null:map.get("userBirthday"));
        account.setUserRegisterDate(map.get("userRegisterDate").equals("")?null:map.get("userRegisterDate"));
        account.setUserTel(map.get("userTel").equals("")?null:map.get("userTel"));
        account.setUserState(Integer.parseInt(map.get("userState").equals("")?"-1":map.get("userState")));
        account.setUserProvince(map.get("userProvince").equals("")?null:map.get("userProvince"));
        account.setUserCity(map.get("userCity").equals("")?null:map.get("userCity"));
        account.setUserEmail(map.get("userEmail").equals("")?null:map.get("userEmail"));
        account.setUserName(map.get("userName").equals("")?null:map.get("userName"));
        iUserService.updateAccount(account);

        return ResponseHelp.responseText(msg);
    }

    /**
     * 删除用户
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/system/userDel")
    public String userDel(HttpServletRequest request){
        BackMsg msg = new BackMsg();
        String ids = request.getParameter("ids");
        String[] idsArr = ids.split(",");
        logger.info("idsArr"+idsArr.length);
        for (String id : idsArr) {
            if ("1".equals(id)) {
                return ResponseHelp.responseErrorText("admin用户不允许被删除");
            }
        }
        iUserService.batchDelUser(idsArr);
        return ResponseHelp.responseText(msg);
    }

    /**
     * 修改状态
     * @param model
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/system/updateStatus")
    public String updateStatus(Model model,HttpServletRequest request) {
        String id = request.getParameter("id");
        String status = request.getParameter("status");

        if (id.equals("1")) {
            return ResponseHelp.responseErrorText("admin用户不能被禁用");
        }
        iUserService.updateAccountById(Integer.parseInt(id),Integer.parseInt(status));

        return ResponseHelp.responseText();
    }
}
