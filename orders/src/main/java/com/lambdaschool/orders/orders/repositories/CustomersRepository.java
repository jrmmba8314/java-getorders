package com.lambdaschool.orders.orders.repositories;

import com.lambdaschool.orders.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customer, Long> {
}
