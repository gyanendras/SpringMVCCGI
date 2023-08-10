package com.tcgi.simplespringmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tcgi.simplespringmvc.services.GreetingService;

@Component
public class DepInjConstructor {
	GreetingService gs ;
	
	
	
    public DepInjConstructor() {
		super();
		System.out.println("In default constructor");
	}


    @Autowired
	public DepInjConstructor(GreetingService gs) {
		super();
		this.gs = gs;
		System.out.println("In parameterised constructor");
	}
	
	
   public void greeting() {
	   gs.greet();
   }


public GreetingService getGs() {
	return gs;
}


@Qualifier("GreetingService-P")
public void setGs(GreetingService gs) {
	System.out.println("In setter");
	this.gs = gs;
}
   
   
   
   
}
