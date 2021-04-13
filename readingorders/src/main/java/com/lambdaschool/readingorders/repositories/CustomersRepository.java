package com.lambdaschool.readingorders.repositories;

import com.lambdaschool.readingorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customer, Long> {

}
