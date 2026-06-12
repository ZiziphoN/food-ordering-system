# Food Ordering System

A Spring Boot backend application integrated with a local MySQL database.

## Requirements Completed:
- Formulated local MySQL schema and data tables.
- Linked Spring Boot application using JPA properties.
- Constructed project package layouts and models.

## PART 4: PROJECT INVESTIGATION

### 1. What is Spring Boot?
Spring Boot is an open-source, Java-based framework used to create stand-alone, production-grade applications quickly. It takes the complex, manual configuration requirements of the traditional Spring Framework and automates them using "starter" dependencies and auto-configuration, allowing developers to just focus on writing code.

### 2. What is Maven?
Maven is a powerful project management and build automation tool used primarily for Java applications. It manages a project's lifecycle—including compiling, testing, packaging, and deploying code—and automatically downloads any external libraries (jars) your project needs to run.

### 3. What is the purpose of pom.xml?
The `pom.xml` (Project Object Model) file is the heart of a Maven project. It is an XML file that contains all the vital configuration information for building the project, including:
* Project metadata (name, version, group ID).
* The list of external dependencies and libraries the application requires.
* Build plugins and target Java version configurations.

### 4. What is the purpose of application.properties?
The `application.properties` file is the central configuration file for a Spring Boot application. It is used to define environment-specific variables and framework settings without altering the actual Java code, such as server configurations, database connection details, logging levels, and JPA settings.

### 5. What does @SpringBootApplication do?
`@SpringBootApplication` is a convenience annotation placed on the main class of a project. It is a combination of three critical annotations that kickstart the application:
* **`@SpringBootConfiguration`**: Marks the class as a source of bean definitions.
* **`@EnableAutoConfiguration`**: Tells Spring Boot to automatically configure beans based on the libraries present on your classpath.
* **`@ComponentScan`**: Directs Spring to scan the current package and its sub-packages for components, controllers, and services.

### 6. Why do developers use dependency management tools such as Maven?
Developers use dependency management tools to avoid "dependency hell"—the tedious and error-prone process of manually downloading `.jar` files, tracking down their correct versions, and verifying if those libraries conflict with one another. Tools like Maven centralize this process, automatically download transitively required libraries, and ensure consistency across different development teams.

### 7. What is a REST API?
A REST (Representational State Transfer) API is an architectural style for designing web services that allow different software systems to communicate over HTTP. It uses standard HTTP methods—such as **GET** (read), **POST** (create), **PUT** (update), and **DELETE** (remove)—to manipulate resources represented by uniform web addresses (URLs).

### 8. What is JSON?
JSON (JavaScript Object Notation) is a lightweight, text-based format used for storing and transporting data. It is easy for humans to read and write, and highly efficient for machines to parse and generate. In modern web development, it acts as the standard format for exchanging data between a backend server and a frontend application or database.

### 9. What is Dependency Injection?
Dependency Injection (DI) is a design pattern used to achieve Inversion of Control (IoC) between classes and their dependencies. Instead of a class manually creating or instantiating an object it needs to function (hardcoding a dependency), the framework (Spring) automatically creates the object and injects (passes) it into the class at runtime, resulting in loosely coupled, easily testable code.
