package com.example.billingservice;

import com.example.billingservice.dto.InvoiceRequestDTO;
import com.example.billingservice.service.InvoiceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(InvoiceService invoiceService){
		return args -> {
			invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(900000),"5353643c-9c4c-44cd-a8b2-b599ec7900a9"));
			invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(8000),"5353643c-9c4c-44cd-a8b2-b599ec7900a9"));
			invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(754000),"0f286d99-5f9f-4b59-be92-d6e8d2455bbb"));
		};
	}

}
