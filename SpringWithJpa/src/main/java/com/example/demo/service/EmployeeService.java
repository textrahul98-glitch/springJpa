package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRepo.EmployeeRepo;
import com.example.demo.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;

	public void saveEmployee() {

		Employee emp = new Employee();
		emp.setEmployeeId(102);
		emp.setEmployeeName("Sachin");
		emp.setEmployeeSalery("10000");
		empRepo.save(emp);
		
		
		
		
	}

}
