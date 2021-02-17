package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Order;
import com.lambdaschool.orders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service(value = "agentService")
public class OrderServiceImpl implements OrderService
{
    @Autowired
    private OrderRepository ordersrepos;

    @Override
    public List<Order> findOrdersWithAdvanceAmount()
    {
        return ordersrepos.findAllByAdvanceamountGreaterThan(0.00);
    }

    @Override
    public Order findOrdersById(long id) throws EntityNotFoundException
    {
        return ordersrepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Order " + id + " not found! "));
    }


}
