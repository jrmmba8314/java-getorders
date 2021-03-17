package com.lambda.javaorders.services;

import com.lambda.javaorders.models.Customer;
import com.lambda.javaorders.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices
{
    @Autowired
    CustomerRepository custrepos;

    @Transactional
    @Override
    public Customer save(Customer customer) {
        return custrepos.save(customer);
    }
}
