package com.example.project.Project.Entity;

import javax.persistence.*;

@Entity
@Table(name="Vacancies")
public class Vacancies {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="vacancyID")
    private int vacancyID;
    @Column(name="companyID")
    private int companyID;
    public int getVacancyID() {
        return vacancyID;
    }
    public void setVacancyID(int vacancyID) {
        this.vacancyID = vacancyID;
    }
    public int getCompanyID() {
        return companyID;
    }
    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }
    public String getJob_title() {
        return job_title;
    }
    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getOpenings() {
        return openings;
    }
    public void setOpenings(String openings) {
        this.openings = openings;
    }
    @Column(name="job_title")
    private String job_title;
    
    @Column(name="level")
    private String level;
    
    @Column(name="openings")
    private String openings;
    public Vacancies(int vacancyID, int companyID, String job_title, String level, String openings) {
        super();
        this.vacancyID = vacancyID;
        this.companyID = companyID;
        this.job_title = job_title;
        this.level = level;
        this.openings = openings;
    }
    public Vacancies() {
        super();
        
    }
    
    @Override
    public String toString() {
        return "Vacancies [vacancyID=" + vacancyID + ", companyID=" + companyID + ", job_title=" + job_title
                + ", level=" + level + ", openings=" + openings + "]";
    }
    
}
