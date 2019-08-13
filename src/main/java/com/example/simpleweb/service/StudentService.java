package com.example.simpleweb.service;

import com.example.simpleweb.dao.StudentDao;
import com.example.simpleweb.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    private int studentIdCount = 1;
    private List<Student> list = new CopyOnWriteArrayList<>();

    public Student addStudent(Student student) {
//        student.setStudentId(studentIdCount);
//        list.add(student);
//        studentIdCount++;
//        return student;
        return studentDao.save(student);
    }

    public List<Student> getStudents() {
//        return list;
        return studentDao.findAll();
    }

    public Student getStudent(int studentId) {
//        return list.stream().filter(c -> c.getStudentId() == studentId).findFirst().get();
        return studentDao.findById(studentId).get();
    }

    public Student update(int studentId, Student student) {
//        list.stream().forEach(c -> {
//            if (c.getStudentId() == studentId) {
//                c.setFullName(student.getFullName());
//                c.setPhone(student.getPhone());
//                c.setEmail(student.getEmail());
//                c.setAddress(student.getAddress());
//            }
//        });
//        return list.stream().filter(c -> c.getStudentId() == studentId).findFirst().get();
        student.setStudentId(studentId);
        return studentDao.save(student);
    }

    public void deleteStudent(int studentId){
//        list.stream().forEach(c -> {
//            if (c.getStudentId() == studentId){
//                list.remove(c);
//            }
//        });
        studentDao.deleteById(studentId);
    }
}
