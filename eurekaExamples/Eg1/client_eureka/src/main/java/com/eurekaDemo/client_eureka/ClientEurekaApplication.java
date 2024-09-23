package com.eurekaDemo.client_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ClientEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientEurekaApplication.class, args);
		
	}

}
