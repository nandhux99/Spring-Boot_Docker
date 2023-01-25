package com.example.project.Project.Service;

import com.example.project.Project.Entity.Companies;
import com.example.project.Project.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {
    
    
@Autowired
 CompanyRepository comRepository;



public List<Companies>getAll(){
    {
        List <Companies> companies= new ArrayList<Companies>();
        comRepository.findAll().forEach(company  -> companies.add(company));
        return companies;
    }
}


public void saveOrUpdate(Companies company) {
    comRepository.save(company);
}
public void delete(int companyId)   
{  
comRepository.deleteById(companyId);  
}  

public void update(Companies company, int companyId)   
{  
comRepository.save(company);  
}  
    
}
