package com.tcgi.simplespringmvc.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("GreetingService-P")
public class GreetingService {
	
	public void greet(){
		System.out.println("Hello World!");
	}

}
