package com.example.project.Project.Controller;

import com.example.project.Project.Entity.Candidates;
import com.example.project.Project.Entity.Companies;
import com.example.project.Project.Entity.Vacancies;
import com.example.project.Project.Repository.CandidatesRepository;
import com.example.project.Project.Service.CandidateService;
import com.example.project.Project.Service.CompanyService;
import com.example.project.Project.Service.VacanciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/swagger")
public class Controller {
private int max;
@Autowired
CompanyService comService;

@Autowired 
CandidateService candidateService;

@Autowired 
VacanciesService vacanciesService;

@Autowired
    CandidatesRepository candidatesRepository;

	@GetMapping("/companies")
	private List<Companies> getAll()   
	{  
	return comService.getAll();  
	}  
	
	@PostMapping("/companies")  
    private String add(@RequestBody Companies company)   
    {  
    comService.saveOrUpdate(company);  
    return "Added Successfully";
    }  
	
	@DeleteMapping("/companies/{companyId}")  
    private String delete(@PathVariable  int companyId )   
    {  
    comService.delete(companyId);
    
    return "Deleted Successfully";
    } 


	@GetMapping("/candidates")
    public List<Candidates> getAllCandidates(@RequestParam int max) {
    return   candidateService.getAllCandidates(max);
   }
	@GetMapping("/candidates/{candidateID}")
	public List<Candidates> getCandidateById(@PathVariable int candidateID) {
        return candidateService.getCandidateById(candidateID);
	}


	@GetMapping("/candidates/findByStatus")
	public List<Candidates> getCandidateByStatus(@RequestParam String byStatus){
	    return  candidateService.findByStatus(byStatus);
   }

    @PostMapping("/candidates")  
    private String add(@RequestBody Candidates candidates)   
    {
    candidateService.saveOrUpdate(candidates);  
    return "Added Successfully";
    }  
    
    @PutMapping("/candidates/{candidateID}")
    private String update(@RequestBody Candidates candidates)   
    {  
        candidateService.saveOrUpdate(candidates);  
    return "Updated Successfully";
    }  
    @DeleteMapping("/candidates/{candidateID}")  
    private String deleteCandidates(@PathVariable  int candidateID )   
    {  
        candidateService.delete(candidateID);
    
    return "Deleted Successfully";
    } 
    /////////////////
    @GetMapping("/vacancies")  
    private List<Vacancies> getAllVacancies()   
    {  
    return vacanciesService.getAllVacancies();  
    }  
    
    @PostMapping("/vacancies")  
    private String add(@RequestBody Vacancies vacancies)   
    {  
    vacanciesService.saveOrUpdate(vacancies);  
    return "Added Successfully";
    }  
    @PutMapping("/vacancies/{vacancyId}")
    private String update(@RequestBody Vacancies vacancies) {
        vacanciesService.saveOrUpdate(vacancies);
        return "Updated Successfully";
    }
    @DeleteMapping("/vacancies/{vacancyId}")  
    private String deleteVacancies(@PathVariable  int vacancyId )   
    {  
    vacanciesService.delete(vacancyId);
    
    return "Deleted Successfully";
    } 
    
}