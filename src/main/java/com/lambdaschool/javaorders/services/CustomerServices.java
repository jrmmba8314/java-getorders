package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Customer;

import java.util.List;

public interface CustomerServices
{
    List<Customer> findAllCustomers();

    Customer findByCustomerCode(long id);

    List<Customer> findAllCustomersByNameLike(String custname);

    Customer save(Customer customer);
}
