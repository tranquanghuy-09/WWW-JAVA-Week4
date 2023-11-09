package vn.edu.iuh.fit.models;

import org.springframework.data.annotation.Id;

public class Skill {
    @Id
    private long idSkill;
    private String name;
    private String description;

    public Skill() {
    }

    public Skill(long idSkill, String name, String description) {
        this.idSkill = idSkill;
        this.name = name;
        this.description = description;
    }

    public long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(long idSkill) {
        this.idSkill = idSkill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
