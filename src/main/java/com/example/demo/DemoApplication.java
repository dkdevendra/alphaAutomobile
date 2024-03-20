package com.example.demo;

import com.alphaautomobile.services.impl.AutomobileSercicesImpl;
import com.alphaautomobilebeans.AutomobileService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("com.*")
@EntityScan("com.*")
@SpringBootApplication(scanBasePackages= "com.*")
@EnableJpaRepositories(basePackages = "com.*")
public class DemoApplication {
	public static void main(String[] args) {
		System.out.println("Welcome to Alpha Automobile.");
		AutomobileService automobileService = new AutomobileService();

		automobileService.setServiceId(1);
		automobileService.setServicsCost(3000);
		automobileService.setServiceName("Devendra");
		automobileService.setServiceDetails("Car services");

		AutomobileSercicesImpl automobileServices = new AutomobileSercicesImpl();

		AutomobileService automobileService1 = new AutomobileService();
		automobileService1.setServiceId(2);
		automobileService1.setServicsCost(5000);
		automobileService1.setServiceName("Rajesh");
		automobileService1.setServiceDetails("Car wash");


		//automobileServices.addservices(automobileService);
		//automobileServices.addservices(automobileService1);

		automobileServices.displayServices();



		SpringApplication.run(DemoApplication.class, args);


	}

}
