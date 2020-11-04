package com.lambdaschool.orders.repositories;

import com.lambdaschool.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * The CRUD Repository connecting Customer to rest of the application.
 */
public interface CustomersRepository
    extends CrudRepository<Customer, Long>
{
}

