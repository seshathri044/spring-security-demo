package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudetnConroller {
    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Seshathri","Spring boot"),
                    new Student(2,"vasanth","C++")
            )
    );
    @GetMapping("/students")
    public List<Student> getStudent(){
      return students;
    }
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }
}
