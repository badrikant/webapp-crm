package com.learn.springdemo.service;

import java.util.List;

import com.learn.springdemo.entity.Customer;

/**
 * @author badrikant.soni on 29/11/18,2018
 */
public interface CustomerService {

    public List<Customer> getCustomers();
}