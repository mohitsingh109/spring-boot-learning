package com.learning.springboot.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

    @Id // this indicate primary key
    @Column(name="b_id")
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
