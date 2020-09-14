package com.microservice.book.service;

import com.microservice.book.model.Book;
import com.microservice.book.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookService {
    @Autowired
    private BookRepository bookRepository;

//    @Autowired
//    private HitClient hitClient;

    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    public Book findBookById(int id) {
        Book book = bookRepository
                .findBookById(id);
//        CompletableFuture.runAsync(() -> saveHit(id)).thenAcceptAsync(res ->
//                System.out.println("Hit saved for book " + id));
        return book;
    }

//    private void saveHit(int bookId) {
//        HitDTO hitDTO = new HitDTO();
//        hitDTO.setObjectId(bookId);
//        hitDTO.setType("book");
//        hitDTO.setViewed(LocalDateTime.now());
//        hitClient.saveHit(hitDTO);
//    }

//    @HystrixCommand(fallbackMethod = "getHitCountFallback")
//    public String getHitCount(int bookId) {
//        return hitClient.getHitCount(bookId, "book") + "";
//    }
//
//    public String getHitCountFallback(int bookId, Throwable t) {
//        log.error(t.getMessage(), t);
//        return "N/A";
//    }

    public void saveBook(Book book) {
        bookRepository.saveBook(book);
    }
}
