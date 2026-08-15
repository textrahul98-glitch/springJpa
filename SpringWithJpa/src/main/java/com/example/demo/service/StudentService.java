package com.example.demo.service;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRepo.StudentRepo;
import com.example.demo.model.Student;


@Service
public class StudentService {

	@Autowired
	private StudentRepo sRepo;

	public void saveStudent() {
		Student student1 = new Student(1006, "Satara", "Sachin");
		Student student2 = new Student(1003, "Satara", "Sachin");
		Student student3 = new Student(1004, "Satara", "Sachin");
		Student student4 = new Student(1005, "Satara", "Sachin");
		List<Student> stu = Arrays.asList(student1, student2, student3, student4);
		sRepo.saveAll(stu);
	}

	// one id record
	public void getStudentById(Integer id) {

		Optional<Student> student = sRepo.findById(id);

		if (student.isPresent()) {

			System.out.println(student.get());

		} else {
			System.out.println("Record is not present for id = " + id);
		}

	}
	
	// getting multiple record base on ids
	public void getStudents(List<Integer> ids) {
		Iterable<Student> student= sRepo.findAllById(ids);
		student.forEach(s->System.out.println(s));
	}
	
	//All records
	public void getAllStudents() {
		Iterable<Student> student= sRepo.findAll();
		student.forEach(s->System.out.println(s));
	}
	
	//deleted student record
	public void deleteByStudentId(Integer ids) {
		sRepo.deleteById(ids);
		System.out.println("recors deleted for id = "+ids);
		
	}
	
	//deleted multiple student record
	public void deleteByStudentsId(List<Integer> ids) {
		sRepo.deleteAllById(ids);
		System.out.println("recors deleted for id = "+ids);
		
	}
	public void getCount() {
		System.out.println(sRepo.count());
		
	}

}
