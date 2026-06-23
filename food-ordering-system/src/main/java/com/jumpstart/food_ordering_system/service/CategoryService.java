package com.jumpstart.food_ordering_system.service;

import com.jumpstart.food_ordering_system.dto.CategoryDto;
import java.util.List;

/**
 * The CategoryService interface defines the business logic contract
 * for handling food category operations.
 */
public interface CategoryService {

    // Your existing method:
    List<CategoryDto> getAllCategories();

    // Add these 4 new lines for the tasks:
    CategoryDto getCategoryById(Long id);
    CategoryDto addCategory(CategoryDto dto);
    CategoryDto updateCategory(Long id, CategoryDto dto);
    void deleteCategory(Long id);
}