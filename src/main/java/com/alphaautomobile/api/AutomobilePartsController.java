package com.alphaautomobile.api;

import com.alphaautomobile.dto.AutomobilePartsDTO;
import com.alphaautomobile.dto.AutomobileServiceDTO;
import com.alphaautomobile.services.impl.AutomobilePartsImpl;
import com.alphaautomobilebeans.AutomobileParts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class
AutomobilePartsController {
    @Autowired
    AutomobilePartsImpl automobileParts;

    @GetMapping("all_parts")
    public List<AutomobilePartsDTO> getAllParts(){
    return automobileParts.getAllParts();
    }
    @PostMapping("add-parts")
    public String addparts(@RequestBody AutomobilePartsDTO partsDTO){
        return automobileParts.Addparts(partsDTO);
    }

    @PutMapping("update-parts")
    public  String  updateparts(@RequestBody AutomobilePartsDTO partsDTO){
        System.out.println("put parts......"+partsDTO.toString());
        return automobileParts.updateparts(partsDTO);
    }

    @DeleteMapping("delete-parts")
    public String deleteparts(@RequestBody AutomobilePartsDTO inventryId){
        System.out.println("delete parted called..."+inventryId.toString());
        return  automobileParts.deleteparts(inventryId);
    }
}


