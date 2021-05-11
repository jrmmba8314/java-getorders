package com.lambdaschool.javaorders.repositories;

import com.lambdaschool.javaorders.models.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Order, Long> {
    @Query(value = "SELECT * " +
            "FROM Orders " +
            "WHERE ADVANCEAMOUNT > 0", nativeQuery = true)
    List<Order> getOrdersWithAdvanceAmount();

}
