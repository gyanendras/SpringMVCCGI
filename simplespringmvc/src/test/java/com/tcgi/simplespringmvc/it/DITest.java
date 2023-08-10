package com.tcgi.simplespringmvc.it;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.tcgi.simplespringmvc.DepInjConstructor;
import com.tcgi.simplespringmvc.ProjectConfiguration;
import com.tcgi.simplespringmvc.services.GreetingService;


@ContextConfiguration(classes = {ProjectConfiguration.class })
@SpringJUnitConfig
class DITest {
	
	@Autowired
	GreetingService gs;
	
	@Autowired
	DepInjConstructor dinj;

	@Test
	void test() {
		gs.greet();
		dinj.greeting();
	}

}
