package com.example.DockerStudent.controller;

import com.example.DockerStudent.model.Student;
import com.example.DockerStudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/getStudents")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/loadStudents")
    public void loadStudents(){
        Student newStudent = new Student();
        newStudent.setName("newStudent");
        newStudent.setMarks(10);
        studentRepository.save(newStudent);
    }
}
