package com.example.project.Project.Service;

import com.example.project.Project.Entity.Candidates;
import com.example.project.Project.Repository.CandidatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class CandidateService {



    @Autowired
    CandidatesRepository candidatesRepository;


public List<Candidates> getAllCandidates(int max)
{
     return candidatesRepository.findAllByCandidateIDIsLessThanEqual(max);

}

    public List<Candidates> getCandidateById(int candidateID) {

        return candidatesRepository.findById(candidateID);
    }

    public List<Candidates> findByStatus( String byStatus) {
        return candidatesRepository.findByStatus(byStatus);

    }

    public void saveOrUpdate(Candidates candidates) {

        candidatesRepository.save(candidates);
    }

    public void delete(int candidateID) {
        candidatesRepository.deleteById(candidateID);
    }

    public void update(Candidates candidates, int candidateID) {
        candidatesRepository.save(candidates);
    }
}



