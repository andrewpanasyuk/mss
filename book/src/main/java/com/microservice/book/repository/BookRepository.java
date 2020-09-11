package com.microservice.book.repository;

import com.microservice.book.model.Book;

import java.util.List;

public interface BookRepository {

    List<Book> getBooks();

    Book findBookById(int id);

    void saveBook(Book book);

    void deleteBook(int id);

}
