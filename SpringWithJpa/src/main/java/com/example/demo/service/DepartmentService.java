package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRepo.DepartmentRepo;
import com.example.demo.model.Department;
import com.example.demo.model.Student;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepo deptRepo;

	public void saveDepartment() {

		Department dept = new Department();

		dept.setDeptfees(4000.50);
		dept.setName("data science");
		dept.setStudentCount(10);
		deptRepo.save(dept);

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dept.setDeptfees(4500.00);
		deptRepo.save(dept);
	}

	public void getDeptById(Integer id) {

		Optional<Department> dept = deptRepo.findById(id);

		if (dept.isPresent()) {

			System.out.println(dept.get());

		} else {
			System.out.println("Record is not present for id = " + id);
		}

	}

}
