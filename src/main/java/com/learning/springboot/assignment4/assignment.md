## Assignment: Advanced Spring Boot REST API for Order Management

**Objective:** The objective of this assignment is to create an advanced RESTful API using Spring Boot annotations, including entity, repository, and query-related annotations. The API should demonstrate the use of various annotations such as `@RestController`, `@GetMapping`, `@PostMapping`, `@DeleteMapping`, `@RequestMapping`, `@PathVariable`, `@RequestParam`, `@Entity`, `@Id`, `@Column`, `@Getter`, `@Setter`, `@AllArgsConstructor`, `@NoArgsConstructor`, `@Repository`, `@Query`, and repository methods like `findBy`, `Containing`, `NotIn`, `NotNull`. Additionally, it should include DTOs for data transfer in request bodies and responses.

**Project Description:**

You are tasked with developing an advanced Spring Boot application that provides endpoints for managing a collection of orders. The application should demonstrate the use of entity annotations, repository operations, custom query methods, validation, and DTOs.

**Requirements:**

1. **Order Class:**
    - Create a class named `Order` in the package `com.example.ordermanagement.model`.
    - Annotate the class with `@Entity`.
    - Include attributes such as `id`, `customerName`, `productName`, `quantity`, `status`, and `orderDate`.
    - Annotate the `id` field with `@Id`.
    - Annotate other fields with `@Column`.
    - Use Lombok annotations `@Getter`, `@Setter`, `@AllArgsConstructor`, and `@NoArgsConstructor` for boilerplate code reduction.

2. **OrderRepository Interface:**
    - Create a repository interface named `OrderRepository` in the package `com.example.ordermanagement.repository`.
    - Extend `JpaRepository<Order, Long>`.
    - Add custom query methods:
        - `List<Order> findByCustomerNameContaining(String customerName);`
        - `List<Order> findByStatusNotIn(List<String> statuses);`
        - `List<Order> findByOrderDateNotNull();`
        - Use the `@Query` annotation for a custom query that finds orders by product name and sorts them by order date.

3. **OrderService Class:**
    - Create a service class named `OrderService` in the package `com.example.ordermanagement.service` to manage the collection of orders.
    - Autowire the `OrderRepository`.
    - Implement methods:
        - `getAllOrders()` to return a list of all orders.
        - `getOrderById(Long id)` to return details of a specific order by ID.
        - `addOrder(Order order)` to add a new order to the collection.
        - `deleteOrderById(Long id)` to delete an order by ID.
        - `deleteAllOrders()` to delete all orders.
        - `findOrdersByCustomerName(String customerName)` to find orders by customer name containing a specific string.
        - `findOrdersByStatusNotIn(List<String> statuses)` to find orders by status not in a specified list.
        - `findOrdersByOrderDateNotNull()` to find orders where order date is not null.
        - `findOrdersByProductNameSorted(String productName)` to find orders by product name and sort by order date.

4. **OrderDTO Class:**
    - Create a Data Transfer Object (DTO) class named `OrderDTO` in the package `com.example.ordermanagement.dto`.
    - Include attributes such as `customerName`, `productName`, `quantity`, `status`, and `orderDate`.
    - Use Lombok annotations `@Getter`, `@Setter`, `@AllArgsConstructor`, and `@NoArgsConstructor`.
    - Add validation annotations to the fields as appropriate.

5. **OrderController Class:**
    - Create a REST controller class named `OrderController` in the package `com.example.ordermanagement.controller` using the `@RestController` annotation.
    - Define endpoints using the `@GetMapping`, `@PostMapping`, `@DeleteMapping`, and `@RequestMapping` annotations to:
        - Retrieve a list of all orders (`getAllOrders()`).
        - Retrieve details of a specific order by ID (`getOrderById(Long id)`).
        - Add a new order to the collection (`addOrder(OrderDTO orderDTO)`).
        - Delete an order by ID (`deleteOrderById(Long id)`).
        - Delete all orders (`deleteAllOrders()`).
        - Find orders by customer name containing a specific string (`findOrdersByCustomerName(String customerName)`).
        - Find orders by status not in a specified list (`findOrdersByStatusNotIn(List<String> statuses)`).
        - Find orders where order date is not null (`findOrdersByOrderDateNotNull()`).
        - Find orders by product name and sort by order date (`findOrdersByProductNameSorted(String productName)`).

6. **Endpoints:**
    - Implement the following endpoints:
        - `/orders`: GET request to retrieve a list of all orders (`getAllOrders()`).
        - `/orders/{id}`: GET request to retrieve details of a specific order by ID (`getOrderById(Long id)`).
        - `/orders`: POST request to add a new order to the collection (`addOrder(OrderDTO orderDTO)`).
        - `/orders/{id}`: DELETE request to delete an order by ID (`deleteOrderById(Long id)`).
        - `/orders`: DELETE request to delete all orders (`deleteAllOrders()`).
        - `/orders/search`: GET request to find orders by customer name containing a specific string (`findOrdersByCustomerName(@RequestParam String customerName)`).
        - `/orders/search/status`: GET request to find orders by status not in a specified list (`findOrdersByStatusNotIn(@RequestParam List<String> statuses)`).
        - `/orders/search/date`: GET request to find orders where order date is not null (`findOrdersByOrderDateNotNull()`).
        - `/orders/search/product`: GET request to find orders by product name and sort by order date (`findOrdersByProductNameSorted(@RequestParam String productName)`).
