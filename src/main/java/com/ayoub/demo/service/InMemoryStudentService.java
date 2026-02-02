package com.ayoub.demo.service;

import com.ayoub.demo.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;


import java.util.List;

@AllArgsConstructor
@Data
@Service
public class InMemoryStudentService implements StudentService {
    private InMemoryStudentDao dao;

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();
    }
    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public Student save(Student student) {
        return dao.save(student);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }
}
