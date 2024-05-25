# Assignment: E-Commerce System API with Spring Boot and One-to-One Mapping

**Objective:** Create a RESTful API for an e-commerce system using Spring Boot. The API should manage users and their profiles, demonstrating `OneToOne` relationships, pagination, sorting, and advanced query capabilities.

## Requirements

1. **Entities:**
    - Create three entities: `User`, `Address`, and `Profile`.

2. **User Class:**
    - Package: `com.example.ecommerce.model`
    - Annotations: `@Entity`
    - Fields: `id`, `username`, `email`, `password`, `profile`
    - Annotations on fields: `@Id`, `@GeneratedValue`, `@Column`, `@OneToOne`
    - Use Lombok annotations: `@Getter`, `@Setter`, `@AllArgsConstructor`, `@NoArgsConstructor`

3. **Profile Class:**
    - Package: `com.example.ecommerce.model`
    - Annotations: `@Entity`
    - Fields: `id`, `firstName`, `lastName`, `phoneNumber`, `user`
    - Annotations on fields: `@Id`, `@GeneratedValue`, `@Column`, `@OneToOne`, `@MapsId`
    - Use Lombok annotations: `@Getter`, `@Setter`, `@AllArgsConstructor`, `@NoArgsConstructor`

4. **Address Class:**
    - Package: `com.example.ecommerce.model`
    - Annotations: `@Entity`
    - Fields: `id`, `street`, `city`, `state`, `postalCode`, `user`
    - Annotations on fields: `@Id`, `@GeneratedValue`, `@Column`, `@OneToOne`, `@MapsId`
    - Use Lombok annotations: `@Getter`, `@Setter`, `@AllArgsConstructor`, `@NoArgsConstructor`

5. **Repositories:**
    - Create three repositories: `UserRepository`, `ProfileRepository`, and `AddressRepository`
    - Package: `com.example.ecommerce.repository`
    - Extend `JpaRepository`
    - Add custom query methods for filtering and searching

6. **Service Layer:**
    - Create a service layer with `UserService`, `ProfileService`, and `AddressService` classes
    - Package: `com.example.ecommerce.service`
    - Methods in `UserService`: `getAllUsers(Pageable pageable)`, `getUserById(Long id)`, `addUser(UserDTO userDTO)`, `deleteUserById(Long id)`, `findUserByEmail(String email)`
    - Methods in `ProfileService`: `getProfileByUserId(Long userId)`, `addProfile(Profile profile)`, `updateProfile(Long userId, Profile profile)`
    - Methods in `AddressService`: `getAddressByUserId(Long userId)`, `addAddress(Address address)`, `updateAddress(Long userId, Address address)`

7. **DTO:**
    - Create a `UserDTO` class for data transfer
    - Package: `com.example.ecommerce.dto`
    - Fields: `username`, `email`, `password`, `profile`, `address`
    - Use Lombok annotations: `@Getter`, `@Setter`, `@AllArgsConstructor`, `@NoArgsConstructor`

8. **Controller Layer:**
    - Create three controllers: `UserController`, `ProfileController`, and `AddressController`
    - Package: `com.example.ecommerce.controller`
    - Methods in `UserController`: `getAllUsers(Pageable pageable)`, `getUserById(Long id)`, `addUser(@RequestBody UserDTO userDTO)`, `deleteUserById(Long id)`, `findUserByEmail(@RequestParam String email)`
    - Methods in `ProfileController`: `getProfileByUserId(@PathVariable Long userId)`, `addProfile(@RequestBody Profile profile)`, `updateProfile(@PathVariable Long userId, @RequestBody Profile profile)`
    - Methods in `AddressController`: `getAddressByUserId(@PathVariable Long userId)`, `addAddress(@RequestBody Address address)`, `updateAddress(@PathVariable Long userId, @RequestBody Address address)`

9. **Exception Handling:**
    - Add custom exception handling for cases such as "User Not Found", "Profile Not Found", and "Address Not Found"
