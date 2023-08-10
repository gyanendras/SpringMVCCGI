package com.tcgi.simplespringmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tcgi.simplespringmvc.services.GreetingService;

@Component
public class DepInjSetterFieldConstructor {
	
	@Autowired
	GreetingService gs ;

	@Autowired
	@Qualifier("GreetingService-S2")
	GreetingService gs1 ;
	
	@Autowired
	@Qualifier("GreetingService-S1")
	GreetingService gs2 ;
	
	void greeting(){
		
		gs.greet();
		System.out.println("from DISFC");
		gs1.greet();
		gs2.greet();
	}



}
