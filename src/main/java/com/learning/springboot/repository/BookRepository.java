package com.learning.springboot.repository;

import com.learning.springboot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                                        // <Entity, PK Type>
public interface BookRepository extends JpaRepository<Book, Integer> {
    //???
}

/**
 * org.hibernate.dialect.H2Dialect
 *     IMPL: H2Dialect // This guy know how to create sql statement for H2 DB
 */