package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;
import com.lambdaschool.orders.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerRepository custrepos;

    @Override
    public List<Customer> findAllCustomers()
    {
        List<Customer> list = new ArrayList<>();
        custrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Customer findCustomerById(long id) throws EntityNotFoundException
    {
        return custrepos.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Customer " + id + " not found! "));
    }

    @Override
    public List<Customer> findCustomerByName(String custname)
    {
        return custrepos.findByCustnameContainingIgnoringCase(custname);
    }
}
