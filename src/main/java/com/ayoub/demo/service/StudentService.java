package com.ayoub.demo.service;

import com.ayoub.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> findAllStudents();

    Student save(Student student);

    Student findByEmail(String email);

    void delete (String email);
    Student update (Student s);

}