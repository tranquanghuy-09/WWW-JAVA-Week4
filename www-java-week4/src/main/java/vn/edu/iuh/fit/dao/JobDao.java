package vn.edu.iuh.fit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.models.Job;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Component
public class JobDao extends AbstractDAO<Job, Long>{
    @Autowired
    public JobDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void insert(Job job) {
        String sql = "insert into job value(?,?,?,?)";
        jdbcTemplate.update(sql, job.getIdJob(), job.getTitle(), job.getDescription(), job.getLocation());
    }

    @Override
    public void update(Job job) {

    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Optional<Job> findById(Long aLong) {
        String sql = "select * from job where job_id = ?";
        List<Job> jobs = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Job.class), aLong);

        if (jobs.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(jobs.get(0));
        }
    }

    @Override
    public List<Job> findAll() {
        return null;
    }


}
