package com.lambdaschool.readingorders.services;


import com.lambdaschool.readingorders.models.Customer;


public interface CustomerServices {

//  List<Customer> findAllCustomers();
//  Customer findCustomerByCustCode(long custcode);
//  List <Customer> findCustomerByName(String name);
//  List<Customer> findByWorkingArea(String workingrea);
//  List<Customer> findByNameLike(String likeName);
//  List<Customer> findByGrade(String grade);

  Customer save(Customer customer);

}
