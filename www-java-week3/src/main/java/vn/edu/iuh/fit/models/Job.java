package vn.edu.iuh.fit.models;


import org.springframework.data.annotation.Id;

public class Job {
    @Id
    private long idJob;
    private String title;
    private String description;
    private String location;

}
