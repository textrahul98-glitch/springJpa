package com.example.demo;

import java.util.Arrays;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Product;
import com.example.demo.service.BankService;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PersonService;
import com.example.demo.service.ProductService;
import com.example.demo.service.StudentService;

@SpringBootApplication
public class SpringWithJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ap = SpringApplication.run(SpringWithJpaApplication.class, args);

		// StudentService studentService=ap.getBean(StudentService.class);
		// studentService.saveStudent();
		// studentService.getStudentById(1089);

		//List<Integer> list = Arrays.asList(1003, 1004, 1005, 1006);
		// studentService.getStudents(list);

		// studentService.getAllStudents();
		// studentService.deleteByStudentsId(list);
		// studentService.getCount();

		// EmployeeService employeeService=ap.getBean(EmployeeService.class);
       //employeeService.findByName();
	  //	employeeService.getAllEmp();
		// employeeService.getAllRecordBySorting();
		// 0,4 1111
		// 1,4
		// employeeService.getAllRecordsPaged(1,3);

		//ProductService productService = ap.getBean(ProductService.class);
		// productService.saveProduct();

		//List<Product> products = productService.getProductBySpecification("onePlus", 7000.00, 3000.00);
		//System.out.println(products);
		
		//DepartmentService departmentService=ap.getBean(DepartmentService.class);
		
	    //departmentService.saveDepartment();
		//departmentService.getDeptById(1);
		BankService bankService=ap.getBean(BankService.class);
		
		bankService.saveBankDetails();
	}

}
