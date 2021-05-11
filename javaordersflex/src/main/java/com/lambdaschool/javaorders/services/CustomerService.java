package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();
    Customer getCustomerById(long custcode);
    List<Customer> getCustomerByNamelike(String subname);



}
