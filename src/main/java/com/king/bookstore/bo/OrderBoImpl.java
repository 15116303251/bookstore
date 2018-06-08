package com.king.bookstore.bo;

import com.github.pagehelper.PageHelper;
import com.king.bookstore.common.dto.OrderItemVo;
import com.king.bookstore.common.dto.OrderVo;
import com.king.bookstore.common.inteface.bo.IOrderBo;
import com.king.bookstore.common.inteface.mapper.IBookClassMapper;
import com.king.bookstore.common.inteface.mapper.IBookMapper;
import com.king.bookstore.common.inteface.mapper.ICartMapper;
import com.king.bookstore.common.inteface.mapper.ICustomerMapper;
import com.king.bookstore.common.inteface.mapper.IOrderItemMapper;
import com.king.bookstore.common.inteface.mapper.IOrderMapper;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.common.pojo.Cart;
import com.king.bookstore.common.pojo.Customer;
import com.king.bookstore.common.pojo.Order;
import com.king.bookstore.common.pojo.OrderItem;
import com.king.bookstore.common.variable.BookToTableEnum;
import com.king.bookstore.common.variable.Const;
import com.king.bookstore.utils.AbstractLogger;
import com.king.bookstore.utils.DateUtils;
import com.king.bookstore.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class OrderBoImpl extends AbstractLogger implements IOrderBo {

    @Autowired
    ICartMapper cartMapper;
    @Autowired
    IBookMapper bookMapper;
    @Autowired
    IBookClassMapper bookClassMapper;
    @Autowired
    ICustomerMapper customerMapper;
    @Autowired
    IOrderMapper orderMapper;
    @Autowired
    IOrderItemMapper orderItemMapper;

    /**
     * 生成要显示的订单页信息返回给前端
     * @param userId 用户id
     * @return
     */
    public OrderVo confirmOrder(Integer userId){
        //从购物车中获取数据
        List<Cart> cartList=cartMapper.selectCheckedCartByUserId(userId, Const.Cart.CHECKEDPRODUCT);
        //生成订单项的list
        List<OrderItem> orderItemList = this.getCartOrderItem(userId,cartList);
        //返回给前端数据
        OrderVo orderVo = assembleOrderVo(orderItemList,userId);
        return orderVo;
    }

    @Override
    public PageUtils selectAllOrder(Map<String,String> map,PageUtils pageUtils) {
        PageHelper pageHelper=new PageHelper();
        pageHelper.startPage(pageUtils.getPage(),pageUtils.getLimit());
        List<Order> list=orderMapper.selectAllOrder(map);
        pageUtils.setList(list);
        int amount =orderMapper.queryAllOrderAmount();
        pageUtils.setCountNum(amount);
        return pageUtils;
    }

    @Override
    public List<Order> selectAllOrderByUserId(int userId) {
        return orderMapper.selectAllOrderByUserId(userId);
    }

    @Override
    public int getOrderCount(int userId) {
        return orderMapper.getOrderCount(userId);
    }

    @Override
    public boolean deleteOrderById(int id) {
        return orderMapper.deleteOrderById(id) ;
    }

    @Override
    public int insertOrder(Order record) {
        return orderMapper.insertOrder(record);
    }

    @Override
    public boolean changeOrderFlag(String order_id, int order_flag) {
        return orderMapper.changeOrderFlag(order_id,order_flag);
    }

    @Override
    public String selectBigId() {
        return orderMapper.selectBigId();
    }

    @Override
    public boolean updateIsShipStatus(int id, int status) {
        return orderMapper.updateIsShipStatus(id,status);
    }

    @Override
    public boolean updateIsReceiptStatus(int id, int status) {
        return orderMapper.updateIsReceiptStatus(id,status);
    }


    /**
     * 组装成订单返回前端的类
     * @param userId
     * @param orderItemList
     * @return
     */
    private OrderVo assembleOrderVo(List<OrderItem> orderItemList,Integer userId){
        OrderVo orderVo = new OrderVo();
        orderVo.setPostage(Const.POSTAGE);
        orderVo.setPayment(Double.parseDouble(String.format("%.2f",this.getOrderTotalPrice(orderItemList)+Const.POSTAGE)));
        Customer cus=customerMapper.selectDefaultByUserId(userId,Const.Cart.CHECKEDPRODUCT);
        logger.info("cus"+cus);
        List<Customer>customers=customerMapper.selectCustomerUncheckedByUserId(userId);
        if(cus != null){
            orderVo.setAddress(cus);
        }
        orderVo.setCustomers(customers);
        List<OrderItemVo> orderItemVoList = new ArrayList<OrderItemVo>();

        for(OrderItem orderItem : orderItemList){
            OrderItemVo orderItemVo = assembleOrderItemVo(orderItem);
            orderItemVoList.add(orderItemVo);
        }
        orderVo.setOrderItemVoList(orderItemVoList);
        return orderVo;
    }

    @Override
    public OrderVo createOrder(Integer userId,String desc,int orderGet,String orderGetTime) {
        //从购物车中获取数据
        List<Cart> cartList=cartMapper.selectCheckedCartByUserId(userId,Const.Cart.CHECKEDPRODUCT);
        //计算这个订单的总价
        List<OrderItem> orderItemList = this.getCartOrderItem(userId,cartList);
        Double totalPrice=0.0;
        for (OrderItem orderItem:orderItemList) {
            totalPrice=totalPrice+(orderItem.getGoodsNum()*orderItem.getGoodsPrice()*orderItem.getDiscount_price());
        }
        //生成订单
        Order order = this.assembleOrder(totalPrice,userId);
        if(order == null){
            System.out.println("生成订单错误");
        }
        if(orderItemList.isEmpty()){
            System.out.println("购物车为空");
        }

        for(OrderItem orderItem : orderItemList){
            orderItem.setOrderId(order.getOrderNumber());
        }
        //批量插入
        orderItemMapper.insertAll(orderItemList);
        //清空一下购物车
        this.cleanCart(cartList);
        //返回给前端数据
        OrderVo orderVo = assembleOrderVo(order,orderItemList);
        return orderVo;
    }

    /**
     * 组装成订单返回前端的类
     * @param order
     * @param orderItemList
     * @return
     */
    private OrderVo assembleOrderVo(Order order,List<OrderItem> orderItemList){
        OrderVo orderVo = new OrderVo();
        orderVo.setOrderId(order.getOrderNumber());
        orderVo.setPostage(Const.POSTAGE);

        orderVo.setPayment(Double.parseDouble(String.format("%.2f",this.getOrderTotalPrice(orderItemList)+Const.POSTAGE)));
        Customer customer = customerMapper.selectDefaultByUserId(order.getUid(),Const.Customer.DEFAULT);
        if(customer != null){
            orderVo.setAddress(customer);
        }
        //将下单的日期转为字符串
        if(order.getCreateTime()!=null){
            orderVo.setOrderCreateTime(order.getCreateTime());
        }
        if(order.getReceiptTime()!=null){
            orderVo.setOrderGetTime(order.getReceiptTime());
        }
        List<OrderItemVo> orderItemVoList = new ArrayList<OrderItemVo>();

        for(OrderItem orderItem : orderItemList){
            OrderItemVo orderItemVo = assembleOrderItemVo(orderItem);
            orderItemVoList.add(orderItemVo);
        }
        orderVo.setOrderItemVoList(orderItemVoList);

        return orderVo;
    }

    private OrderItemVo assembleOrderItemVo(OrderItem orderItem){
        OrderItemVo orderItemVo = new OrderItemVo();
        orderItemVo.setOrderId(orderItem.getOrderId());
        orderItemVo.setGoodsId(orderItem.getGoodsId());

        orderItemVo.setGoodsName(orderItem.getGoodsName());
        String goodsPrice=String.format("%.2f",orderItem.getGoodsPrice()*orderItem.getDiscount_price());
        orderItemVo.setGoodsPrice(Double.parseDouble(goodsPrice));
        orderItemVo.setGoodsImg(orderItem.getImage());
        orderItemVo.setGoodsNum(orderItem.getGoodsNum());
        String discountPrice=String.format("%.2f",orderItem.getGoodsPrice()*orderItem.getDiscount_price());
        orderItemVo.setProduct_totalPrice(Double.parseDouble(discountPrice)*orderItem.getGoodsNum());
        if(orderItem.getOrderId()!=null){
            logger.info("orderItem"+orderItem);
            orderItemVo.setCreateTime(orderMapper.selectByPrimaryKey(orderItem.getOrderId()).getCreateTime().toString());
        }
        return orderItemVo;
    }

    /**
     * 将购物车中选择的商品生成List
     * @param userId
     * @param cartList
     * @return orderItemList 订单项list
     */
    private List<OrderItem> getCartOrderItem(Integer userId,List<Cart> cartList){
        List<OrderItem> orderItemList = new ArrayList<OrderItem>();
        if(cartList.isEmpty()){
            logger.info("购物车为空");
        }
        //校验购物车的数据,包括产品的状态
        for(Cart cartItem:cartList){
            OrderItem orderItem=new OrderItem();
            String bDBigDetail=bookClassMapper.queryBigDetailType(cartItem.getbDBid());
            Book book=bookMapper.queryBook(cartItem.getGoodsId(), BookToTableEnum.getTable(bDBigDetail));
            if(Const.ProductStatusEnum.ON_SALE.getCode() != book.getStatus()){
                logger.info("产品"+book.getBookName()+"不是在线售卖状态");
            }
            orderItem.setGoodsId(book.getId());
            orderItem.setGoodsNum(cartItem.getNum());
            orderItem.setGoodsPrice(book.getOriginalPrice());
            orderItem.setGoodsName(book.getBookName());
            orderItem.setImage(book.getImage());
            orderItem.setbDBid(book.getbDBid());
            orderItem.setDiscount_price(book.getDiscountedPrice());
            orderItem.setGoodsName(book.getBookName());
            orderItemList.add(orderItem);
        }
        return orderItemList;

    }

    /**
     * 生成总价
     * @param orderItemList
     * @return 总价
     */
    private double getOrderTotalPrice(List<OrderItem> orderItemList){
        double payment = 0;
        for(OrderItem orderItem : orderItemList){
            payment += orderItem.getGoodsPrice()*orderItem.getGoodsNum()*orderItem.getDiscount_price();
        }
        return payment;
    }

    /**
     * 组装成订单
     * @param userId
     * @return
     */
    private Order assembleOrder(Double totalPrice,Integer userId){
        Order order = new Order();
        String order_id = this.generateOrderNo(userId);
        order.setOrderNumber(order_id);
        order.setUid(userId);
        order.setCreateTime(DateUtils.DateToString(new Date()));
        order.setPayPrice(totalPrice);

        order.setStatus(Const.OrderStatusEnum.NO_PAY.getCode());

        //取得该默认收货人存在数据库中的地址
        String address= customerMapper.selectDefaultByUserId(userId,Const.Customer.DEFAULT).getAddress();
        int rowCount = orderMapper.insertOrder(order);
        if(rowCount > 0){
            return order;
        }
        return null;
    }

    private Date getTime(String orderGetTime){
        Date d=new Date();
        String time="";
        int date=d.getDate()+1;
        if(orderGetTime.equals("1")){
            time=" 10:00:00";
        }else if(orderGetTime.equals("2")){
            time=" 14:00:00";
        }else if(orderGetTime.equals("3")){
            time=" 18:00:00";
        }else if(orderGetTime.equals("0")){
            time=" 00:00:00";
        }
        if(d.getHours()>22){
            date=date+1;
        }
        Date getTime=new Date((d.getYear()+1900)+"/"+(d.getMonth()+1)+"/"+date+time);
        return getTime;
    }

    private String generateOrderNo(Integer userId){
        long currentTime =System.currentTimeMillis();
        return ""+currentTime+userId;
    }

    private void cleanCart(List<Cart> cartList){
        for(Cart cart : cartList){
            cartMapper.deleteByPrimaryKey(cart.getId());
        }
    }

    /**
     * 取消订单
     */
    public boolean cancel(Integer user_Id, String order_id) {
        return orderMapper.cancelOrder(user_Id, order_id);
    }

}
