package com.learning.springboot.service;

import com.learning.springboot.model.Book;
import com.learning.springboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/***
 * URL: http://localhost:9000/h2-console/
 *
 *
 */
@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired // this tell spring to add BookRepository object in this class
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book); // JPA automatically insert in DB
    }

    public Book fetchBookById(Integer id) {
        Optional<Book> byId = bookRepository.findById(id);
        // Optional Java 11

        if(byId.isEmpty()) {
            return null;
        }

        return byId.get(); // Value
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll(); // select * from table;
    }

    public List<Book> getAllBooksSortByName() {
        // select * from table order by name;
        return bookRepository.findAll(Sort.by("name"));
    }

    public void deleteById(Integer id) {
        bookRepository.deleteById(id);
    }

    public List<Book> getBookByName(String name) {
        return bookRepository.findByName(name, Sort.by("title"));
    }
}
