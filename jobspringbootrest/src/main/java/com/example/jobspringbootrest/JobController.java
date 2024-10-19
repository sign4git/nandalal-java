package com.example.jobspringbootrest;


import com.example.jobspringbootrest.model.JobPost;
import com.example.jobspringbootrest.service.JobService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class JobController {

	@Autowired
	JobService jobService;

	@GetMapping("/jobposts")
	public List<JobPost>  viewAllJobs() {
        return jobService.getAllJobs();
	}

	@GetMapping("/jobpost/{postId}")
	public JobPost  getJobById(@PathVariable("postId") int postId) {
		return jobService.findById(postId);
	}

	@PostMapping("/jobpost")
	public JobPost addJobPost(@RequestBody JobPost jobPost){
		jobService.addJob(jobPost);
		return jobService.findById(jobPost.getPostId());
	}

	@PutMapping("/jobpost/{postId}")
	public JobPost updateJobPost(@RequestBody JobPost jobPost
					,@PathVariable("postId") int postId){
		return jobService.updateJob(jobPost,postId);
	}

	@DeleteMapping("/jobpost/{postId}")
	public void deleteJobPost(@PathVariable("postId") int postId){
		jobService.deleteJob(postId);
	}


}
