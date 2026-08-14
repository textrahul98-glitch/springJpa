package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRepo.StudentRepo;
import com.example.demo.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo sRepo;
	
	public void saveStudent() {
		Student student1= new Student(1006,"Satara", "Sachin");
		Student student2= new Student(1003,"Satara", "Sachin");
		Student student3= new Student(1004,"Satara", "Sachin");
		Student student4= new Student(1005,"Satara", "Sachin");
		List<Student> stu=Arrays.asList(student1,student2,student3,student4);
		sRepo.saveAll(stu);
	}

}
