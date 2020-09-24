package com.microservice.book.controller.v1;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.microservice.book.controller.dto.v1.BookDTO;
import com.microservice.book.model.Book;
import com.microservice.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RefreshScope
@RequestMapping("books")
public class BookController {

    @Value("${library.name}")
    private String libraryName ;

    private final Mapper dozerBeanMapper = DozerBeanMapperBuilder.create().build();

    @Autowired
    private BookService bookService;

    @GetMapping("/library")
    public String getLibraryName() {
        return libraryName;
    }

    @GetMapping
    public List<BookDTO> getBooks() {

        List<BookDTO> books = bookService.getBooks()
                .stream()
                .map(book -> dozerBeanMapper.map(book, BookDTO.class))
                .collect(Collectors.toList());
//        books.forEach(book -> book.setHitCount(String.valueOf(bookService.getHitCount(book.getId()))));
        return books;
    }

    @GetMapping("{id}")
    public BookDTO getBook(@PathVariable int id) {
        BookDTO bookDTO = dozerBeanMapper.map(bookService
                .findBookById(id), BookDTO.class);
//        bookDTO.setHitCount(bookService.getHitCount(id));
        return bookDTO;
    }

    @PostMapping
    public void saveBook(@RequestBody BookDTO bookDTO) {
        Book book = dozerBeanMapper.map(bookDTO, Book.class);
        bookService.saveBook(book);
    }

    public void updateBook(BookDTO bookDTO) {
        Book book = dozerBeanMapper.map(bookDTO, Book.class);
        bookService.saveBook(book);
    }

}
