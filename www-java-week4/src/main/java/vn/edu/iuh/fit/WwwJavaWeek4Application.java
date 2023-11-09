package vn.edu.iuh.fit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.dao.CandidateDao;

@SpringBootApplication
public class WwwJavaWeek4Application {
//    private DataSource dataSource;
//    protected JdbcTemplate jdbcTemplate;
    @Autowired
    private CandidateDao candidateDao;
    public static void main(String[] args) {
//        SpringApplication.run(WwwJavaWeek3Application.class, args);
        SpringApplication.run(SpringApplication.run(WwwJavaWeek4Application.class, args).getClass());
    }
    @Bean
    CommandLineRunner test01(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                candidateDao.findAll().forEach(System.out::println);
            }
        };
    }
}
