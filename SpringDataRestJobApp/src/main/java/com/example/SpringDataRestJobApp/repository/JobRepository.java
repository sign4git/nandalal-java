package com.example.SpringDataRestJobApp.repository;


import com.example.SpringDataRestJobApp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {

}
