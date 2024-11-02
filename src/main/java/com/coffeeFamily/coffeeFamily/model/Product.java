package com.coffeeFamily.coffeeFamily.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String image;
    private Long stock;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}

