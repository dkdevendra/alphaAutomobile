package com.alphaautomobile.services.impl;

import com.alphaautomobile.dto.AutomobilePartsDTO;
import com.alphaautomobile.repository.AutomobilePartRepository;
import com.alphaautomobile.services.AutomobilePartsController;
import com.alphaautomobilebeans.AutomobileParts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AutomobilePartsImpl implements AutomobilePartsController {
    private List<AutomobileParts> partList = new ArrayList<>();
    @Autowired
    AutomobilePartRepository automobilePartRepository;

    @Override
    public String Addparts(AutomobilePartsDTO automobileParts) {
        System.out.println("ADD all part successfully");

        AutomobileParts automobileParts1 = new AutomobileParts();
        automobileParts1.setPartName(automobileParts.getPartName());
        automobileParts1.setPartDescription(automobileParts.getDescription());
        automobileParts1.setPartPrice(automobileParts.getPartPrice());
        automobileParts1.setPartType(automobileParts.getPartType());
        automobileParts1.setPartAvailable(automobileParts.getPartAvailable());
        automobileParts1.setServiceRepairPart(automobileParts.getServiceRepairPart());
        automobileParts1.setPartCount(automobileParts.getPartCount());
        automobileParts1.setUpdatingDate(automobileParts.getUpdatingDate());
        System.out.println("-------------- automobileParts1-----------------");
        System.out.println(automobileParts1.toString());
        automobilePartRepository.save(automobileParts1);
        System.out.println("add part successfully");
        return "Part added successfully";
    }
//    public  String Searchparts(AutomobilePartsDTO automobilePartsDTO){
//
//    }

    @Override
    public List<AutomobilePartsDTO> getAllParts() {
        System.out.println("Get all Services method getting called");
        List<AutomobilePartsDTO>partsList = new ArrayList<>();
        List<AutomobileParts> automobilePartsList = automobilePartRepository.getAutomobilePartsList();
        for(AutomobileParts automobileParts: automobilePartsList){
            AutomobilePartsDTO automobilePartsDTO = new AutomobilePartsDTO();
            automobilePartsDTO.setInventoryId(automobileParts.getInventoryId());
            automobilePartsDTO.setPartName(automobileParts.getPartName());
            automobilePartsDTO.setDescription(automobileParts.getPartDescription());
            automobilePartsDTO.setPartPrice(automobileParts.getPartPrice());
            automobilePartsDTO.setPartType(automobileParts.getPartType());
            automobilePartsDTO.setPartAvailable(automobileParts.getPartAvailable());
            automobilePartsDTO.setPartCount(automobileParts.getPartCount());
            automobilePartsDTO.setServiceRepairPart(automobileParts.getServiceRepairPart());
            automobilePartsDTO.setUpdatingDate(automobileParts.getUpdatingDate());
            if(null != automobileParts.getPartAvailable() && automobileParts.getPartAvailable().equalsIgnoreCase("yes"));{
                partsList.add(automobilePartsDTO);

            }
        }
        System.out.println("Returning list of services ......................."+partsList.toString());
        return partsList;
    }
//    @Override
//    public List<AutomobileParts>getSearchName() {
//        System.out.println("get all search name");
//        List<AutomobileParts>partsNameList = new ArrayList<>();
//        List<AutomobileParts> automobilePartsList = automobilePartRepository.getAutomobilePartsList();
//        for(AutomobileParts automobileParts: automobilePartsList){
//            AutomobilePartsDTO automobilePartsDTO = new AutomobilePartsDTO();
//            automobilePartsDTO.setInventoryId(automobileParts.getInventoryId());
//            automobilePartsDTO.setPartName(automobileParts.getPartName());
//            automobilePartsDTO.setDescription(automobileParts.getPartDescription());
//            automobilePartsDTO.setPartPrice(automobileParts.getPartPrice());
//            automobilePartsDTO.setPartType(automobileParts.getPartType());
//            automobilePartsDTO.setPartAvailable(automobileParts.getPartAvailable());
//            automobilePartsDTO.setPartCount(automobileParts.getPartCount());
//            automobilePartsDTO.setServiceRepairPart(automobileParts.getServiceRepairPart());
//            automobilePartsDTO.setUpdatingDate(automobileParts.getUpdatingDate());
//
//            partsNameList.add(automobileParts);
//        }
//        System.out.println("Returning list of part Name" +
//                " ......................."+partsNameList.toString());
//        return  partsNameList;
//    }
    @Override
    public String updateparts(AutomobilePartsDTO automobileParts) {

        Optional<AutomobileParts> optionalAutomobileParts = automobilePartRepository.findById(252);
        AutomobileParts automobileParts1 = optionalAutomobileParts.get();
        automobileParts1.setPartName("library");
        AutomobileParts result = automobilePartRepository.save(automobileParts1);
        System.out.println(result);

        System.out.println("update services geting called values");
//        Optional<AutomobileParts> automobileParts1 = automobilePartRepository.getAutomobileParts(automobileParts.getInventoryId());
//
//        AutomobileParts automobileParts2 = automobileParts1.get();
//        if(null != automobileParts2.getPartName())
//            automobileParts2.setPartName(automobileParts.getPartName());
//        if(0 !=automobileParts2.getInventoryId())
//            automobileParts2.setInventoryId(automobileParts.getInventoryId());
//        if(0 != automobileParts2.getPartCount())
//            automobileParts2.setPartCount(automobileParts.getPartCount());
//        if(null != automobileParts2.getPartAvailable())
//            automobileParts2.setPartAvailable(automobileParts.getPartAvailable());
//        if(null != automobileParts2.getPartName())
//            automobileParts2.setPartName(automobileParts.getPartName());
//        if(null !=automobileParts2.getServiceRepairPart())
//            automobileParts2.setServiceRepairPart(automobileParts.getServiceRepairPart());
//        if (null !=automobileParts2.getPartDescription())
//            automobileParts2.setPartDescription(automobileParts.getDescription());
//       if(0 !=automobileParts2.getPartPrice())
//          automobileParts2.setPartPrice(automobileParts.getPartPrice());
//  automobilePartRepository.save(automobileParts2);
        System.out.println("update services geting called values");
        return "Services update successfully ";

    }

    @Override
    public String deleteparts(AutomobilePartsDTO automobilePartsDTO) {
         automobilePartRepository.deleteById(52);
        System.out.println("all parts deleted successfully");
        System.out.println("all parts deleted  getting called");
        return "deleted parts successfully";
    }

//    List<AutomobileParts> automobileParts = automobilePartRepository.findByName("library");
//    automobileParts.forEach(e->system.out.println(e));

    public void displayparts() {
        System.out.println("Displaying parts");
        for (AutomobileParts automobileParts : partList) {
            System.out.println(automobileParts.toString());

        }
    }
}
