package com.lambdaschool.orders.orders.services;

import com.lambdaschool.orders.orders.models.Agent;
import com.lambdaschool.orders.orders.models.Order;

import java.util.List;

public interface OrderServices {
    Order save(Order order);

    Order findOrderById(long id);

}
