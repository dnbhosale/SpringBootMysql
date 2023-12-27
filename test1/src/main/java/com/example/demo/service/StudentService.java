// com.example.demo.service.StudentService

package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);
    
    public Student getStudentById(Long id);
}
