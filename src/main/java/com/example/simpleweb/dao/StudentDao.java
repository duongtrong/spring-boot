package com.example.simpleweb.dao;

import com.example.simpleweb.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {

    @Override
    List<Student> findAll();
}
