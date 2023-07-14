package com.sachin.mapping.practice.repository;

import com.sachin.mapping.practice.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop, String> {
}
