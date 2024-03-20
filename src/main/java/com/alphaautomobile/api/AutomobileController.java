package com.alphaautomobile.api;

import com.alphaautomobile.dto.AutomobileServiceDTO;
import com.alphaautomobile.services.impl.AutomobileSercicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class AutomobileController {

    @Autowired
    AutomobileSercicesImpl automobileServices;
    @GetMapping("/hello")
    public String hello(){
        return "Welcome to alpha automobile";
    }
    @GetMapping("/Dev")
    public  String Dev(){
        return  "Welcome to zuvocloud compnay";
    }

    @GetMapping("all-services")
    public List<AutomobileServiceDTO> getAllService(){
        return automobileServices.getAllServics();
    }
    @PostMapping("add-service")
    public String addService(@RequestBody AutomobileServiceDTO serviceDTO){
        System.out.println("add service is being called...."+serviceDTO.toString());
        return automobileServices.addservices(serviceDTO);
    }
    @PutMapping("put-service")
    public  String  updateService(@RequestBody AutomobileServiceDTO serviceDTO){
        System.out.println("put services..."+serviceDTO.toString());
        return automobileServices.updateservices(serviceDTO);
    }
}
