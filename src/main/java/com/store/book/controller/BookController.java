package com.store.book.controller;

import com.store.book.entity.Book;
import com.store.book.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @PostMapping
    public ResponseEntity<Object> createBook(@RequestBody Book book){
        bookRepository.save(book);
        return ResponseEntity.status(HttpStatus.OK).body("Created");
    }
//    @Scheduled(cron =" 0 0 7 * * *" )
}
