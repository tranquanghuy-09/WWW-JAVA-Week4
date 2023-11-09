package vn.edu.iuh.fit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.edu.iuh.fit.dao.SkillDao;
import vn.edu.iuh.fit.models.Skill;

import java.util.Optional;

@SpringBootTest
public class SkillTests {
    @Autowired
    private SkillDao skillDao;

    @Test
    void insert(){
        Skill skill = new Skill(1l, "Backend", "create API");
        skillDao.insert(skill);
        Optional<Skill> skillOptional = skillDao.findById(1l);
        Assertions.assertTrue(skillOptional.isPresent());
    }
}
