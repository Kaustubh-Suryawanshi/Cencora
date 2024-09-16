package com.eurekaDemo.hello_greet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloGreetApplication {

	@GetMapping("/")
	public String greet(){
		return "Hello From eureka client";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloGreetApplication.class, args);
	}

}
