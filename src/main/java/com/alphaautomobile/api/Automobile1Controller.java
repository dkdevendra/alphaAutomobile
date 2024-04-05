package com.alphaautomobile.api;

import com.alphaautomobile.dto.AutomobileServiceDTO;
import com.alphaautomobile.services.impl.AutomobileServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/kalla")
public class Automobile1Controller {
    @Autowired
    AutomobileServicesImpl automobileSercices;

    @GetMapping("/hello")
    public String Hello() {
        return "Welcome to auto mobile";
    }

    @GetMapping("/ddd")
    public String ddd() {

        return "it is auto mobile controller";
    }

    @GetMapping("all-services")
    public List<AutomobileServiceDTO> getAllService() {

        return automobileSercices.getAllServics();
    }
}
