package com.sachin.mapping.practice.controller;

import com.sachin.mapping.practice.model.Student;
import com.sachin.mapping.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public void createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable String id, @RequestBody Student student) {
        student.setID(id);
        studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable String id) {
        studentService.deleteStudentById(id);
    }
}