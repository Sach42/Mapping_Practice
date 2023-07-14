package com.sachin.mapping.practice.service;

import com.sachin.mapping.practice.model.Student;
import com.sachin.mapping.practice.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private IStudentRepo studentRepo;

    public void createStudent(Student student) {
        studentRepo.save(student);
    }

    public Student getStudentById(String id) {
        return studentRepo.findById(id).orElse(null);
    }

    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    public void deleteStudentById(String id) {
        studentRepo.deleteById(id);
    }
}