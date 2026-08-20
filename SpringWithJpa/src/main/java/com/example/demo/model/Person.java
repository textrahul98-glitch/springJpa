package com.example.demo.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Person {
	
	private String name;
	private String email;
	private String city;
	
	@EmbeddedId
	private PersonPk personPk;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public PersonPk getPersonPk() {
		return personPk;
	}

	public void setPersonPk(PersonPk personPk) {
		this.personPk = personPk;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", city=" + city + ", personPk=" + personPk + "]";
	}
	
	
	

}
