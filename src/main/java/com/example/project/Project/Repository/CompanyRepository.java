package com.example.project.Project.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Project.Entity.Companies;

@Repository

public interface CompanyRepository extends CrudRepository<Companies,Integer>{

    }
    
    

