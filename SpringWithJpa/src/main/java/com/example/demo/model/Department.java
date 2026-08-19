package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dept")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dept_id")
	private Integer id;
	
	@Column(name="dept_name")
	private String name;
	
	private Integer studentCount;
	
	private Double deptfees;
	
	@CreationTimestamp
	private LocalDateTime createDeptDate;
	
	@UpdateTimestamp
	private LocalDateTime updateDeptDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(Integer studentCount) {
		this.studentCount = studentCount;
	}

	public Double getDeptfees() {
		return deptfees;
	}

	public void setDeptfees(Double deptfees) {
		this.deptfees = deptfees;
	}

	public LocalDateTime getCreateDeptDate() {
		return createDeptDate;
	}

	public void setCreateDeptDate(LocalDateTime createDeptDate) {
		this.createDeptDate = createDeptDate;
	}

	public LocalDateTime getUpdateDeptDate() {
		return updateDeptDate;
	}

	public void setUpdateDeptDate(LocalDateTime updateDeptDate) {
		this.updateDeptDate = updateDeptDate;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", studentCount=" + studentCount + ", deptfees=" + deptfees
				+ ", createDeptDate=" + createDeptDate + ", updateDeptDate=" + updateDeptDate + "]";
	}



	

}
