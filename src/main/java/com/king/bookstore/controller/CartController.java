package com.king.bookstore.controller;

import com.king.bookstore.common.dto.CartVo;
import com.king.bookstore.common.dto.OrderVo;
import com.king.bookstore.common.inteface.service.ICartService;
import com.king.bookstore.common.pojo.Cart;
import com.king.bookstore.utils.AbstractLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class CartController extends AbstractLogger{

    @Autowired
    ICartService iCartService;

    @RequestMapping(value="/addCart",method= RequestMethod.POST)
    @ResponseBody
    public int add( @RequestParam("product_id")String product_id, @RequestParam("product_amount")Integer product_amount, @RequestParam("bDBid") Integer bDBid, HttpServletRequest request,@RequestParam("price")String price){
        logger.info("come into");
        int user_id= (int) request.getSession().getAttribute("fontUser");
        logger.info("product_id"+product_id);
        logger.info("product_amount"+product_amount);
        logger.info("bDBid"+bDBid);
        logger.info("price"+price);
        if(price.equals("")){
            price="0.0";
        }
        boolean flag=iCartService.add(user_id,product_id,product_amount,bDBid,Double.parseDouble(price));
        if(flag){
            logger.info("插入成功");
        }else{
            logger.info("插入失败");
        }
        int amount=iCartService.getCartProductCount(user_id);
        logger.info("amount"+amount);
        return amount;
    }

    //------------------------------------------------------------------------------------------------查询购物车中商品的数量
    @RequestMapping(value = "/getCartProductCount",method = RequestMethod.GET)
    @ResponseBody
    public int getCount(HttpServletRequest request){
        int userId= (int) request.getSession().getAttribute("fontUser");
        return iCartService.getCartProductCount(userId);
    }

    //详情表到购物车表
    @RequestMapping(value="/detailToCart",method = RequestMethod.GET)
    @ResponseBody
    public void DetailToCart(HttpServletRequest request, HttpServletResponse response){
        try {
            logger.info("come into detailToCart");
            request.getRequestDispatcher("/WEB-INF/jsp/fontpage/main/shopCart.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //查询当前用户购物车所有商品
    @RequestMapping(value="/queryAllCart",method = RequestMethod.POST)
    @ResponseBody
    public CartVo queryAllCart(HttpServletRequest request){
        int userId= (int) request.getSession().getAttribute("fontUser");
        CartVo cartVo=iCartService.getCartVoLimit(userId);
        logger.info("cartVo"+cartVo);
        return cartVo;
    }

    //------------------------------------------------------------------------------------------------更新购物车中商品的数量
    @RequestMapping(value="/updateByPrimaryKey", method = RequestMethod.POST)
    @ResponseBody
    public double updateByPrimaryKey(@RequestParam("cartId")int carId,@RequestParam("num")int num,HttpServletRequest request){
        logger.info("update come into");
        int userId= (int) request.getSession().getAttribute("fontUser");
        Boolean flag=iCartService.updateByBookNameUid(carId,userId,num);
        if(flag){
           logger.info("update success");
           return iCartService.getCartMontyAmount(userId,1);
        }else{
            logger.info("update fail");
            return 0;
        }
    }
//---------------------------------------------------------------------------------------------------更新购物车中商品的状态
    @RequestMapping(value="/updateSelectStatus",method = RequestMethod.POST)
    @ResponseBody
    public String updateSelectStatus(HttpServletRequest request,@RequestParam("cartId")int cartId,@RequestParam("flag")int flag){
        logger.info("cartId---"+cartId+"flag---"+flag);
        boolean status=iCartService.updateByCartId(cartId,flag);
        int uid= (int) request.getSession().getAttribute("fontUser");
        double money=iCartService.getCartMontyAmount(uid,1);
            logger.info("monry"+money);
            return money+"";
    }
//---------------------------------------------------------------------------------------------------删除购物车中商品
    @RequestMapping(value="/deleteByPrimaryKey",method = RequestMethod.GET)
    public void deleteByPrimaryKey(@RequestParam("cartId")int cartId,HttpServletRequest request,HttpServletResponse response){
        boolean flag=iCartService.deleteByPrimaryKey(cartId);
        if(flag){
            logger.info("delete success");
        }
        try {
            request.getRequestDispatcher("/WEB-INF/jsp/fontpage/main/shopCart.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//--------------------------------------------------------------------------------------------------------购物车中商品全选

    @RequestMapping(value="/updateAllCarGoodStatus",method=RequestMethod.GET)
     public void selectAllCarGood(HttpServletRequest request,HttpServletResponse response){
         int userId= (int) request.getSession().getAttribute("fontUser");
         int flag=iCartService.updateAllCarGoodStatus(userId);
        try {
            request.getRequestDispatcher("/WEB-INF/jsp/fontpage/main/shopCart.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
