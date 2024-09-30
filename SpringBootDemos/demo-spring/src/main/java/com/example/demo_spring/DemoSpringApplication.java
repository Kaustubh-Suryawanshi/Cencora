package com.example.demo_spring;

import com.example.demo_spring.configuration.AccountConfig;
import com.example.demo_spring.dao.AccountDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoSpringApplication.class, args);
//		System.out.println("kokokoko");

		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AccountConfig.class);
		AccountDao accountDao= context.getBean("accountDao", AccountDao.class);
		accountDao.addAccount();
	}

}
