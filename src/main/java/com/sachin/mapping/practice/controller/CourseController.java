package com.sachin.mapping.practice.controller;

import com.sachin.mapping.practice.model.Course;
import com.sachin.mapping.practice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public void createCourse(@RequestBody Course course) {
        courseService.createCourse(course);
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable String id) {
        return courseService.getCourseById(id);
    }

    @PutMapping("/{id}")
    public void updateCourse(@PathVariable String id, @RequestBody Course course) {
        course.setID(id);
        courseService.updateCourse(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourseById(@PathVariable String id) {
        courseService.deleteCourseById(id);
    }
}