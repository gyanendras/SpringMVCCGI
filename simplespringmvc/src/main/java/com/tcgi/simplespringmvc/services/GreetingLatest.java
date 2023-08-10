package com.tcgi.simplespringmvc.services;

import org.springframework.stereotype.Component;

@Component("GreetingService-S2")
public class GreetingLatest extends GreetingService {
	public void greet(){
		System.out.println("Hello Globe from Sub!");
	}
}
