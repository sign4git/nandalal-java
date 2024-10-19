package com.example.jobspringbootrest.service;


import com.example.jobspringbootrest.model.JobPost;
import com.example.jobspringbootrest.repository.JobRepository;
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

    public JobPost findById(int postId) {
        return jobRepository.findById(postId);
    }

    public JobPost updateJob(JobPost jobPost, int postId) {
        return jobRepository.updateJob(jobPost, postId);
    }

    public void deleteJob(int postId) {
        jobRepository.deleteJob(postId);
    }
}
