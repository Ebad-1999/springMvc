package com.tpe.repository;

import com.tpe.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    List<Student> getAll();// if we need all student
    Optional<Student> findById(Long id);// if we need ond student
     void save(Student student);
     void update(Student student);
     void delete(Long id);

}
