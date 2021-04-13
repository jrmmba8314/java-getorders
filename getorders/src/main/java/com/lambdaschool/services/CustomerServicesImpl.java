package com.lambdaschool.services;

import com.lambdaschool.models.Customer;
import com.lambdaschool.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service(value = "customerservices")
public class CustomerServicesImpl implements CustomerServices{
    @Autowired
    private CustomerRepository customerrepos;


    @Override
    public List<Customer> findByNameLike(String thename)
    {
        List<Customer> list = customerrepos.findByNameContainingIgnoringCase(thename);
        return list;
    }

    @Override
    public Customer findCustomerById(long id) throws EntityNotFoundException {
        return customerrepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("customer" + id +"not found"));
    }

}
