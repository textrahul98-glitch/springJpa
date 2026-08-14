package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.EmployeeService;
import com.example.demo.service.StudentService;

@SpringBootApplication
public class SpringWithJpaApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ap=	SpringApplication.run(SpringWithJpaApplication.class, args);
		
	StudentService empService=ap.getBean(StudentService.class);
		empService.saveStudent();
	}

}
