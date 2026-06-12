package com.jumpstart.food_ordering_system.repository;

import com.jumpstart.food_ordering_system.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The CategoryRepository interface represents the Data Access Layer (DAL) of the application.
 *
 * RESPONSIBILITY OF A REPOSITORY:
 * 1. Database Abstraction: It acts as an intermediary between the business logic layer (Services)
 *    and the actual database table, isolating database operations from the rest of the application.
 * 2. Automatic CRUD Operations: By extending JpaRepository, Spring Data JPA automatically provides
 *    out-of-the-box methods for data persistence—such as save(), findById(), findAll(), and deleteById()—
 *    without requiring manual SQL queries.
 * 3. Object-Relational Mapping (ORM) Management: It manages the retrieval and storage of the 'Category'
 *    entity objects while cleanly handling the technicalities of the underlying database transactions.
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}