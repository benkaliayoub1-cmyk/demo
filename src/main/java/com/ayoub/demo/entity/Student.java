package com.ayoub.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private String firstname;
    private String lastname;
    private LocalDate dateBirth;
    private String email;
    private int age;
}
