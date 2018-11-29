package com.learn.springdemo.dao;

import java.util.List;

import com.learn.springdemo.entity.Customer;

/**
 * @author badrikant.soni on 21/11/18,2018
 */
public interface CustomerDAO {

    public List<Customer> getCustomers();

    void saveCustomer(Customer theCustomer);

    Customer getCustomer(int theId);
}
