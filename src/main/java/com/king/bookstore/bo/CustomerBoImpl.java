package com.king.bookstore.bo;

import com.king.bookstore.common.inteface.bo.ICustomerBo;
import com.king.bookstore.common.inteface.mapper.ICustomerMapper;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.common.pojo.Customer;
import com.king.bookstore.common.variable.Const;
import com.king.bookstore.utils.AbstractLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.List;

@Component
public class CustomerBoImpl extends AbstractLogger implements ICustomerBo {

    @Autowired
    ICustomerMapper customerMapper;

    @Override
    public Customer selectByPrimaryKey(int customer_id) {
        return customerMapper.selectByPrimaryKey(customer_id);
    }

    @Override
    public Customer selectDefaultByUserId(int uid, int customerFlag) {
        return customerMapper.selectDefaultByUserId(uid, customerFlag);
    }

    @Override
    public List<Customer> selectCustomerByUserId(int user_id) {
        return customerMapper.selectCustomerByUserId(user_id);
    }

    @Override
    public boolean setDefaultCustomer(int user_id, int customer_id) {
        List<Customer> list=customerMapper.selectCustomerByUserId(user_id);
        for (Customer customer:list) {
            if(customer.getStatus()== Const.Customer.DEFAULT){
                customer.setStatus(Const.Customer.UN_DEFAULT);
                customerMapper.updateCustomerStatus(customer);
            }
        }
        return customerMapper.setDefaultCustomer(user_id,customer_id)==1?true:false;

    }

    @Override
    public boolean addCustomer(Customer customer) {
        List<Customer> list=customerMapper.selectCustomerByUserId(customer.getUid());
        if(list.size()==0){
            customer.setStatus(Const.Customer.DEFAULT);
        }else{
            customer.setStatus(Const.Customer.UN_DEFAULT);
        }
        return customerMapper.addCustomer(customer)==1?true:false;
    }

    @Override
    public int customerIdNewInsert(int userId) {
        return customerMapper.customerIdNewInsert(userId);
    }

    @Override
    public boolean deleteCustomer(int customerId) {
        return customerMapper.deleteCustomer(customerId)==1?true:false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer)==1?true:false;
    }

    @Override
    public boolean findCollection(String product_id, int user_id) {
        return false;
    }

    @Override
    public boolean insertCollection(int user_id, String product_id, Date date) {
        return false;
    }

    @Override
    public List<Book> listMyCollection(int user_id) {
        return null;
    }

    @Override
    public boolean deleteConnection(int userId, String productId) {
        return false;
    }

    @Override
    public int getAmountCollection(int userId) {
        return 0;
    }
}
