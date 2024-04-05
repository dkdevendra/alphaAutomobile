package com.alphaautomobile.services;

import com.alphaautomobile.dto.JobCardDTO;

import java.util.List;

public interface JobCardHandler {
    public  String addJobCard(JobCardDTO jobCard);
    public List<JobCardDTO> getAllJobCard();
    public  String updateJobCard(JobCardDTO jobCardDTO);
    public String display(JobCardDTO jobCard);
}
