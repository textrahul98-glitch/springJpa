package com.example.demo.service;

import java.util.List;

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
		emp.setEmployeeId(1115);
		emp.setEmployeeName("Sachin");
		emp.setEmployeeSalery("8888");
		empRepo.save(emp);

	}

	public void findByName() {
		List<Employee> nameList = empRepo.findByemployeeName("Sachin");
		System.out.println(nameList);

	}
	
	public void findBySal() {
		List<Employee> nameList = empRepo.findByEmployeeSalery("8888");
		System.out.println(nameList);

	}
	
	public void getAllEmp() {
		List<Employee> nameList = empRepo.getAllEmp();
		System.out.println(nameList);

	}

}
