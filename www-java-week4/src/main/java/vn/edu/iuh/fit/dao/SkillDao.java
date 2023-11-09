package vn.edu.iuh.fit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.models.Job;
import vn.edu.iuh.fit.models.Skill;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Component
public class SkillDao extends AbstractDAO<Skill, Long>{
    @Autowired
    public SkillDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void insert(Skill skill) {
        String sql = "insert into skill value(?,?,?)";
        jdbcTemplate.update(sql, skill.getIdSkill(), skill.getName(), skill.getDescription());
    }

    @Override
    public void update(Skill skill) {

    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Optional<Skill> findById(Long aLong) {
        String sql = "select * from skill where skill_id = ?";
        List<Skill> skills = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Skill.class), aLong);

        if (skills.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(skills.get(0));
        }
    }

    @Override
    public List<Skill> findAll() {
        return null;
    }
}
