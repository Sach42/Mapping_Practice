package com.sachin.mapping.practice.repository;

import com.sachin.mapping.practice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student, String> {
}
