package com.learning.springboot.service;

import com.learning.springboot.model.Book;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    public Book saveBook(Book book) {
        return book;
    }
}
