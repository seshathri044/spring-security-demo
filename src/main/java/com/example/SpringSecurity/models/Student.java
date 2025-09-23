package com.example.SpringSecurity.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private int rno;
    private String name;
    private String technology;


    public Student(int rno, String name, String technology) {
        this.rno = rno;
        this.name = name;
        this.technology = technology;
    }
}

