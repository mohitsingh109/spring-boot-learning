## Assignment: Simple Spring Boot REST API

**Objective:** The objective of this assignment is to create a simple RESTful API using Spring Boot annotations. The API should demonstrate the use of various annotations such as `@RestController`, `@GetMapping`, `@RequestMapping`, `@Service`, `@PathVariable`, `@RequestParam`, and others.

**Project Description:**

You are tasked with developing a simple Spring Boot application that provides endpoints for managing a collection of books.

**Requirements:**

1. **Book Class:**
    - Create a class named `Book` in the package `com.example.springbootrestapi.model` to represent individual books.
    - Include attributes such as `title`, `author`, `isbn`, and `price`.
    - Implement appropriate getter and setter methods.

2. **BookService Class:**
    - Create a service class named `BookService` in the package `com.example.springbootrestapi.service` to manage the collection of books.
    - Implement a method named `getAllBooks()` to return a list of all books.
    - Implement a method named `getBookByISBN(String isbn)` to return details of a specific bookController by ISBN.

3. **REST Controller:**
    - Create a REST controller class named `BookController` in the package `com.example.springbootrestapi.controller` using the `@RestController` annotation.
    - Define endpoints using the `@GetMapping` and `@RequestMapping` annotations to:
        - Retrieve a list of all books (`getAllBooks()`).
        - Retrieve details of a specific bookController by ISBN (`getBookByISBN(String isbn)`).
        - Search for books by author using query parameters (`searchBooksByAuthor(String author)`).

4. **Endpoints:**
    - Implement the following endpoints:
        - `/books`: GET request to retrieve a list of all books (`getAllBooks()`).
        - `/books/{isbn}`: GET request to retrieve details of a specific bookController by ISBN (`getBookByISBN(String isbn)`).
        - `/books/search`: GET request to search for books by author using query parameters (`searchBooksByAuthor(String author)`).