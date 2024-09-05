package com.sample.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.spring.service.PersonService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springaop.xml");
		PersonService personService = ctx.getBean("personService", PersonService.class);
		
		System.out.println(personService.getPerson().getName());
		
		personService.getPerson().setName("Akshat");
		
		//personService.getPerson().throwException();
		
		ctx.close();
	}

}
