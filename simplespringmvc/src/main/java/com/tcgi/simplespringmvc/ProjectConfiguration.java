package com.tcgi.simplespringmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

import com.tcgi.simplespringmvc.services.GreetingLatest;
import com.tcgi.simplespringmvc.services.GreetingService;
import com.tcgi.simplespringmvc.services.GreetingSubService;

@Configuration
@ComponentScan(basePackages = {"com.tcgi.simplespringmvc"})
public class ProjectConfiguration {
	
	 @Bean("GreetingService")
	 @Primary
	GreetingService getObject() {
		return new GreetingLatest();
	}
	
	

}
