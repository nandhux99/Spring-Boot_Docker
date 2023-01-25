package com.example.project.Project.Entity;


import javax.persistence.*;


@Entity
@Table(name = "companies")
public class Companies {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name="companyId")
    public int companyId;
    
    public int getCompanyId() {
        return companyId;
    }
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
    public int getCompanySize() {
        return companySize;
    }
    public void setCompanySize(int companySize) {
        this.companySize = companySize;
    }
    public int getRevenue() {
        return revenue;
    }
    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }
    public boolean isAdmin() {
        return isAdmin;
    }
    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public Companies() {
        super();
        
    }
    public Companies(int companyId, int companySize, int revenue, boolean isAdmin, String userName, String password,
            String companyName, String website) {
        super();
        this.companyId = companyId;
        this.companySize = companySize;
        this.revenue = revenue;
        this.isAdmin = isAdmin;
        this.userName = userName;
        this.password = password;
        this.companyName = companyName;
        this.website = website;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    @Column(name="companySize")
    public int companySize;
    
    @Column(name="revenue")
    public int revenue;
    
    @Column(name="isAdmin")
    public boolean isAdmin;
    
    @Column(name="userName")
    public String userName;
    
    @Column(name="password")
    public String password;
    
    @Column(name="companyName")
    public String companyName;
    
    @Column(name="website")
    public String website;
    
    


   @Override
    public String toString() {
       return "Companies [companyId=" + companyId + ", name=" + companyName + ", companysize=" + companySize +", revenue=" +revenue+", userName="+userName+", password="+password+", isAdmin="+isAdmin+", website="+website+"]";  }

     

}
