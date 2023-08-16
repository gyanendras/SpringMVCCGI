package com.tcgi.simplespringmvc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@RequestMapping(value="/emp1", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	ModelAndView getEmp(@RequestParam String fname){
		ModelAndView pgAnValue = new ModelAndView("EmpPage");
		er.retrieve(eList,fname);
		pgAnValue.addObject(pgAnValue);
	  return pgAnValue;
	}
	
	@RequestMapping(value="/emp", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	ResponseEntity delEmp(@RequestParam String fname){
	   emp.setFirstName("FNameDeleteMethod");
	   eList.add(emp);
	   Employee e2 = new Employee();
	   e2.setEmployeeId(20l);
	   e2.setFirstName("Rohaa");
	   er.delData(fname, eList);
	   eList.add(e2);
	  //  ModelAndView mv = new ModelAndView("");
	  // mv.addObject(eList);
	   return new ResponseEntity(eList,HttpStatus.OK);
	}
	
	
	

}
