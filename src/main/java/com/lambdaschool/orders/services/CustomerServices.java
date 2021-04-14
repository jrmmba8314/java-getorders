package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;
import com.lambdaschool.orders.views.OrderCounts;

import java.util.List;

public interface CustomerServices
{
    Customer save(Customer customer);

    List<Customer> findAllCustomersOrders();
    Customer findCustomerByCustcode(long custcode);
    List<Customer> findByNameLike(String custname);
    List<OrderCounts> getOrderCounts();

}
