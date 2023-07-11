package com.alphaautomobile.services.impl;

import com.alphaautomobile.dto.AutomobileServiceDTO;
import com.alphaautomobile.repository.AutomobileServiseRepository;
import com.alphaautomobile.services.AutomobiloeServicesController;
import com.alphaautomobilebeans.AutomobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Component
public class
AutomobileSercicesImpl implements AutomobiloeServicesController {
    private List<AutomobileService> servicsList = new ArrayList<>();

    @Autowired
    AutomobileServiseRepository automobileServiseRepository;

    @Override
    public String addservices(AutomobileServiceDTO automobileService) {

        System.out.println("Add Services method is getting called ");

       // servicsList.add(automobileService);

        AutomobileService automobileService1 = new AutomobileService();
        automobileService1.setServiceName(automobileService.getServiceName());
        automobileService1.setServicsCost(automobileService.getServiceCost());
        automobileService1.setServiceDetails(automobileService.getServiceDetails());
        automobileService1.setServicePhoto(automobileService.getServicePhoto());

        automobileServiseRepository.save(automobileService1);
        System.out.println("Services added successfully");
        return "Services added successfully";
    }

    @Override
    public List<AutomobileServiceDTO> getAllServics() {
        System.out.println("Get all Services method getting called");
        List<AutomobileServiceDTO>servicesList = new ArrayList<>();

         List<AutomobileService> automobileServiceList = automobileServiseRepository.getAutomobileServicsList();
         for(AutomobileService automobileService: automobileServiceList){
             AutomobileServiceDTO automobileServiceDTO = new AutomobileServiceDTO();
             automobileServiceDTO.setServiceId(automobileService.getServiceId());
             automobileServiceDTO.setServiceCost(automobileService.getServicsCost());
             automobileServiceDTO.setServiceName(automobileService.getServiceName());
             automobileServiceDTO.setServiceDetails(automobileService.getServiceDetails());
             automobileServiceDTO.setServicePhoto(automobileService.getServicePhoto());
             servicesList.add(automobileServiceDTO);
         }
        System.out.println("Returning list of services ......................."+servicesList.toString());
         return servicesList;
    }
    @Override
    public String updateservices (AutomobileServiceDTO automobileService){
        System.out.println("update services geting called values");
        Optional<AutomobileService> automobileService1 = automobileServiseRepository.getAutomobileService(automobileService.getServiceId());

        AutomobileService automobileService2 = automobileService1.get();
        if(null != automobileService.getServiceName())
        automobileService2.setServiceName(automobileService.getServiceName());
        if(null != automobileService.getServiceDetails())
        automobileService2.setServiceDetails(automobileService.getServiceDetails());
        if(0 != automobileService.getServiceCost())
        automobileService2.setServicsCost(automobileService.getServiceCost());
        if(null != automobileService.getServicePhoto())

        automobileService2.setServicePhoto(automobileService.getServicePhoto());
        automobileServiseRepository.save(automobileService2);
        System.out.println("update services geting called values");
        return "Services update successfully ";
    }
    public void displayServices(){
        System.out.println("Displaying Services.... ");
        for (AutomobileService automobileService : servicsList) {
            System.out.println(automobileService.toString());
        }
    }
}
