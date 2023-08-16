package com.tcgi.simplespringmvc.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "Departments")
public class Department {
	@Id
	@Column(name = "department_id")
	int departmentId ;
	
	@Column(name = "department_name")
	String departmentName;
	
	@OneToMany(mappedBy="department")
	
	List<Employee> empOfDeptt;

	public Department() {
		super();
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Employee> getEmpOfDeptt() {
		return empOfDeptt;
	}

	public void setEmpOfDeptt(List<Employee> empOfDeptt) {
		this.empOfDeptt = empOfDeptt;
	}	
	
	

}
