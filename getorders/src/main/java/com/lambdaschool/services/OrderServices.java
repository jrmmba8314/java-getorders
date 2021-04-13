package com.lambdaschool.services;

import com.lambdaschool.models.Order;

import java.util.List;

public interface OrderServices {

    List findAllOrders();

    Order findOrderById(long id);
}
