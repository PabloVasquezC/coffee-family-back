package com.coffeeFamily.coffeeFamily.controller;

import com.coffeeFamily.coffeeFamily.model.Category;
import org.springframework.web.bind.annotation.*;
import com.coffeeFamily.coffeeFamily.model.Product;
import com.coffeeFamily.coffeeFamily.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@CrossOrigin(origins = "https://coffe-family-front.vercel.app")
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        return productService.update(id, product);
    }
}
