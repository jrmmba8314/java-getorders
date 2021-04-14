package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;
import com.lambdaschool.orders.repositories.CustomerRepository;
import com.lambdaschool.orders.views.OrderCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices
{
    @Autowired
    private CustomerRepository customerrepos;
    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        return customerrepos.save(customer);
    }

    @Override
    public List<Customer> findAllCustomersOrders()
    {
        List<Customer> rtnlist = new ArrayList<>();
        customerrepos.findAll().iterator().forEachRemaining(rtnlist::add);
        return rtnlist;
    }

    @Override
    public Customer findCustomerByCustcode(long custcode)
    {
        return customerrepos.findById(custcode)
            .orElseThrow(() -> new EntityNotFoundException("Customer " + custcode + " Not Found"));
    }

    @Override
    public List<Customer> findByNameLike(String custname)
    {
        List<Customer> list = customerrepos.findByCustnameContainingIgnoringCase(custname);

        return list;
    }

    @Override
    public List<OrderCounts> getOrderCounts()
    {
        List<OrderCounts> rtnList = customerrepos.findOrderCounts();
        return rtnList;
    }
}
