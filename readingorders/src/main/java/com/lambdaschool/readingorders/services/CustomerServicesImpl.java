package com.lambdaschool.readingorders.services;


import com.lambdaschool.readingorders.models.Customer;
import com.lambdaschool.readingorders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServicesImpl implements CustomerServices {

  @Autowired
  CustomersRepository custrepos;

  @Override
  public Customer save(Customer customer) {
    return custrepos.save(customer);
  }
}
