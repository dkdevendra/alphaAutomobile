package com.alphaautomobile.services.impl;

import com.alphaautomobile.dto.AutomobileCustomerDetailDTO;
import com.alphaautomobile.repository.AutomobileCustomerRepository;
import com.alphaautomobile.services.AutomobileCustomerController;
import com.alphaautomobilebeans.AutomobileCustomerdetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class AutomobileCustomerImpl implements AutomobileCustomerController {
    private List<AutomobileCustomerdetail> customerDetailList = new ArrayList<>();
    @Autowired
    AutomobileCustomerRepository automobileCustomerRepository;

    @Override
    public String addAllDetails(AutomobileCustomerDetailDTO automobileCustomerDetail) {
        System.out.println("get all customer details");
        AutomobileCustomerdetail automobileCustomerDetail1 = new AutomobileCustomerdetail();
        automobileCustomerDetail1.setCustomerName(automobileCustomerDetail.getCustomerName());
        automobileCustomerDetail1.setCustomerAddres(automobileCustomerDetail.getCustomerAddress());
        automobileCustomerDetail1.setCustomerMobileNumber(automobileCustomerDetail.getCustomerMobileNumber());
        System.out.println(automobileCustomerDetail1.toString());
        automobileCustomerRepository.save(automobileCustomerDetail1);
        System.out.println("add detail successfully");
        return "add detail successfully";
    }


    @Autowired
    public List<AutomobileCustomerDetailDTO> getAllDetails() {
        System.out.println("get all customerDetail");
        List<AutomobileCustomerDetailDTO> customerDetailList = new ArrayList<>();
        List<AutomobileCustomerdetail> automobileCustomerdetailsList = automobileCustomerRepository.getAllDetails();
        for (AutomobileCustomerdetail automobileCustomerdetail : automobileCustomerdetailsList) {
            AutomobileCustomerDetailDTO automobileCustomerDetailDTO = new AutomobileCustomerDetailDTO();
            automobileCustomerDetailDTO.setCustomerName(automobileCustomerdetail.getCustomerName());
            automobileCustomerDetailDTO.setCustomerAddress(automobileCustomerdetail.getCustomerAddres());
            automobileCustomerDetailDTO.setCustomerMobileNumber(automobileCustomerdetail.getCustomerMobileNumber());
            customerDetailList.add(automobileCustomerDetailDTO);
        }
        System.out.println("Retren all customerDetail.."+customerDetailList.toString());
        return customerDetailList;
    }

    @Override
    public String updateservices(AutomobileCustomerDetailDTO automobileCustomerDetailDTO) {
        return null;
    }

    public void DisplayCustomerDetailList(){
        System.out.println("display customer detail");
        for (AutomobileCustomerdetail automobileCustomerdetail :customerDetailList){
            System.out.println(automobileCustomerdetail.toString());
        }

    }
}
