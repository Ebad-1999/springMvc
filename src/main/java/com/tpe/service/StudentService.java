package com.tpe.service;

import com.tpe.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents();// if we need all student
    Student findStudentById(Long id);// if we need one student
    void saveStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Long id);
}
