package com.example.demo.service;

import java.util.list;

import com.example.demo.entity.StudentEntity;

public interface StudentService {

    public StudentEntity addStudents(StudentEntity student);

    public List<StudentEntity> getStudents();

}