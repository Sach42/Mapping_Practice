package com.sachin.mapping.practice.controller;

import com.sachin.mapping.practice.model.Book;
import com.sachin.mapping.practice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public void createBook(@RequestBody Book book) {
        bookService.createBook(book);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable String id) {
        return bookService.getBookById(id);
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable String id, @RequestBody Book book) {
        book.setID(id);
        bookService.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable String id) {
        bookService.deleteBookById(id);
    }
}