package com.sachin.mapping.practice.service;

import com.sachin.mapping.practice.model.Book;
import com.sachin.mapping.practice.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private IBookRepo bookRepo;

    public void createBook(Book book) {
        bookRepo.save(book);
    }

    public Book getBookById(String id) {
        return bookRepo.findById(id).orElse(null);
    }

    public void updateBook(Book book) {
        bookRepo.save(book);
    }

    public void deleteBookById(String id) {
        bookRepo.deleteById(id);
    }
}