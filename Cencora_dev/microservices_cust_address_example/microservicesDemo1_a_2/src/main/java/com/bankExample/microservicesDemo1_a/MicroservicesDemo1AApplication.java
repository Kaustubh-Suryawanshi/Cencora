package com.bankExample.microservicesDemo1_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.bankExample.microservicesDemo1_a.feignclient")
public class MicroservicesDemo1AApplication {

	public static void main(String[] args) {

		SpringApplication.run(MicroservicesDemo1AApplication.class, args);
	}

}
