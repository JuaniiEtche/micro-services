package com.eldar.departamentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartamentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartamentServiceApplication.class, args);
	}

}
