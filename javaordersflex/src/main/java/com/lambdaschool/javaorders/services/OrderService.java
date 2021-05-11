package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Order;

import java.util.List;

public interface OrderService {

    Order getOrderById(long ordnum);
    List<Order> getOrdersWithAdvanceAmount();

}
