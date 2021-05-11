package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Customer;
import com.lambdaschool.javaorders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "customerServices")
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomersRepository customersRepository;

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> returnList = new ArrayList<>();
        customersRepository.findAll().iterator().forEachRemaining(returnList :: add);
        return returnList;
    }

    @Override
    public Customer getCustomerById(long custcode) {
        Customer newCustomer = customersRepository.findById(custcode)
                .orElseThrow(() -> new EntityNotFoundException("Customer " + custcode + " not found."));
        return newCustomer;
    }

    @Override
    public List<Customer> getCustomerByNamelike(String subname) {
        List<Customer> returnList = new ArrayList<>();
        returnList = customersRepository.findCustomersByCustnameContainingIgnoringCase(subname);
        return returnList;
    }
}
