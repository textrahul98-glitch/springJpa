package com.example.demo.EmployeeRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	public List<Employee> findByemployeeName(String empName);
	
	public List<Employee> findByEmployeeSalery(String sal);
	
	/*
	 * @Query(value="select * from emp", nativeQuery = true) public
	 * List<Employee> getAllEmp();
	 */
	
	@Query("from Employee  where employeeId > 110 ")//HQL
	public List<Employee> getAllEmp();
	

}
