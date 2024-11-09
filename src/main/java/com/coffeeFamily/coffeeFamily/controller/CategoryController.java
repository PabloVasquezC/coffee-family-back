package com.coffeeFamily.coffeeFamily.controller;

import org.springframework.web.bind.annotation.*;
import com.coffeeFamily.coffeeFamily.model.Category;
import com.coffeeFamily.coffeeFamily.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@CrossOrigin(origins = "https://familycoffee.vercel.app")
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    @PostMapping
    public Category save(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        categoryService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Category update(@PathVariable Long id, @RequestBody Category category) {
        return categoryService.update(id, category);
    }
}
