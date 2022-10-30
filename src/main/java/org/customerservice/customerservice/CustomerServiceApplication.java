package org.customerservice.customerservice;

import org.customerservice.customerservice.dtos.CustomerRequestDTO;
import org.customerservice.customerservice.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerService customerService){
		return args -> {
			customerService.save(new CustomerRequestDTO(UUID.randomUUID().toString(),"anass","anasse@gmail.com"));
			customerService.save(new CustomerRequestDTO(UUID.randomUUID().toString(),"TP","Tp@gmail.com"));
		};
	}

}
