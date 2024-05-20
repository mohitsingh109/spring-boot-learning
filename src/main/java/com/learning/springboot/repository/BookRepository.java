package com.learning.springboot.repository;

import com.learning.springboot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository                                        // <Entity, PK Type>
public interface BookRepository extends JpaRepository<Book, Integer> {

    // Custom

    // select * from table where name = '??'
    // Dynamic Query
    List<Book> findByName(String name);

    // where name LIKE 'roh%'
    List<Book> findByNameStartingWith(String name);

    List<Book> findByNameEndingWith(String name);

    // name is not null;
    List<Book> findByNameIsNotNull();

    List<Book> findByNameAndTitle(String name, String title);

    List<Book> findByNameAndTitleStartingWith(String name, String title);

    List<Book> findByNameContaining(String name);

    List<Book> findByNameIn(List<String> name);

    List<Book> findByNameNotIn(List<String> name);

    // select * from table where name='?' order By title;
    List<Book> findByNameOrderByTitle(String name);

    List<Book> findByNameIgnoreCase(String name);


    @Query("select b from Book b where b.title= ?1")
    List<Book> searchByTitle(String title);

    @Query("select b from Book b where b.title= ?1 and b.name = ?2")
    List<Book> searchByTitleAndName(String title, String name);

    @Query(value = "select * from sb_books where title LIKE '%?1%'", nativeQuery = true)
    List<Book> searchWithContainsTitle(String title);

    // DTO + Query

    // Product Name, ID Quantity = 0
    //

}

/**
 * org.hibernate.dialect.H2Dialect
 *     IMPL: H2Dialect // This guy know how to create sql statement for H2 DB
 */