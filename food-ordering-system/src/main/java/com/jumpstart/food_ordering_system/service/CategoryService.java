package com.jumpstart.food_ordering_system.service;

import com.jumpstart.food_ordering_system.dto.CategoryDto;
import java.util.List;

public interface CategoryService {

    // 1. Create
    CategoryDto createCategory(CategoryDto categoryDto);

    // 2. Read All
    List<CategoryDto> getAllCategories();

    // 3. Read One by ID
    CategoryDto getCategoryById(Long id);

    // 4. Update
    CategoryDto updateCategory(Long id, CategoryDto categoryDto);

    // 5. Delete
    void deleteCategory(Long id);
}