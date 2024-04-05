package com.alphaautomobile.api;

import com.alphaautomobile.dto.AutomobilePartsDTO;
import com.alphaautomobile.dto.JobCardDTO;
import com.alphaautomobile.services.impl.JobCardImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
@Slf4j
public class JobCardController {
    @Autowired
    JobCardImpl jobCard;

    @GetMapping("job-card")
    public List<JobCardDTO>geAllJobCard(){
        return jobCard.getAllJobCard();
    }
    @PostMapping(value ="add-job-card",consumes = {"application/json","text/plain"})
    public String addJobCard(@RequestBody JobCardDTO jobCardDTO){
        log.info("Add job card controller {}", jobCardDTO);
        return jobCard.addJobCard(jobCardDTO);
    }
    @PutMapping("update-job-card")
    public String updateJobCard(@RequestBody JobCardDTO jobCardDTO){
        System.out.println("update job card being called"+jobCard.toString());
        return jobCard.updateJobCard(jobCardDTO);
    }
}
