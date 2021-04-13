package com.lambdaschool.orders.controllers;

import com.lambdaschool.orders.models.Customer;
import com.lambdaschool.orders.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController
{
    @Autowired
    private CustomerServices customerServices;
    //    http://localhost:2019/customers/orders
    @GetMapping(value = "/orders", produces = "application/json")
    public ResponseEntity<?> listAllOrders()
    {
        List<Customer> rtnList = customerServices.findAllCustomersOrders();
        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }

    //    http://localhost:2019/customers/customer/7
    @GetMapping(value = "/customer/{custcode}", produces = "application/json")
    public ResponseEntity<?> findByCustcode(@PathVariable long custcode)
    {
        Customer c = customerServices.findCustomerByCustcode(custcode);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }
    //    http://localhost:2019/customers/namelike/mes
    @GetMapping(value = "/namelike/{custname}", produces = "application/json")
    public ResponseEntity<?> findCustomerByCustnameLike(@PathVariable String custname)
    {
        List<Customer> rtnlist = customerServices.findByNameLike(custname);
        return new ResponseEntity<>(rtnlist, HttpStatus.OK);
    }
    //    http://localhost:2019/customers/namelike/cin
    //    Stretch Goal
    //    http://localhost:2019/orders/advanceamount

}
