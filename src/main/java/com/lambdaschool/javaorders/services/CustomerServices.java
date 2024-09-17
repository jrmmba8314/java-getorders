package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Customer;
import com.lambdaschool.javaorders.views.OrderCounts;

import java.util.List;

public interface CustomerServices
{
    List<Customer> findAllCustomers();

    Customer findByCustomerCode(long id);

    List<Customer> findAllCustomersByNameLike(String custname);

    List<OrderCounts> getOrderCounts();

    Customer save(Customer customer);
}
