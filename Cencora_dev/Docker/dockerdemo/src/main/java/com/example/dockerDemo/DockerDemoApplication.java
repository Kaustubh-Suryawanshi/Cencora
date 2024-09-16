package com.example.dockerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerDemoApplication {
	@RequestMapping("/")
	public String home(){
		return "Helo kube";
	}

	public static void main(String[] args) {


		SpringApplication.run(DockerDemoApplication.class, args);
	}

}
