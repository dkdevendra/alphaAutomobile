package com.alphaautomobile.services;

import com.alphaautomobile.dto.AutomobileCustomerDetailDTO;

import java.util.List;

public interface AutomobileCustomerController {
    public  String addAllDetails(AutomobileCustomerDetailDTO automobileCustomerDetail);
    public List<AutomobileCustomerDetailDTO> getAllDetails();
    public  String updateservices(AutomobileCustomerDetailDTO automobileCustomerDetailDTO);

}
