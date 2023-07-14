package com.sachin.mapping.practice.repository;

import com.sachin.mapping.practice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book, String> {
}
