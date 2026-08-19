package com.example.demo.EmployeeRepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Department;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Integer> {

}
