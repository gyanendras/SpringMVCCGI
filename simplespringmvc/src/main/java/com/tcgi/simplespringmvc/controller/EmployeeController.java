package com.tcgi.simplespringmvc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tcgi.simplespringmvc.domain.Employee;
import com.tcgi.simplespringmvc.repo.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired 
	Employee emp;
	
	@Autowired
	EmployeeRepository er;
	
	List<Employee> eList = new ArrayList();
	
	@RequestMapping("/form")
	ModelAndView enq(){
		ModelAndView frm1 = new ModelAndView("employeeDetails");
		return frm1;
	}
	
	@RequestMapping(value="/emp", method=RequestMethod.POST)
	ModelAndView emplList(@RequestParam String fname, @RequestParam String dob){ // TodoTry RequestBody.
		ModelAndView pgAnValue = new ModelAndView("staff");
		Employee e = new Employee(fname, "Lname"+"2", LocalDate.parse(dob));
		//emp.setFirstName(fname);
		//emp.setLastName("Lname");
		//emp.setDob(LocalDate.parse(dob));
		
		// eList.add(emp);
		
		er.addData(e, eList);
		emp = er.retrieve(eList, fname);
		
		pgAnValue.addObject("el1", eList);
		pgAnValue.addObject("e1", emp);
		return pgAnValue;
		
	}
	
	@RequestMapping(value="/emp", method=RequestMethod.GET)
	ModelAndView getEmp(@RequestParam String fname){
		ModelAndView pgAnValue = new ModelAndView("EmpPage");
		er.retrieve(eList,fname);
	  return pgAnValue;
	}
	
	@RequestMapping(value="/del", method=RequestMethod.DELETE)
	ModelAndView delEmp(@RequestParam String fname){
	   er.delData(fname, eList);
	   return null;
	}
	
	
	

}
