package com.lambdaschool.repositories;

import com.lambdaschool.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Long> {
}
