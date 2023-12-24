package com.eldar.apigategay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGategayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGategayApplication.class, args);
	}

}
