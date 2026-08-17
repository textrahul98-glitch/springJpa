package com.example.demo.EmployeeRepo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>{
	
	

}
