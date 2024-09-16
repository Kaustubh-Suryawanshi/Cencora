package com.example.CustomerRelationship;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
class CustomerRelationshipApplication {

	public static void main(final String[] args) {
		SpringApplication.run(CustomerRelationshipApplication.class, args);
	}

}

