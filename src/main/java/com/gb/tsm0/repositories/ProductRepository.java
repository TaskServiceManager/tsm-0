package com.gb.tsm0.repositories;

import com.gb.tsm0.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
