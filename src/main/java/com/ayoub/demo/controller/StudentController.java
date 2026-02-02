package com.ayoub.demo.controller;


import com.ayoub.demo.entity.Student;
import com.ayoub.demo.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private StudentService studentService;

    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }
    @GetMapping("/{email}")
    public Student findByEmail (@PathVariable("email") String em) {return studentService.findByEmail(em);}

    @PostMapping("")
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }
    @PutMapping
    public Student update (@RequestBody Student s) {
        return studentService.update(s);
    }
    @DeleteMapping("/{email}")
    public void delete (@PathVariable("email") String em) {
        studentService.delete(em);
    }


}
