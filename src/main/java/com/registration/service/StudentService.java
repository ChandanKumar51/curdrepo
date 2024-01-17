package com.registration.service;

import com.registration.entity.Student;

import java.util.List;

public interface StudentService {

    void createStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);
    }
