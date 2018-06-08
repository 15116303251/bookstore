package com.king.bookstore.controller;

import com.king.bookstore.common.dto.OrderItemOrder;
import com.king.bookstore.common.dto.OrderVo;
import com.king.bookstore.common.inteface.service.IBookService;
import com.king.bookstore.common.inteface.service.ICustomerService;
import com.king.bookstore.common.inteface.service.INewHotBookService;
import com.king.bookstore.common.inteface.service.IOrderItemService;
import com.king.bookstore.common.inteface.service.IOrderService;
import com.king.bookstore.common.pojo.Customer;
import com.king.bookstore.common.pojo.Order;
import com.king.bookstore.common.pojo.OrderItem;
import com.king.bookstore.common.variable.Const;
import com.king.bookstore.utils.AbstractLogger;
import com.king.bookstore.utils.BackMsg;
import com.king.bookstore.utils.PageUtils;
import com.king.bookstore.utils.ResponseHelp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrderController extends AbstractLogger {

    @Autowired
    IOrderService iOrderService;
    @Autowired
    ICustomerService iCustomerService;
    @Autowired
    IOrderItemService iOrderItemService;
    @Autowired
    IBookService iBookService;
    @Autowired
    INewHotBookService iNewHotBookService;

    @RequestMapping(value="/comfirmOrder",method= RequestMethod.GET )
    @ResponseBody
    public OrderVo confirmOrder(HttpServletRequest request){
        int user_id= (int) request.getSession().getAttribute("fontUser");
        OrderVo orderVo=iOrderService.confirmOrder(user_id);
        logger.info("orderVo"+orderVo);
        return orderVo;
    }

    @RequestMapping(value="/cartToOrder",method = RequestMethod.GET)
    public String cartToOrder(){
        return "fontpage/main/comfirmOrder";
    }

//   添加收件人地址
    @RequestMapping(value="/addAddress",method=RequestMethod.POST)
    public String addAddress(@RequestParam Map<String,String> map,HttpServletRequest request){
        int userId= (int) request.getSession().getAttribute("fontUser");
        Customer customer=new Customer(userId,map.get("address"),0,map.get("customerName"),map.get("customerPhone"),map.get("bigAddress"));
        boolean flag=iCustomerService.addCustomer(customer);
        if(flag){
            return "fontpage/main/comfirmOrder";
        }else{
              return null;
        }
    }

    @RequestMapping(value="/updateAddress",method = RequestMethod.POST)
    @ResponseBody
    public Customer updateAddress(@RequestParam("customerId")int customerId){
        Customer customer=iCustomerService.selectByPrimaryKey(customerId);
        if(customer!=null){
            logger.info("customer exsit");
            return customer;
        }else{
            logger.info("customer not exsit");
            return null;
        }
    }

    @RequestMapping(value="/updateCustomerAddress",method = RequestMethod.POST)
    public String updateCustomerAddress(@RequestParam Map<String,String> map,HttpServletRequest request,HttpServletResponse response){
        int uid= (int) request.getSession().getAttribute("fontUser");
        Customer customer=new Customer( uid, map.get("address"), map.get("customerName") , map.get("customerPhone")  ,map.get("bigAddress"),Integer.parseInt(map.get("customerId")));
        logger.info("customer-----"+customer);
        logger.info("come into updateCustomerAddress");
        boolean flag=iCustomerService.updateCustomer(customer);
        if(flag){
            logger.info("update customer success");
        }
        return "fontpage/main/comfirmOrder";
    }

    @RequestMapping(value="/deleteAddress",method = RequestMethod.GET)
    public String updateCustomerAddress(@RequestParam("customerId")int customerId, HttpServletRequest request,HttpServletResponse response){
        boolean flag=iCustomerService.deleteCustomer(customerId);
        if(flag){
            logger.info("delete customer success");
        }
        return "fontpage/main/comfirmOrder";
    }
//------------------------------------------------------------------------------------------------------------设置默认地址
    @RequestMapping(value="/setDefaultAddress",method = RequestMethod.GET)
    public String setDefaultAddress(@RequestParam("customerId")int customerId, HttpServletRequest request,HttpServletResponse response){
        int userId= (int) request.getSession().getAttribute("fontUser");
        boolean flag=iCustomerService.setDefaultCustomer(userId,customerId);
        if(flag){
            logger.info("set Default Address  success");
        }
        return "fontpage/main/comfirmOrder";
    }

    //去支付
    @RequestMapping(value = "/toPay",method = RequestMethod.GET)
    @ResponseBody
    public void toPay(HttpServletRequest request, @RequestParam("way")int way, HttpServletResponse response){
        int user_id= (int) request.getSession().getAttribute("fontUser");
        OrderVo orderVo=iOrderService.createOrder(user_id,"",way,null);
        request.setAttribute("orderVo",orderVo);
        try {
            request.getRequestDispatcher("/WEB-INF/jsp/fontpage/pay/index.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value="toPayPage",method=RequestMethod.POST)
    public String toPayPage(){
        return "fontpage/pay/alipay.trade.page.pay";
    }

    @RequestMapping(value="afterPay")
    public String afterPay(){
        String order_number=iOrderService.selectBigId();
        boolean flag=iOrderService.changeOrderFlag(order_number, Const.OrderStatusEnum.PAID.getCode());
        if(flag){
            logger.info("订单更新成功");
            //根据订单号查询订单子项
            List<OrderItem>orderItemList=iOrderItemService.selectOrderItemByOrderId(order_number);
            for (OrderItem orderItem:orderItemList) {
                 boolean status=iBookService.updateBookAmount(orderItem.getGoodsNum(),orderItem.getGoodsId(),orderItem.getbDBid());
                 if(status){
                     logger.info("订单的子项更新库存成功"+orderItem);
                 }

                 int rows=iNewHotBookService.findNewBook(orderItem.getGoodsId(),orderItem.getbDBid(),orderItem.getGoodsNum());
                 if(rows>=0){
                     boolean flag1=iNewHotBookService.updateNewBookAfterPay(orderItem.getGoodsId(),orderItem.getbDBid(),orderItem.getGoodsNum());
                     if(flag1){
                         logger.info("如果购买的书籍中有新书，更新新书表中的数据成功");
                     }
                 }


            }
        }
        return "fontpage/main/shopCart";
    }
//----------------------------------------------------------------------------------------------------更改状态
    @RequestMapping("/updateIsShipStatus")
    @ResponseBody
    public String updateIsShipStatus(@RequestParam("id")String id,@RequestParam("status")String status){
        logger.info("id+++++status"+id+"----"+status);
        iOrderService.updateIsShipStatus(Integer.parseInt(id),Integer.parseInt(status));
        return ResponseHelp.responseText();
    }

    @RequestMapping("/updateIsReceiptStatus")
    @ResponseBody
    public String updateIsReceiptStatus(@RequestParam("id")String id,@RequestParam("status")String status){
        logger.info("id+++++status"+id+"----"+status);
        iOrderService.updateIsReceiptStatus(Integer.parseInt(id),Integer.parseInt(status));
        return ResponseHelp.responseText();
    }
//--------------------------------------------------------------------------------------------------返回当前用户的订单的数量
    @RequestMapping(value="/getOrderNum",method = RequestMethod.GET)
    @ResponseBody
    public int getOrderNum(HttpServletRequest request){
        int userId= (int) request.getSession().getAttribute("fontUser");
        return iOrderService.getOrderCount(userId);
    }

    //---------------------------------------------------------------------------------------------------------订单部分代码
    @RequestMapping("/order/goToOrderIndex")
    public String goToOrderIndex(){
        return "/order/order_index";
    }

    @RequestMapping(value="/order/getOrderPage",method=RequestMethod.POST)
    @ResponseBody
    public String getOrderPage(HttpServletRequest request){
        String page=request.getParameter("pageNumber");
        String orderId=request.getParameter("order_id");
        String isShip=request.getParameter("isShip");
        String isPay=request.getParameter("isPay");
        String isReceipt=request.getParameter("isReceipt");
        HashMap<String,String> map=new HashMap<String,String>();
        if(isPay==null ||isPay.equals("")){
            map.put("isPay","0");
        }
        if(orderId==null ||orderId.equals("")){
            map.put("orderId",null);
        }

        if(isShip==null ||isShip.equals("")){
            map.put("isShip",null);
        }
        if(isReceipt==null ||isReceipt.equals("")){
            map.put("isReceipt",null);
        }
        PageUtils pageUtils=new PageUtils(page);
        pageUtils=iOrderService.selectAllOrder(map,pageUtils);
        logger.info("-------------"+pageUtils.getList().get(0));
        System.out.println(pageUtils.getList().get(0));

        return ResponseHelp.responseText(pageUtils);
    }

    @RequestMapping("/order/orderDel")
    @ResponseBody
    public String OrderDel(@RequestParam("id")int id){
        BackMsg msg = new BackMsg();
        boolean flag=iOrderService.deleteOrderById(id);
        msg.setStatus(flag);
        return ResponseHelp.responseText(msg);
    }

    @RequestMapping("/order/toAddOrder")
    public String toAddOrder(){
        return "/order/order_add";
    }

    @RequestMapping("/order/orderAdd")
    @ResponseBody
    public String insertOrder(@RequestParam Map<String,String> map){
        BackMsg msg=new BackMsg();
        Order order=new Order();
        order.setOrderNumber(map.get("orderNumber"));
        order.setStatus(Integer.parseInt(map.get("status")));
        order.setUid(Integer.parseInt(map.get("uid")));
        order.setPayPrice(Double.parseDouble(map.get("payPrice")));
        int flag=iOrderService.insertOrder(order);
        msg.setStatus(flag==1?true:false);
        return ResponseHelp.responseText(msg);
    }

    //---------------------------------------------------------------------------------------------------------前端订单查询
    @RequestMapping("/selectOrderByUserId")
    public void selectOrderByUserId(HttpServletRequest request,HttpServletResponse response){
        int userId= (int) request.getSession().getAttribute("fontUser");
        List<OrderItemOrder> list=new ArrayList<>();

        List<Order>orderList=iOrderService.selectAllOrderByUserId(userId);
        for (Order order:orderList ) {
            OrderItemOrder orderItemOrder=new OrderItemOrder();
            orderItemOrder.setOrder(order);
            List<OrderItem> orderItemList=iOrderItemService.selectOrderItemByOrderId(order.getOrderNumber());
            orderItemOrder.setOrderItemList(orderItemList);
            list.add(orderItemOrder);
        }
        logger.info("order----------"+list);
        request.setAttribute("orders",list);
        try {
            request.getRequestDispatcher("/WEB-INF/jsp/fontpage/main/orderList.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
