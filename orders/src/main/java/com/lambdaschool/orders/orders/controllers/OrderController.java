package com.lambdaschool.orders.orders.controllers;

import com.lambdaschool.orders.orders.models.Customer;
import com.lambdaschool.orders.orders.models.Order;
import com.lambdaschool.orders.orders.services.CustomerService;
import com.lambdaschool.orders.orders.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderServices orderServices;

//    http://localhost:2019/orders/order/7
@GetMapping(value = "/order/{orderid}", produces = {"application/json"})
public ResponseEntity<?> findCustomerId(@PathVariable long orderid)
{
    Order rtnOrder = orderServices.findOrderById(orderid);
    return new ResponseEntity<>(rtnOrder, HttpStatus.OK);
}
}
