package com.tcgi.simplespringmvc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcgi.simplespringmvc.domain.Employee;
import com.tcgi.simplespringmvc.services.GreetingService;

public class SpringMain {
	
	
	

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.tcgi.simplespringmvc");
		ctx.refresh();
		
		GreetingService gs1 = new GreetingService(); 
        gs1.greet();
        
		
        GreetingService gs2 = (GreetingService) ctx.getBean("GreetingService-P");
        GreetingService gs3 = (GreetingService) ctx.getBean("GreetingService-S1");
        GreetingService gs4 = (GreetingService) ctx.getBean("GreetingService-S2");
        gs2.greet();
        gs3.greet();
        gs4.greet();
        
        GreetingService gs = (GreetingService) ctx.getBean(GreetingService.class);
		gs.greet();
		
		
		DepInjSetterFieldConstructor ds = ctx.getBean(DepInjSetterFieldConstructor.class);
		ds.greeting();
		
		DepInjConstructor  dij = ctx.getBean(DepInjConstructor.class);
		
		dij.greeting();
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emFactory.createEntityManager();
		
		em.getTransaction().begin();
		Employee e = em.find(Employee.class, 121l);
		System.out.println(e.getFirstName() +" "+ e.getLastName());
		System.out.println(e.getDept().getDepartmentName());
		System.out.println(e.getDept().getEmpOfDeptt().size());
		
		em.getTransaction().commit();
		em.close();
		
		
	}

}
