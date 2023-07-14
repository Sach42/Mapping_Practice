package com.sachin.mapping.practice.service;

import com.sachin.mapping.practice.model.Course;
import com.sachin.mapping.practice.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private ICourseRepo courseRepo;

    public void createCourse(Course course) {
        courseRepo.save(course);
    }

    public Course getCourseById(String id) {
        return courseRepo.findById(id).orElse(null);
    }

    public void updateCourse(Course course) {
        courseRepo.save(course);
    }

    public void deleteCourseById(String id) {
        courseRepo.deleteById(id);
    }
}
