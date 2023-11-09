package vn.edu.iuh.fit.models;


import org.springframework.data.annotation.Id;

public class Job {
    @Id
    private long idJob;
    private String title;
    private String description;
    private String location;

    public Job() {
    }

    public Job(long idJob, String title, String description, String location) {
        this.idJob = idJob;
        this.title = title;
        this.description = description;
        this.location = location;
    }

    public long getIdJob() {
        return idJob;
    }

    public void setIdJob(long idJob) {
        this.idJob = idJob;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
