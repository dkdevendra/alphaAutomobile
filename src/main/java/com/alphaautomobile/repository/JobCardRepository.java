package com.alphaautomobile.repository;

import com.alphaautomobilebeans.JobCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface JobCardRepository extends JpaRepository<JobCard,Integer> {
    @Query(nativeQuery = true , value = "select * from job_card")
    List<JobCard>getJobCardList();
    @Query(nativeQuery = true,value = "Select * from  where jobCard-id")
    Optional<JobCard>getJobCard(@Param("jobCardId")int jobCardId);

}
