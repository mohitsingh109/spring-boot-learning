## Assignment: Simple Spring Boot REST API for User Management

**Objective:** The objective of this assignment is to create a simple RESTful API using Spring Boot annotations, including entity-related annotations. The API should demonstrate the use of various annotations such as `@RestController`, `@GetMapping`, `@PostMapping`, `@RequestMapping`, `@PathVariable`, `@RequestParam`, `@Entity`, `@Id`, `@Column`, `@Getter`, `@Setter`, `@AllArgsConstructor`, and `@NoArgsConstructor`.

**Project Description:**

You are tasked with developing a simple Spring Boot application that provides endpoints for managing a collection of users. The application should demonstrate the use of entity annotations, but without actual database integration.

**Requirements:**

1. **User Class:**
    - Create a class named `User` in the package `com.example.springbootrestapi.model`.
    - Annotate the class with `@Entity`.
    - Include attributes such as `id`, `name`, `email`, and `age`.
    - Annotate the `id` field with `@Id`.
    - Annotate other fields with `@Column`.
    - Use Lombok annotations `@Getter`, `@Setter`, `@AllArgsConstructor`, and `@NoArgsConstructor` for boilerplate code reduction.

2. **UserService Class:**
    - Create a service class named `UserService` in the package `com.example.springbootrestapi.service` to manage the collection of users.
    - Implement methods:
        - `getAllUsers()` to return a list of all users.
        - `getUserByEmail(String email)` to return details of a specific user by email.
        - `addUser(User user)` to add a new user to the collection.

3. **REST Controller:**
    - Create a REST controller class named `UserController` in the package `com.example.springbootrestapi.controller` using the `@RestController` annotation.
    - Define endpoints using the `@GetMapping`, `@PostMapping`, and `@RequestMapping` annotations to:
        - Retrieve a list of all users (`getAllUsers()`).
        - Retrieve details of a specific user by email (`getUserByEmail(String email)`).
        - Add a new user to the collection (`addUser(User user)`).

4. **Endpoints:**
    - Implement the following endpoints:
        - `/users`: GET request to retrieve a list of all users (`getAllUsers()`).
        - `/users/{email}`: GET request to retrieve details of a specific user by email (`getUserByEmail(String email)`).
        - `/users`: POST request to add a new user to the collection (`addUser(User user)`).

