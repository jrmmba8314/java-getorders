package com.lambdaschool.javaorders.controllers;

import com.lambdaschool.javaorders.models.Customer;
import com.lambdaschool.javaorders.repositories.CustomersRepository;
import com.lambdaschool.javaorders.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/orders", produces = "application/json")
    public ResponseEntity<?> getAllCustomers()
    {

        List<Customer> returnList = new ArrayList<>();
        returnList = customerService.getAllCustomers();
        return new ResponseEntity<>(returnList, HttpStatus.OK);

    }

    @GetMapping(value = "/customer/{custcode}", produces = "application/json")
    public ResponseEntity<?> getCustomerById(@PathVariable long custcode)
    {

        Customer returnCustomer = customerService.getCustomerById(custcode);
        return new ResponseEntity<>(returnCustomer, HttpStatus.OK);

    }

    @GetMapping(value = "/namelike/{substring}", produces = "application/json")
    public ResponseEntity<?> getCustomerByNamelike(@PathVariable String substring)
    {

        List<Customer> returnList = new ArrayList<>();
        returnList = customerService.getCustomerByNamelike(substring);
        return new ResponseEntity<>(returnList, HttpStatus.OK);

    }



}
