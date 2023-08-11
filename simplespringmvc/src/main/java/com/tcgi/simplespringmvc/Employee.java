package com.tcgi.simplespringmvc;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	String firstName;
	String lastName;
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
