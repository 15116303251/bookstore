package com.king.bookstore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.king.bookstore.common.inteface.service.IMenuService;
import com.king.bookstore.common.pojo.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {
	
	@Autowired
	private IMenuService menuService;
	
	/**
	 * 跳转首页
	 * @param model
	 * @return
	 */
	@RequestMapping("/index")
	public String index(Model model){
		List<Tree> menus = menuService.selectTreeNodes(0L);
		model.addAttribute("menus", menus);
		return "backpage/backIndex";
	}

	@RequestMapping("/index/goUpdatePassPage")
	public String goUpdatePassPage(Model model){
		return "/index/updatePass";
	}
	
	@RequestMapping("/index/gopersonalDataPage")
	public String gopersonalDataPage(Model model){
		return "/index/personalData";
	}
	
//	@ResponseBody
//	@RequestMapping("/index/unlock")
//	public String Unlock(Model model,HttpServletRequest request){
//		String pass = request.getParameter("pass");
//		String ps = ShiroSecurityHelper.encryptedPass(pass);
//		User user = ShiroSecurityHelper.getCurrentUser();
//		if (!user.getPassword().equals(ps)) {
//			return ResponseHelp.responseErrorText("密码错误");
//		}
//		return ResponseHelp.responseText();
//	}
}
