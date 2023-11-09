package vn.edu.iuh.fit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.edu.iuh.fit.dao.JobDao;
import vn.edu.iuh.fit.models.Job;

import java.util.Optional;

@SpringBootTest
public class JobTests {
    @Autowired
    private JobDao jobDao;

    @Test
    void insert(){
        Job job = new Job(1l, "FullStack Developer", "web developer", "Quan 2");
        jobDao.insert(job);
        Optional<Job> optionalJob = jobDao.findById(1l);
        Assertions.assertTrue(optionalJob.isPresent());
    }
}
