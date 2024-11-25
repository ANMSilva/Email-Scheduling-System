package com.example.Email.Scheduling.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmailSchedulingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailSchedulingServiceApplication.class, args);
	}

}
