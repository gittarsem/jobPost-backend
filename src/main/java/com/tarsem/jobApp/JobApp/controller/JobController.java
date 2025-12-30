package com.tarsem.jobApp.JobApp.controller;

import com.tarsem.jobApp.JobApp.model.JobPost;
import com.tarsem.jobApp.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

    @Autowired
    public JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost jobPost(@PathVariable int postId){
        return service.getJob(postId);
    }

    @PostMapping("addJob")
    public int addJob(@RequestBody JobPost jobPost){
        service.addJobs(jobPost);
        return jobPost.getPostId();
    }

    @PutMapping("updateJob")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        return service.updateJob(jobPost);
    }

    @DeleteMapping("delete/{postId}")
    public void deleteJob(@PathVariable int postId){
        service.deleteJob(postId);
    }

    @PostMapping("load")
    public void loadData(){
        service.load();
    }

    @GetMapping("search/{keyword}")
    public List<JobPost> searchJob(@PathVariable(value = "keyword") String keyword){
        return service.searchJob(keyword);
    }
}
