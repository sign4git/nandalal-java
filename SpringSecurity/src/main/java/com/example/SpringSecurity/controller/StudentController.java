package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(new Student(10,"wayne","forward"),
            new Student(7,"mount","attacking mid"),
            new Student(5,"maguire","defender")));

    @GetMapping("student")
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping("student")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        students.add(student);
        return new ResponseEntity<>(student,HttpStatus.CREATED);
    }


}
