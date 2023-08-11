package com.tcgi.simplespringmvc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tcgi.simplespringmvc.Employee;

@Controller
public class EmployeeController {
	@Autowired 
	Employee emp;
	
	@RequestMapping("/form")
	ModelAndView enq(){
		ModelAndView frm1 = new ModelAndView("employeeDetails");
		return frm1;
	}
	
	@RequestMapping("/emp")
	ModelAndView emplList(@RequestParam String fname, @RequestParam String dob){
		ModelAndView pgAnValue = new ModelAndView("staff");
		Employee e = new Employee(fname+"2", "Lname"+"2", LocalDate.parse(dob));
		emp.setFirstName(fname);
		emp.setLastName("Lname");
		emp.setDob(LocalDate.parse(dob));
		List<Employee> eList = new ArrayList();
		eList.add(emp);
		eList.add(e);
		pgAnValue.addObject("el1", eList);
		pgAnValue.addObject("e1", emp);
		return pgAnValue;
		
	}

}
