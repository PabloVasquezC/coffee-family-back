package com.coffeeFamily.coffeeFamily.service;

import org.springframework.stereotype.Service;
import com.coffeeFamily.coffeeFamily.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.coffeeFamily.coffeeFamily.model.Product;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public Product update(Long id, Product product) {
        Product productToUpdate = productRepository.findById(id).orElse(null);
        if (productToUpdate == null) {
            return null;
        }
        productToUpdate.setName(product.getName());
        productToUpdate.setPrice(product.getPrice());
        productToUpdate.setCategory(product.getCategory());
        return productRepository.save(productToUpdate);
    }
}
