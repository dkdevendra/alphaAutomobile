package com.alphaautomobile.api;

import com.alphaautomobile.dto.AutomobileCustomerDetailDTO;
import com.alphaautomobile.services.AutomobileCustomerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class AutomobileCustomerDetailController {
    @Autowired
    AutomobileCustomerController customerDetail;

    @GetMapping("all-Customer-detail")

    public List<AutomobileCustomerDetailDTO> getAllDetails(){
        return customerDetail.getAllDetails();
    }
    @PostMapping("add-customer")
    public String addCustomerDetail(@RequestBody AutomobileCustomerDetailDTO automobileCustomerDetailDTO){
        return customerDetail.addAllDetails(automobileCustomerDetailDTO);
    }

}
