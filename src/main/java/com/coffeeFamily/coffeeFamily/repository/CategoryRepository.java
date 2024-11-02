package com.coffeeFamily.coffeeFamily.repository;

import org.springframework.stereotype.Repository;
import com.coffeeFamily.coffeeFamily.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
