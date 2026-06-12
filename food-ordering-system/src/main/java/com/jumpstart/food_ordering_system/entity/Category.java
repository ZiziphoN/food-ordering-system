package com.jumpstart.food_ordering_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * The Category class represents a domain model entity mapping to the 'category' table
 * in the MySQL food_ordering_db database. It stores various food groups such as
 * Fast Food, Pizza, Drinks, and Desserts.
 */
@Entity
@Table(name = "category")
public class Category {

    // Marks this field as the primary key of the table
    @Id
    // Configures the database to automatically increment the ID value (AUTO_INCREMENT)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Stores the descriptive name of the category (e.g., "Fast Food")
    private String name;

    // Default No-Args Constructor (Required by JPA/Hibernate specification)
    public Category() {
    }

    // Parameterized Constructor for easy object creation
    public Category(String name) {
        this.name = name;
    }

    // Getters and Setters to allow data access and modification
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
