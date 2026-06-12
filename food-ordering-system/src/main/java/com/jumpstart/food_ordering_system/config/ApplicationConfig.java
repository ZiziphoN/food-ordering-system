package com.jumpstart.food_ordering_system.config;

import org.springframework.context.annotation.Configuration;

/**
 * PURPOSE OF CONFIGURATION CLASSES:
 * 1. Bean Definitions: They serve as central hubs where developers can explicitly define Spring Beans
 * using the @Bean annotation, instructing the Spring IoC Container to instantiate and manage those components.
 * 2. Third-Party Integration: They allow you to configure classes from external libraries (like ModelMapper,
 * Security configurations, or cloud services) that cannot be annotated with standard stereotypes like @Component.
 * 3. Environment Flexibility: They help decouple environment-specific setup logic from standard business
 * logic, ensuring smoother adjustments across development, testing, and production states.
 */
@Configuration
public class ApplicationConfig {

}