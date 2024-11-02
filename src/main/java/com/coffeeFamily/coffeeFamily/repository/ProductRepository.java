package com.coffeeFamily.coffeeFamily.repository;

import org.springframework.stereotype.Repository;
import com.coffeeFamily.coffeeFamily.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
