package com.tarsem.jobApp.JobApp.service;

import com.tarsem.jobApp.JobApp.model.JobPost;
import com.tarsem.jobApp.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepo jobRepo;

    public void addJobs(JobPost post){
        jobRepo.save(post);
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.findAll();
    }

    public JobPost getJob(int postId){
        return jobRepo.findById(postId).orElse(null);
    }

    public JobPost updateJob( JobPost jobPost) {
        return jobRepo.save(jobPost);
    }

    public void deleteJob(int postId) {
        jobRepo.deleteById(postId);
    }

    public List<JobPost> searchJob(String keyword){
        return jobRepo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }

    public void load(){
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(

                new JobPost(1,
                        "Backend Developer",
                        "Develop REST APIs using Spring Boot and handle database operations",
                        2,
                        Arrays.asList("Java", "Spring Boot", "MySQL", "Hibernate")
                ),

                new JobPost(2,
                        "Frontend Developer",
                        "Build responsive UI using Flutter and integrate with backend APIs",
                        1,
                        Arrays.asList("Flutter", "Dart", "REST API")
                ),

                new JobPost(3,
                        "Full Stack Developer",
                        "Work on both frontend and backend of web applications",
                        3,
                        Arrays.asList("Java", "Spring Boot", "React", "MongoDB")
                ),

                new JobPost(4,
                        "Machine Learning Engineer",
                        "Build ML models for prediction and data analysis",
                        2,
                        Arrays.asList("Python", "TensorFlow", "Pandas", "NumPy")
                )

        ));

        jobRepo.saveAll(jobs);
    }
}
