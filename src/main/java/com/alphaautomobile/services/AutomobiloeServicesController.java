package com.alphaautomobile.services;

import com.alphaautomobile.dto.AutomobileServiceDTO;
import com.alphaautomobilebeans.AutomobileService;

import java.util.List;

public interface AutomobiloeServicesController {
    public  String addservices(AutomobileServiceDTO automobileService);
    public List<AutomobileServiceDTO> getAllServics();
    public  String updateservices(AutomobileServiceDTO automobileServiceDTO);
}
