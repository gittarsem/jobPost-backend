package com.tarsem.jobApp.JobApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Scope("prototype")
public class JobPost {

    @Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExp;
    private List<String> postTechStack;


}
