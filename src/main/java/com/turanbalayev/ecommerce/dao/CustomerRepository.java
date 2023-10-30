package com.turanbalayev.ecommerce.dao;

import com.turanbalayev.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
