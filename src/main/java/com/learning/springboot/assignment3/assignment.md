## Assignment: Simple Spring Boot REST API for Product Management

**Objective:** The objective of this assignment is to create a simple RESTful API using Spring Boot annotations, including entity and repository-related annotations. The API should demonstrate the use of various annotations such as `@RestController`, `@GetMapping`, `@PostMapping`, `@DeleteMapping`, `@RequestMapping`, `@PathVariable`, `@RequestParam`, `@Entity`, `@Id`, `@Column`, `@Getter`, `@Setter`, `@AllArgsConstructor`, `@NoArgsConstructor`, `@Repository`, and repository methods like `save()`, `findById()`, `findAll()`, `deleteById()`, `deleteAll()`, and `delete()`. Additionally, it should include validation and DTOs for data transfer.

**Project Description:**

You are tasked with developing a simple Spring Boot application that provides endpoints for managing a collection of products. The application should demonstrate the use of entity annotations, repository operations, validation, and DTOs.

**Requirements:**

1. **Product Class:**
    - Create a class named `Product` in the package `com.example.springbootrestapi.model`.
    - Annotate the class with `@Entity`.
    - Include attributes such as `id`, `name`, `description`, `price`, and `quantity`.
    - Annotate the `id` field with `@Id`.
    - Annotate other fields with `@Column`.
    - Use Lombok annotations `@Getter`, `@Setter`, `@AllArgsConstructor`, and `@NoArgsConstructor` for boilerplate code reduction.

2. **ProductRepository Interface:**
    - Create a repository interface named `ProductRepository` in the package `com.example.springbootrestapi.repository`.
    - Extend `JpaRepository<Product, Long>`.
    - This interface will automatically provide CRUD methods like `save()`, `findById()`, `findAll()`, `deleteById()`, `deleteAll()`, and `delete()`.

3. **ProductService Class:**
    - Create a service class named `ProductService` in the package `com.example.springbootrestapi.service` to manage the collection of products.
    - Autowire the `ProductRepository`.
    - Implement methods:
        - `getAllProducts()` to return a list of all products.
        - `getProductById(Long id)` to return details of a specific product by ID.
        - `addProduct(Product product)` to add a new product to the collection.
        - `deleteProductById(Long id)` to delete a product by ID.
        - `deleteAllProducts()` to delete all products.

4. **ProductDTO Class:**
    - Create a Data Transfer Object (DTO) class named `ProductDTO` in the package `com.example.springbootrestapi.dto`.
    - Include attributes such as `name`, `description`, `price`, and `quantity`.
    - Use Lombok annotations `@Getter`, `@Setter`, `@AllArgsConstructor`, and `@NoArgsConstructor`.

5. **ProductController Class:**
    - Create a REST controller class named `ProductController` in the package `com.example.springbootrestapi.controller` using the `@RestController` annotation.
    - Define endpoints using the `@GetMapping`, `@PostMapping`, `@DeleteMapping`, and `@RequestMapping` annotations to:
        - Retrieve a list of all products (`getAllProducts()`).
        - Retrieve details of a specific product by ID (`getProductById(Long id)`).
        - Add a new product to the collection (`addProduct(ProductDTO productDTO)`).
        - Delete a product by ID (`deleteProductById(Long id)`).
        - Delete all products (`deleteAllProducts()`).

6. **Validation:**
    - Add validation to the `ProductDTO` fields using annotations such as `@NotNull`, `@Size`, and `@Min`.

7. **Endpoints:**
    - Implement the following endpoints:
        - `/products`: GET request to retrieve a list of all products (`getAllProducts()`).
        - `/products/{id}`: GET request to retrieve details of a specific product by ID (`getProductById(Long id)`).
        - `/products`: POST request to add a new product to the collection (`addProduct(ProductDTO productDTO)`).
        - `/products/{id}`: DELETE request to delete a product by ID (`deleteProductById(Long id)`).
        - `/products`: DELETE request to delete all products (`deleteAllProducts()`).
