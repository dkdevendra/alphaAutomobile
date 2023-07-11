package com.alphaautomobile.services;

import com.alphaautomobile.dto.AutomobilePartsDTO;

import java.util.List;

public interface AutomobilePartsController {

        public String Addparts(AutomobilePartsDTO automobileParts);
        public List<AutomobilePartsDTO> getAllParts();
        public  String updateparts(AutomobilePartsDTO automobilePartsDTO);
        public  String deleteparts(AutomobilePartsDTO automobilePartsDTO);

    }

