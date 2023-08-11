package com.tcgi.simplespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@RequestMapping("/emp")
	ModelAndView emplList(){
		ModelAndView pgAnValue = new ModelAndView("employeeDetails");
		return pgAnValue;
		
	}

}
