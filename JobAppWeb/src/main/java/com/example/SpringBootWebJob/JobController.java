package com.example.SpringBootWebJob;

import com.example.SpringBootWebJob.model.JobPost;
import com.example.SpringBootWebJob.service.JobService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

	@Autowired
	JobService jobService;

	@GetMapping({"/","/home"})
	public String home() {
		return "home";
	}

	@GetMapping("/addjob")
	public String addJob(JobPost jobPost) {
		return "addjob";
	}
	@GetMapping("/viewalljobs")
	public String viewAllJobs(Model model) {
		List<JobPost> allJobs = jobService.getAllJobs();
		model.addAttribute("jobPosts",allJobs);
		return "viewalljobs";
	}

	@PostMapping("/handleForm")
	public String handleForm(JobPost jobPost, Model model){
		jobService.addJob(jobPost);
		model.addAttribute("jobPost",jobPost);
		return "success";
	}

}
