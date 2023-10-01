package vn.edu.iuh.fit.models;

import org.springframework.data.annotation.Id;

public class Skill {
    @Id
    private long idSkill;
    private String name;
    private String description;

}
