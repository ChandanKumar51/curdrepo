package com.registration.controller;
import com.registration.entity.Student;
import com.registration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //http://localhost:8080/api/students
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return ResponseEntity.ok(student);
    }

    //http://localhost:8080/api/students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    //http://localhost:8080/api/students/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    //http://localhost:8080/api/students/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        Student updatedStudent = studentService.updateStudent(id, student);
        return ResponseEntity.ok(updatedStudent);
    }

    //http://localhost:8080/api/students/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
