package com.microservice.book.controller;

import com.microservice.book.model.Book;
import com.microservice.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    private String libraryName = "IT-Discovery library";

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/library")
    public String getLibraryName() {
        return libraryName;
    }

    @GetMapping("book")
    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    @GetMapping("book/{id}")
    public Book getBook(@PathVariable int id) {
        return bookRepository.findBookById(id);
    }

    @GetMapping
    public void saveBook(@RequestBody Book book) {
        bookRepository.saveBook(book);
    }

    public void updateBook(Book book) {
        bookRepository.saveBook(book);
    }

}
