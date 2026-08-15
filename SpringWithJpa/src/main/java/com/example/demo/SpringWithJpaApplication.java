package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.EmployeeService;
import com.example.demo.service.StudentService;

@SpringBootApplication
public class SpringWithJpaApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ap=	SpringApplication.run(SpringWithJpaApplication.class, args);
		
	StudentService studentService=ap.getBean(StudentService.class);
	 //studentService.saveStudent();
	//studentService.getStudentById(1089);
	
	List<Integer> list=Arrays.asList(1003,1004,1005,1006);
	//studentService.getStudents(list);
	
	//studentService.getAllStudents();
	//studentService.deleteByStudentsId(list);
	studentService.getCount();
	
	}

}
