package com.jumpstart.food_ordering_system.service;

import com.jumpstart.food_ordering_system.dto.CategoryDto;
import com.jumpstart.food_ordering_system.entity.Category;
import com.jumpstart.food_ordering_system.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * WHAT THE SERVICE LAYER DOES:
 * 1. Business Logic Business Center: It coordinates and executes the application's core business processes.
 * 2. Component Decoupling: It isolates the heavy data-access mechanisms (Repository) from the API web layout (Controller).
 * 3. Data Transformation Layer: It handles the secure conversion of persistence database models (Entities) into lightweight objects (DTOs).
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    // RESPONSIBILITY 1: Inject CategoryRepository
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        // RESPONSIBILITY 2: Retrieve categories from the database
        List<Category> categories = categoryRepository.findAll();

        // RESPONSIBILITY 3 & 4: Convert Category entities into CategoryDto objects and return the list
        return categories.stream()
                .map(category -> new CategoryDto(category.getId(), category.getName()))
                .collect(Collectors.toList());
    }
}