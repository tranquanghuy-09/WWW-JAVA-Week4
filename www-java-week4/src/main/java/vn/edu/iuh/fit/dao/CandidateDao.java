package vn.edu.iuh.fit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.models.Candidate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

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
    public Optional<Candidate> findById(Long aLong) {
        String sql = "select * from cadidate where can_id = ?";
        List<Candidate> candidates = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Candidate.class), aLong);

        if (candidates.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(candidates.get(0));
        }
    }

    @Override
    public List<Candidate> findAll() {
        String sql = "select * from cadidate";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Candidate.class));
    }


}
