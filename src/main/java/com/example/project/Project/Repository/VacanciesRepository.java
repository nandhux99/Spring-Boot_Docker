package com.example.project.Project.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Project.Entity.Vacancies;
@Repository
public interface VacanciesRepository extends CrudRepository<Vacancies, Integer>{

}
