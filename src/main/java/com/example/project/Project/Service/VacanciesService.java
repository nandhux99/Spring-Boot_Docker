package com.example.project.Project.Service;

import com.example.project.Project.Entity.Vacancies;
import com.example.project.Project.Repository.VacanciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class VacanciesService {

    @Autowired VacanciesRepository vacanciesRepository;
    
    
    public List<Vacancies>getAllVacancies(){
        {
            List <Vacancies> vacancies= new ArrayList<Vacancies>();
            vacanciesRepository.findAll().forEach(vacancy  -> vacancies.add(vacancy));
            return vacancies;
        }
    }

    public void saveOrUpdate(Vacancies vacancies) {
        vacanciesRepository.save(vacancies);
    }
    public void delete(int vacancyID )   
    {  
    vacanciesRepository.deleteById(vacancyID);  
    }  

    public void update(Vacancies vacancies, int vacancyID )   
    {  
    vacanciesRepository.save(vacancies);  
    }  
        
    
    
    
}
