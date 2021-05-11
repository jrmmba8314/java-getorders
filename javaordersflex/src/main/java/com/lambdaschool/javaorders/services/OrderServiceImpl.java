package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Order;
import com.lambdaschool.javaorders.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service(value = "orderService")
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrdersRepository ordersRepository;

    @Override
    public Order getOrderById(long ordnum) {
        Order newOrder = ordersRepository.findById(ordnum)
                .orElseThrow(() -> new EntityNotFoundException("Order " + ordnum + " not found."));
        return newOrder;
    }

    @Override
    public List<Order> getOrdersWithAdvanceAmount() {
        return ordersRepository.getOrdersWithAdvanceAmount();
    }
}
