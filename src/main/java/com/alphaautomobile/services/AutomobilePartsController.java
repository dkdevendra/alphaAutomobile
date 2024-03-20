package com.alphaautomobile.services;

import com.alphaautomobile.dto.AutomobilePartsDTO;
import com.alphaautomobilebeans.AutomobileParts;

import java.util.List;

public interface AutomobilePartsController {

        public String Addparts(AutomobilePartsDTO automobileParts);
        public List<AutomobilePartsDTO> getAllParts();
//        public List<AutomobileParts> getSearchName();
        public  String updateparts(AutomobilePartsDTO automobilePartsDTO);
        public  String deleteparts(AutomobilePartsDTO automobilePartsDTO);

    }

