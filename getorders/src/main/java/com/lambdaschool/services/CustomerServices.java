package com.lambdaschool.services;

import com.lambdaschool.models.Customer;

import java.util.List;

public interface CustomerServices {

    List<Customer> findByNameLike(String thename);

    Customer findCustomerById(long id)
}
