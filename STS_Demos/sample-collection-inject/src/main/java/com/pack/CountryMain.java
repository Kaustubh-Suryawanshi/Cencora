package com.pack;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pack.config.ApplicationConfiguration;
import com.pack.model.Country;

public class CountryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Country countryObj= (Country) context.getBean("countryObj");
		System.out.println("CountryName= "+  countryObj.getCountryName());
	}

}
