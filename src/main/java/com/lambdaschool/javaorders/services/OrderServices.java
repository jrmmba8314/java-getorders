package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Order;

import java.util.List;

public interface OrderServices {

    Order save(Order order);

    Order findOrderById(long id);


}
