package com.tcgi.simplespringmvc.repo;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tcgi.simplespringmvc.domain.Employee;

@Controller
public class EmployeeRepository {
	
	@Autowired
	EntityManager em;

	public void addData(Employee e, List l){
		//l.add(e);
		em.persist(e);
	}
	
	public Employee retrieve(List l, String fname) {
		
		//return (Employee) l.get(0);
		return em.find(Employee.class, 121l);
	}
	
	public void update(Employee e, List l) {
		int idx = l.indexOf(e);
		l.add(idx,e);
	}
	
	public void delData(String fname, List l){
		l.remove(0);
	}
	
}
