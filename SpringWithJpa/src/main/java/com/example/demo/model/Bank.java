package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bank_table")
public class Bank {
	
	@Id
	private Integer id;
	
	private String bankName;
	
	private String bankIfsc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankIfsc() {
		return bankIfsc;
	}

	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", bankName=" + bankName + ", bankIfsc=" + bankIfsc + "]";
	}
	
	

}
