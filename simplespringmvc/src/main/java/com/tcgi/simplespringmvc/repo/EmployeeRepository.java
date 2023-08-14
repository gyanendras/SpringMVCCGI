package com.tcgi.simplespringmvc.repo;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.tcgi.simplespringmvc.Employee;

@Controller
public class EmployeeRepository {

	public void addData(Employee e, List l){
		l.add(e);
	}
	
	public Employee retrieve(List l, String fname) {
		
		return (Employee) l.get(0);
	}
	
	public void update(Employee e, List l) {
		int idx = l.indexOf(e);
		l.add(idx,e);
	}
	
	public void delData(String fname, List l){
		l.remove(0);
	}
	
}
