package com.example.SpringBootWebJob.service;

import com.example.SpringBootWebJob.model.JobPost;
import com.example.SpringBootWebJob.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    public List<JobPost> getAllJobs(){
        return jobRepository.findAll();
    }

    public JobPost addJob(JobPost jobPost){
        return jobRepository.add(jobPost);
    }
}
