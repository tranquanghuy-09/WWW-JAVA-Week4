package vn.edu.iuh.fit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.models.Candidate;

import javax.sql.DataSource;
import java.util.List;
@Component
public class CandidateDao extends AbstractDAO<Candidate, Long> {
    @Autowired
    public CandidateDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void insert(Candidate candidate) {
        String sql = "insert into cadidate value(?,?,?,?,?)";
        jdbcTemplate.update(sql, candidate.getIdCandidate(), candidate.getFullName()
        , candidate.getEmail(), candidate.getSoDienThoai(), candidate.getDiaChi());
    }

    @Override
    public void update(Candidate candidate) {

    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Candidate findById(Long aLong) {
        return null;
    }

    @Override
    public List<Candidate> findAll() {
        String sql = "select * from cadidate";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Candidate.class));
    }


}
