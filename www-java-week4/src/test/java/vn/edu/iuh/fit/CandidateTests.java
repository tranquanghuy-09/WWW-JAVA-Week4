package vn.edu.iuh.fit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.edu.iuh.fit.dao.CandidateDao;
import vn.edu.iuh.fit.models.Candidate;

import java.util.Optional;

@SpringBootTest
public class CandidateTests {
    @Autowired
    private CandidateDao candidateDao;

    @Test
    void insert(){
        Candidate candidate = new Candidate(1l, "Tran Quang Huy", "tranguanghuyit09@gmail.com", "0357391270", "115 Le Van Sy");
        candidateDao.insert(candidate);
        Optional<Candidate> candidateOptional = candidateDao.findById(1l);
        Assertions.assertTrue(candidateOptional.isPresent());
    }
}
