package com.lambdaschool.orders.orders.services;

import com.lambdaschool.orders.orders.models.Order;
import com.lambdaschool.orders.orders.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "orderService")
public class OrderServicesImpl implements OrderServices{
    @Autowired
    OrdersRepository orderrepos;

    @Transactional
    @Override
    public Order save(Order order) {
        return orderrepos.save(order);
    }

    @Override
    public Order findOrderById(long id) {
        Order rtnOrder = orderrepos.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Order "+id+" Not Found"));
        return rtnOrder;
    }
}
