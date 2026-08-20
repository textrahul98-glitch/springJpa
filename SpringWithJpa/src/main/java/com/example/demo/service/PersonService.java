package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRepo.PersonRepo;
import com.example.demo.model.Person;
import com.example.demo.model.PersonPk;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo pRepo;
	
	
	public void savePerson() {
		
		PersonPk pk= new PersonPk();
		pk.setAdharNumber("28564201");
		pk.setPanNumber("Abgc654");
		pk.setPersonId(1);
		
		Person p = new Person();
		p.setCity("Pune");
		p.setEmail("abc@gmail.com");
		p.setName("Ram");
		p.setPersonPk(pk);
		pRepo.save(p);
		System.out.println("record Save...");
		
		
	}
	
	

}
