package com.alphaautomobile.services.impl;

import com.alphaautomobile.dto.JobCardDTO;
import com.alphaautomobile.repository.JobCardRepository;
import com.alphaautomobile.services.JobCardHandler;
import com.alphaautomobilebeans.JobCard;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
@Log4j2
public class JobCardImpl implements JobCardHandler {
    private List<JobCard>JobCardList = new ArrayList<>();
    @Autowired
    JobCardRepository jobCardRepository;

    public String addJobCard(JobCardDTO jobCard){
        log.info("Adding job card {}", jobCard.toString());
        JobCard jobCard1 = new JobCard();
        jobCard1.setMake(jobCard.getMake());
        jobCard1.setModel(jobCard.getModel());
        jobCard1.setVehicleNumber(jobCard.getVehicleNumber());
        jobCard1.setService(jobCard.getServices());
        jobCard1.setDeliveryDate(jobCard.getDeliveryDate());
        jobCard1.setEstimatedCost(jobCard.getEstimatedCost());
        jobCard1.setContactNumber(jobCard.getContactNumber());
        jobCardRepository.save(jobCard1);
        log.info("Saving job card ...... {}",jobCard1);
        return "jobs card added successfully";
    }
    @Override
    public List<JobCardDTO>getAllJobCard() {
        System.out.println("get all jobs card");
        List<JobCardDTO> jobCardList = new ArrayList<>();
        List<JobCard> jobCardsList = jobCardRepository.getJobCardList();
        log.info("Job Card List ......... {}",jobCardsList);
        for (JobCard jobCard : jobCardsList) {
            JobCardDTO jobCardDTO = new JobCardDTO();
            jobCardDTO.setMake(jobCard.getMake());
            jobCardDTO.setModel(jobCard.getModel());
            jobCardDTO.setVehicleNumber(jobCard.getVehicleNumber());
            jobCardDTO.setServices(jobCard.getService());
            jobCardDTO.setDeliveryDate( jobCard.getDeliveryDate());
            jobCardDTO.setEstimatedCost(jobCard.getEstimatedCost());
            jobCardDTO.setContactNumber(jobCard.getContactNumber());
            jobCardList.add(jobCardDTO);
        }
        System.out.println("Return List of job card"+jobCardList.toString());
        return jobCardList;
    }
    @Override
    public String  updateJobCard(JobCardDTO jobCard){
        System.out.println("update job card value");
        Optional<JobCard>jobCard1 = jobCardRepository.getJobCard(jobCard.getJobCardId());
        JobCard jobCard2 = jobCard1.get();
        if(null!=jobCard.getMake())
            jobCard2.setMake(jobCard.getMake());
            jobCard2.setModel(jobCard.getModel());
            jobCard2.setVehicleNumber(jobCard.getVehicleNumber());
            jobCard2.setService(jobCard.getServices());
            jobCard2.setEstimatedCost(jobCard.getEstimatedCost());
            jobCard2.setDeliveryDate(jobCard.getDeliveryDate());
            jobCard2.setContactNumber(jobCard.getContactNumber());
            jobCardRepository.save(jobCard2);
        System.out.println("job card getting called value");
        return "job card update successfully";
    }
    @Override
    public String display(JobCardDTO jobCard) {
        return null;
    }

    public void display(){
        System.out.println("Display jobs cards");
        for (JobCard jobCard: JobCardList){
            System.out.println(jobCard.toString());
        }
    }
}
