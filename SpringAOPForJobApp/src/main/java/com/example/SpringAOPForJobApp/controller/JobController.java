package com.example.SpringAOPForJobApp.controller;


import com.example.SpringAOPForJobApp.model.JobPost;
import com.example.SpringAOPForJobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping("/jobposts")
    public List<JobPost> viewAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/jobpost/{postId}")
    public JobPost getJobById(@PathVariable("postId") int postId) {
        return jobService.findById(postId);
    }

    @PostMapping("/jobpost")
    public JobPost addJobPost(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
        return jobService.findById(jobPost.getPostId());
    }

    @PutMapping("/jobpost/{postId}")
    public JobPost updateJobPost(@RequestBody JobPost jobPost, @PathVariable("postId") int postId) {
        return jobService.updateJob(jobPost, postId);
    }

    @DeleteMapping("/jobpost/{postId}")
    public void deleteJobPost(@PathVariable("postId") int postId) {
        jobService.deleteJob(postId);
    }

    @GetMapping("/jobpost/load")
    public List<JobPost> loadJobPosts() {
        return jobService.load();
    }

    @GetMapping("jobpost/keyword/{keyword}")
    public List<JobPost> searchJobPostsByKeyword(@PathVariable("keyword") String keyword) {
        return jobService.searchJobPostsByKeyword(keyword);
    }


}
