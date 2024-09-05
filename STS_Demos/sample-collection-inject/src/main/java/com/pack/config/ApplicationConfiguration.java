package com.pack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pack.model.Country;

@Configuration
public class ApplicationConfiguration {
	
	@Bean(name= "countryObj")
	public Country getCountry() {
		return new Country("India");
	}
}
