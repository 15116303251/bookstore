package com.king.bookstore.service;

import com.king.bookstore.common.inteface.bo.ICustomerBo;
import com.king.bookstore.common.inteface.service.ICustomerService;
import com.king.bookstore.common.pojo.Book;
import com.king.bookstore.common.pojo.Customer;
import com.king.bookstore.utils.AbstractLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl extends AbstractLogger implements ICustomerService {

    @Autowired
    ICustomerBo customerBo;

    @Override
    public Customer selectByPrimaryKey(int customer_id) {
        return customerBo.selectByPrimaryKey(customer_id);
    }

    @Override
    public Customer selectDefaultByUserId(int uid, int customerFlag) {
        return customerBo.selectDefaultByUserId(uid,customerFlag);
    }

    @Override
    public List<Customer> selectCustomerByUserId(int user_id) {
        return customerBo.selectCustomerByUserId(user_id);
    }

    @Override
    public boolean setDefaultCustomer(int user_id, int customer_id) {
        return customerBo.setDefaultCustomer(user_id,customer_id);
    }

    @Override
    public boolean addCustomer(Customer customer) {
        return customerBo.addCustomer(customer);
    }

    @Override
    public int customerIdNewInsert(int userId) {
        return customerBo.customerIdNewInsert(userId);
    }

    @Override
    public boolean deleteCustomer(int customerId) {
        return customerBo.deleteCustomer(customerId);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return customerBo.updateCustomer(customer);
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
