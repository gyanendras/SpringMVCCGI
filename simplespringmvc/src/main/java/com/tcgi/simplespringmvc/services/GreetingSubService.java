package com.tcgi.simplespringmvc.services;

import org.springframework.stereotype.Component;

//@Component
public class GreetingSubService extends GreetingService {
	public void greet(){
		System.out.println("Hello World from Sub!");
	}
}
