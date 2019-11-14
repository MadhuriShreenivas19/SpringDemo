package com.lti.core.tests;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.core.entities.Employee;
import com.lti.core.exceptions.EmpException;
import com.lti.core.services.EmpService;



public class TestBeanCreation {

	public static void main(String[] args) {
	
	ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
	EmpService service=ctx.getBean("empService",EmpService.class);
	try {
		List<Employee> empList=service.getAllEmps();
	   for(Employee emp:empList) {
		   System.out.println(emp);
	   }
	
	} catch (EmpException e) {
	e.printStackTrace();
	}
	
	
	ctx.close();
	
	}

}
