package com.king.bookstore;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SpringBootApplication
@ComponentScan({"com.king.bookstore.controller","com.king.bookstore.bo","com.king.bookstore.service","com.king.bookstore.utils","com.king.bookstore.reply","com.king.bookstore"})
@MapperScan("com.king.bookstore.common.inteface.mapper")
@Controller
@EnableAutoConfiguration
public class BookstoreApplication extends SpringBootServletInitializer {

	public BookstoreApplication() {
		super();
		setRegisterErrorPageFilter(false);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// 注意这里要指向原先用main方法执行的Application启动类
		return builder.sources(BookstoreApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	//前端登录
    @RequestMapping("/fontLogin")
    String fontLogin(HttpServletRequest request, HttpServletResponse response)
    {
    	return "/fontpage/user/fontLogin";
    }

    //后端登录
    @RequestMapping("/backLogin")
	String backLogin(HttpServletRequest request, HttpServletResponse response){
		return "backpage/login";
	}

	//后端登录
	@RequestMapping("/")
	String index(HttpServletRequest request, HttpServletResponse response){
	     return "fontpage/main/orderList";
	}

}
