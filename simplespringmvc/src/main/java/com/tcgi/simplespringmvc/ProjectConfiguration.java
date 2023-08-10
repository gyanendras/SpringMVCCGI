package com.tcgi.simplespringmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tcgi.simplespringmvc.services.GreetingLatest;
import com.tcgi.simplespringmvc.services.GreetingService;
import com.tcgi.simplespringmvc.services.GreetingSubService;

@Configuration
public class ProjectConfiguration {
	
	@Bean
	GreetingService getObject() {
		return new GreetingLatest();
	}

}
