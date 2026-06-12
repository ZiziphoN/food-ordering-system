package com.jumpstart.food_ordering_system.controller;

import com.jumpstart.food_ordering_system.dto.CategoryDto;
import com.jumpstart.food_ordering_system.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * RESPONSIBILITY OF A CONTROLLER:
 * 1. HTTP Request Handling: It acts as the presentation layer gateway, intercepting web requests
 * (GET, POST, PUT, DELETE) from web browsers or API clients mapped to specific URIs.
 * 2. Protocol Validation & Routing: It parses incoming client parameters, ensures basic HTTP data payload
 * validity, and seamlessly delegates execution paths to underlying service structures.
 * 3. Formatting Outbound Responses: It wraps business outputs into standardized HTTP response formats,
 * automatically converting Java collections or objects into clean JSON payloads along with matching HTTP status codes.
 */
@RestController
@RequestMapping("/api/category")
public class CategoryController {

    // RESPONSIBILITY 1: Inject CategoryService via Constructor Injection
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    /**
     * RESPONSIBILITY 2 & 3: Handle the GET request, call getAllCategories(),
     * and return the category list back to the client.
     * Endpoint: GET http://localhost:7600/api/category
     */
    @GetMapping
    public ResponseEntity<List<CategoryDto>> getAllCategories() {
        List<CategoryDto> categories = categoryService.getAllCategories();
        return ResponseEntity.ok(categories);
    }
}
