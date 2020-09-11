package com.microservice.book.controller;

import com.microservice.book.model.Book;
import com.microservice.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

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

    public int createOrder(int bookId, int number, int customerId) {
        return orderService.createOrder(bookId, number, customerId).getId();
    }

    public void addBook(int orderId, int bookId, int number) {
        orderService.addBook(orderId, bookId, number);
    }

    public void completeOrder(int orderId) {
        orderService.complete(orderId);
    }

    public void deliver(int orderId) {
        orderService.deliver(orderId);
    }

    public void cancel(int orderId) {
        orderService.cancel(orderId);
    }
}
