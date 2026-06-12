
package com.jumpstart.food_ordering_system.service;

import com.jumpstart.food_ordering_system.dto.CategoryDto;
import java.util.List;

/**
 * The CategoryService interface defines the business logic contract
 * for handling food category operations.
 */
public interface CategoryService {

    // Method to retrieve all food categories mapped as DTOs
    List<CategoryDto> getAllCategories();
}