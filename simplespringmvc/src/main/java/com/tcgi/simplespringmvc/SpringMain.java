package com.tcgi.simplespringmvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcgi.simplespringmvc.services.GreetingService;

public class SpringMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.tcgi.simplespringmvc");
		ctx.refresh();
		

		
		GreetingService gs = (GreetingService) ctx.getBean(GreetingService.class);
		gs.greet();
		
		GreetingService gs1 = new GreetingService(); 
        gs1.greet();
	}

}
