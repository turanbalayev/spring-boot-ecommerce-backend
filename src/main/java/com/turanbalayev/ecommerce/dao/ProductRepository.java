package com.turanbalayev.ecommerce.dao;

import com.turanbalayev.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long> {
}
