package com.tcgi.simplespringmvc;

import java.time.LocalDate;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

//Hibernate is a ORM(Object relation mapping) tool. You have to import Hibernate Jars.

@Component
@Entity(name="Employees")
public class Employee {
	@Id
	@Column(name="employee_id")
	Long employeeId;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	
	@Transient
	LocalDate dob;
	
	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, LocalDate dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	

}
