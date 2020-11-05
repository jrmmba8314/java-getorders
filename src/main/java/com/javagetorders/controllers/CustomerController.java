package com.javagetorders.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController
{
    @Autowired

    // http://localhost:2019/customers/orders
    @GetMapping(value = "/orders", produces = {"application/json"})
    public ResponseEntity<?> listAllOrders()
    {
        List<Order> rtnList =
    }

    // http://localhost:2019/customers/customer/7

    // http://localhost:2019/cusomters/customer/77

    // http://localhost:2019/customers/namelike/mes

    // http://localhost:2019/agents/agent/9

    // http://localhost:2019/orders/order/7

    // http://localhost:2019/orders/advanceamount
}
