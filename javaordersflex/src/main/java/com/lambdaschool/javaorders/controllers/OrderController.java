package com.lambdaschool.javaorders.controllers;

import com.lambdaschool.javaorders.models.Order;
import com.lambdaschool.javaorders.services.OrderService;
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
@RequestMapping(value = "/orders")
public class OrderController
{
    @Autowired
    OrderService orderService;

    @GetMapping(value = "/order/{ordnum}", produces = "application/json")
    public ResponseEntity<?> getOrderById(@PathVariable long ordnum)
    {
        Order returnOrder = orderService.getOrderById(ordnum);
        return new ResponseEntity<>(returnOrder, HttpStatus.OK);

    }

    @GetMapping(value = "/advanceamount", produces = "application/json")
    public ResponseEntity<?> getOrdersWithAdvanceAmount()
    {
        List<Order> returnList = new ArrayList<>();
        returnList = orderService.getOrdersWithAdvanceAmount();
        return new ResponseEntity<>(returnList, HttpStatus.OK);
    }


}
