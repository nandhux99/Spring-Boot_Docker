package com.example.project.Project.Entity;

import javax.persistence.*;

@Entity
@Table(name="Candidates")
public class Candidates {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="candidateID")
    private int candidateID;

    public int getCandidateID(int max)
    {
        return candidateID;
    }

    public Candidates(int candidateID, int companyID, String name, long contact_num, String email, long aadhar_num,
            String byStatus) {

        super();
        this.candidateID = candidateID;
        this.companyID = companyID;
        this.name = name;
        this.contact_num = contact_num;
        this.email = email;
        this.aadhar_num = aadhar_num;
        this.byStatus = byStatus;
    }
    public Candidates() {
        super();

    }
    public void setCandidateID(int candidateID) {
        this.candidateID = candidateID;
    }
    public int getCompanyID() {
        return companyID;
    }
    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getContact_num() {
        return contact_num;
    }
    public void setContact_num(long contact_num) {
        this.contact_num = contact_num;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getAadhar_num() {
        return aadhar_num;
    }
    public void setAadhar_num(long aadhar_num) {
        this.aadhar_num = aadhar_num;
    }
    public String getStatus(String byStatus) {
        return byStatus;
    }
    public void setStatus(String byStatus) {
        this.byStatus = byStatus;
    }
    @Column(name="companyID")
    private int companyID;
    @Column(name="name")
    private String name;
    @Column(name="contact_num")
    private long contact_num;
    @Column(name="email")
    private String email;
    @Column(name="aadhar_num")
    private long aadhar_num;
    @Column(name="status")
    private String byStatus;

    @Override
    public String toString() {
        return "Candidates [candidateID=" + candidateID + ", companyID=" + companyID + ", name=" + name
                + ", contact_num=" + contact_num + ", email=" + email + ", aadhar_num=" + aadhar_num + ", status="
                + byStatus + "]";
    }
}
