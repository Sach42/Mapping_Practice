package com.sachin.mapping.practice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ID;
    private String title;
    private String author;
    private String description;
    private String price;

    @ManyToOne
    private Student student;
}
