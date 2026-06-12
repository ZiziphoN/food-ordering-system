package com.jumpstart.food_ordering_system.dto;

/**
 * The CategoryDto class represents a Data Transfer Object (DTO).
 * * PURPOSE OF A DTO:
 * 1. Data Encapsulation: It isolates the internal database entities (like Category.java)
 * from the external layer (API endpoints/Frontend clients).
 * 2. Security & Optimization: It allows developers to transfer only the specific data
 * needed for a request or response, preventing sensitive or unnecessary database columns
 * from being exposed over the network.
 * 3. Decoupling: It ensures that if the database table schema changes in the future,
 * the API contract with the client remains unaffected and stable.
 */
public class CategoryDto {

    private Long id;
    private String name;

    // Default No-Args Constructor
    public CategoryDto() {
    }

    // Parameterized Constructor for easy creation
    public CategoryDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
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