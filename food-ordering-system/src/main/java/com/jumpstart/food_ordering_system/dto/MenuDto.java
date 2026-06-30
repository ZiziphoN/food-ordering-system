package com.jumpstart.food_ordering_system.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class MenuDto {
    private Long id;

    @NotBlank(message = "Name is required") // Handles Test 2 (missing name)
    private String name;

    private String description;

    @PositiveOrZero(message = "Price cannot be negative") // Handles Test 4 (negative price)
    private Double price;

    private String imageUrl;
    private Long categoryId;
    private String categoryName;
}