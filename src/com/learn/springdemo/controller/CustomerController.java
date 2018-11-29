package com.learn.springdemo.controller;

import java.util.List;

import com.learn.springdemo.entity.Customer;
import com.learn.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author badrikant.soni on Nov,19/11/18,2018
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    // need to inject the customer service

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/list")
    public String listCustomers(Model theModel) {

        // get customers from the service
        List<Customer> theCustomers = customerService.getCustomers();

        // add the customers to the model
        theModel.addAttribute("customers", theCustomers);

        return "list-customers";
    }

}
