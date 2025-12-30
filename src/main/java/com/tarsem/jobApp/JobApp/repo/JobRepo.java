package com.tarsem.jobApp.JobApp.repo;

import com.tarsem.jobApp.JobApp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String keyword1, String keyword2);
}


//public List<JobPost> getAllJobs(){ return jobs;}
//
//public void addJobs(JobPost post){
//    jobs.add(post);
//    System.out.println(post);
//}
//
//public JobPost getJob(int postId) {
//    for(JobPost job:jobs){
//        if(job.getPostId()==postId){
//            return job;
//        }
//    }
//    return null;
//}
//
//public JobPost updateJob(JobPost jobPost) {
//    for(JobPost jobPost1: jobs){
//        if(jobPost1.getPostId()==jobPost.getPostId()){
//            jobPost1.setPostId(jobPost.getPostId());
//            jobPost1.setPostDesc(jobPost.getPostDesc());
//            jobPost1.setPostProfile(jobPost.getPostProfile());
//            jobPost1.setPostTechStack(jobPost.getPostTechStack());
//            jobPost1.setReqExp(jobPost.getReqExp());
//
//        }
//    }
//    jobs.add(jobPost);
//    System.out.println("Job Updated");
//    return jobPost;
//}
//
//public void deleteJob(int postId) {
//    jobs.removeIf(job -> job.getPostId() == postId);
//    System.out.println("Job "+postId+" deleted");
//}