package com.lambdaschool.repositories;

import com.lambdaschool.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Long> {
}
