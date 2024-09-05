package com.sample.spring.service;

import com.sample.spring.model.Person;

public class PersonService {

	private Person person;
	
	public Person getPerson(){
		return this.person;
	}
	
	public void setPerson(Person e){
		this.person=e;
	}

	
}
