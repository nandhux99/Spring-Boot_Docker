package com.example.project.Project.Repository;

import com.example.project.Project.Entity.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidatesRepository extends JpaRepository<Candidates, Integer> {


 @Query(value = "SELECT * FROM CANDIDATES WHERE STATUS = '1'", nativeQuery = true)
public  List<Candidates> findByStatus(String byStatus);



 List<Candidates> findById(int candidateID);


 @Query(value= "SELECT * FROM CANDIDATES WHERE CANDIDATEID = '?1'" ,nativeQuery = true)
 public List<Candidates> findAllByCandidateIDIsLessThanEqual(int max);

}
