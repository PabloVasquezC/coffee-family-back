package com.coffeeFamily.coffeeFamily.service;

import com.coffeeFamily.coffeeFamily.model.Category;
import org.springframework.stereotype.Service;
import com.coffeeFamily.coffeeFamily.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.coffeeFamily.coffeeFamily.model.Product;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

    public Category update(Long id, Category category) {
        Category categoryToUpdate = categoryRepository.findById(id).orElse(null);
        if (categoryToUpdate == null) {
            return null;
        }
        categoryToUpdate.setName(category.getName());
        return categoryRepository.save(categoryToUpdate);
    }
}