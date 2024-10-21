package com.example.SpringDataJpa.repository;

import com.example.SpringDataJpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query
    List<Student> findByName(String name);

    @Query
    List<Student> findByMarksGreaterThan(int marks);
}
