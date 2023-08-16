package com.tcgi.simplespringmvc.it;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.tcgi.simplespringmvc.ProjectConfiguration;
import com.tcgi.simplespringmvc.domain.Department;
import com.tcgi.simplespringmvc.domain.Employee;

@ContextConfiguration(classes = {ProjectConfiguration.class })
@SpringJUnitConfig
class EmployeTest {
	
	@Autowired
	EntityManager em;

	@Test
	void test() {
		Employee emp = new Employee();
		//emp.setEmployeeId(4464l);
		emp.setFirstName("Fname081623-1");
		emp.setLastName("Lname081623-1");
		emp.setEmail("a@b.com");
		emp.setHireDate(LocalDate.now());
		emp.setJobId("IT_PROG");
		em.getTransaction().begin();
		em.merge(emp);
		em.getTransaction().commit();
		em.close();
	}
	
	
	@Test
	void testRead() {
		Employee e = em.find(Employee.class, 101l);
		String s = e.getDept().getDepartmentName();
		System.out.println(s);
	
	}
	
	@Test
	void testReadDepartment() {
		Department d = em.find(Department.class, 50);
		List<Employee> eList = d.getEmpOfDeptt();
	    for(Employee e : eList) {
	    	System.out.println(e.getEmployeeId());
	    	System.out.println(e.getFirstName());
	    }
	
	}
}


