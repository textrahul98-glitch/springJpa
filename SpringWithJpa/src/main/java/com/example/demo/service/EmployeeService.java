package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRepo.EmployeeRepo;
import com.example.demo.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;

	public void saveEmployee() {

		Employee emp = new Employee();
		emp.setEmployeeId(1500);
		emp.setEmployeeName("Ramesh");
		emp.setEmployeeSalery("17522");
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

	//getting record by descending order
	public void getAllRecordBySorting() {

		Sort sort = Sort.by("employeeId").descending();
		List<Employee> employeeList = empRepo.findAll(sort);
		employeeList.forEach(e -> System.out.println(e));

	}
	
	//pagination code
	public void getAllRecordsPaged(int page, int size) {
		
	    Pageable pageable=	PageRequest.of(page, size);
		Page<Employee> employeePage = empRepo.findAll(pageable);
		employeePage.getContent().forEach(System.out::println);

	}
	
	

}
