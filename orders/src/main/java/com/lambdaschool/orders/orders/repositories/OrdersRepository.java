package com.lambdaschool.orders.orders.repositories;

import com.lambdaschool.orders.orders.models.Agent;
import com.lambdaschool.orders.orders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Order, Long>{
}
