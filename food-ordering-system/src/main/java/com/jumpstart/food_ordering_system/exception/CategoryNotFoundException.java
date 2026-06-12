package com.jumpstart.food_ordering_system.exception;

/**
 * PURPOSE OF CUSTOM EXCEPTIONS:
 * 1. Business-Centric Domain Errors: They allow developers to create descriptive, human-readable
 * exceptions tailored specifically to business scenarios rather than relying on generic Java exceptions.
 * 2. Centralized Error Handling: They make it easy to intercept specific application failures using
 * Global Exception Handlers (@ControllerAdvice) to return uniform JSON error responses to front-end clients.
 * 3. Cleaner Debugging & Maintainability: They improve the quality of application logs, making tracking
 * down specific application runtime anomalies significantly faster.
 */
public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException(String message) {
        super(message);
    }
}