package com.ayoub.demo.service;


import com.ayoub.demo.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


@Repository
public class InMemoryStudentDao {
    private final List<Student> STUDENTS = new ArrayList<>();

    public Student save (Student s) {
        STUDENTS.add(s);
        return s;
    }
    public List<Student> findAllStudents() {
        return STUDENTS;
    }
    public Student findByEmail(String email) {
        return STUDENTS.stream()
                .filter(s -> email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }
    public void delete(String email) {
        var st = findByEmail(email);
        if (st != null) {
            STUDENTS.remove(st);

        }
    }
    public Student update (Student s) {
        var st = IntStream.range(0 , STUDENTS.size())
                .filter(index -> STUDENTS.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
if (st > -1) {
     STUDENTS.set(st , s);
    return s;
}
    return null;
    }


}
