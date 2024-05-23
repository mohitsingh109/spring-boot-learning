package com.learning.springboot.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // lombok
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sb_books")
public class Book { // default table name will be book

    // Hybernates & JPA (Spring it's a wrapper on Hybernates)

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO) // Database H2, Oracle, MySQL
    //@GeneratedValue(strategy = GenerationType.IDENTITY) // Column auto increment
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
    @SequenceGenerator(name="book_generator", sequenceName = "book_sequence", allocationSize = 1, initialValue = 100)
    private Integer id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="isbn", nullable = false)
    private String isbn;

    @Column(name="price", nullable = false)
    private Double price;
}
