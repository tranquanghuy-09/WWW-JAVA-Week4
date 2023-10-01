package vn.edu.iuh.fit.wwwjavaweek3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.edu.iuh.fit.dao.CandidateDao;
import vn.edu.iuh.fit.models.Candidate;

@SpringBootTest
class WwwJavaWeek3ApplicationTests {
    @Autowired
private CandidateDao candidateDao;
    @Test
    void contextLoads() {
        Candidate candidate = new Candidate(101l, "Huy", "Huydg@gmail.com", "dg", "dg");
//                candidateDao.insert(candidate);
        Assertions.assertEquals("Huydg@gmail.com",candidate.getEmail());
//        candidateDao.findAll().forEach(System.out::println);
    }

}
