package com.bootcamp.adventureworks.products.persistence.repositories;

import com.bootcamp.adventureworks.products.persistence.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
