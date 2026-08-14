package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private Integer s_Id;
	private String S_name;
	private String s_city;
	public Integer getS_Id() {
		return s_Id;
	}
	public void setS_Id(Integer s_Id) {
		this.s_Id = s_Id;
	}
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		S_name = s_name;
	}
	public String getS_city() {
		return s_city;
	}
	public void setS_city(String s_city) {
		this.s_city = s_city;
	}
	@Override
	public String toString() {
		return "Student [s_Id=" + s_Id + ", S_name=" + S_name + ", s_city=" + s_city + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer s_Id, String s_name, String s_city) {
		super();
		this.s_Id = s_Id;
		S_name = s_name;
		this.s_city = s_city;
	}
	
	

}
