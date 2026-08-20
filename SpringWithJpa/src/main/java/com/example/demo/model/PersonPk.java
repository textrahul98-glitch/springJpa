package com.example.demo.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPk {
	
	private Integer personId;
	private String panNumber;
	private String adharNumber;
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	@Override
	public String toString() {
		return "PersonPk [personId=" + personId + ", panNumber=" + panNumber + ", adharNumber=" + adharNumber + "]";
	}
	
	

}
