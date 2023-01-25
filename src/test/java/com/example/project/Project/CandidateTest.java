package com.example.project.Project;

import com.example.project.Project.Entity.Candidates;
import com.example.project.Project.Repository.CandidatesRepository;
import com.example.project.Project.Service.CandidateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertNotNull;

@DataJpaTest
@SpringBootTest
public class CandidateTest {
    @Autowired
    CandidateService candidateService;

    @Autowired
    CandidatesRepository candidatesRepository;

    @Test
    public Candidates testCreateCandidate(){

        Candidates candidates= new Candidates(1,1,"Nandhu",62718216,"Nandhu@Sdtech",983882923,"Active");
        Candidates save= candidatesRepository.save(candidates);
        assertNotNull(save);

        return candidates;
    }
//     @Test
//     public void testGetCandidates(){
//         List<Candidates> candidates=  candidatesRepository.findAll();
//         assertThat(candidates).size().isGreaterThan(0);
//     }
//     @Test
//    public void testUpdateCandidates(){
//        Candidates candidates=  candidatesRepository.findById(1).get();
//        candidates.setStatus("NotActive");
//        candidatesRepository.save(candidates);
//        assertNotEquals("Active",candidatesRepository.findById(1).get().getStatus());
//
//     }
//     @Test
//    public void testDeleteCandidate(){
//         candidatesRepository.deleteById(1);
//         assertThat(candidatesRepository.existsById(1)).isFalse();
//     }
}
