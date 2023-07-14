package com.sachin.mapping.practice.repository;

import com.sachin.mapping.practice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course, String> {
}
