package com.example.project.Project;


import com.example.project.Project.Entity.Companies;
import com.example.project.Project.Repository.CompanyRepository;

import junit.framework.Assert;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


@DataJpaTest
public class CompanyTest {




    @Autowired
    CompanyRepository companyRepository;



    @Test
    public Companies testCreateCompany(){
    Companies companies = new Companies(1,1,200000,true,"Nandhu","123456","SDTECH","www.Sdtech.com");
    Companies saveProduct = companyRepository.save(companies);

Assert.assertNotNull(companies);
        return companies;
    }
     @Test
    public  void testGetCompanies(){
        List<Companies> list = (List<Companies>) companyRepository.findAll();
         assertThat(list).size().isGreaterThan(0);
     }

     @Test
    public void testDeleteCompany(){
        Companies companies= testCreateCompany();
        companyRepository.save(companies);
        companyRepository.deleteById(companies.getCompanyId());
        List<Companies> companies1= new ArrayList<>();
        companyRepository.findAll().forEach(comp-> companies1.add(comp) );
        Assert.assertEquals(companies1.size(),0);
     }
}
