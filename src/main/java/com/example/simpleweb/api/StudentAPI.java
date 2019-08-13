package com.example.simpleweb.api;

import com.example.simpleweb.model.Student;
import com.example.simpleweb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentAPI {

    @Autowired
    private StudentService service;

    @PostMapping
    private Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @GetMapping
    private List<Student> getStudents() {
        return service.getStudents();
    }

    @GetMapping(value = "/{studentId}")
    public Student getStudent(@PathVariable("studentId") int studentId) {
        return service.getStudent(studentId);
    }

    @PutMapping(value = "/{studentId}")
    public Student update(@PathVariable("studentId") int studentId, @RequestBody Student student) {
        return service.update(studentId, student);
    }

    @DeleteMapping(value = "/{studentId}")
    public void deleteStudent(@PathVariable("studentId") int studentId) {
        service.getStudent(studentId);
    }
}
