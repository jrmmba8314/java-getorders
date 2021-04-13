package com.lambdaschool.repositories;

import com.lambdaschool.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer,Long> {


    List<Customer> findByNameContainingIgnoringCase(String thename);
}
