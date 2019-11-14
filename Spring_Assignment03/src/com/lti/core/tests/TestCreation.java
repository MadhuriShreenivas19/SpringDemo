package com.lti.core.tests;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.core.entities.Departments;
import com.lti.core.exceptions.DepExceptions;
import com.lti.core.services.DepServices;

public class TestCreation {
	public static void main(String args[] ) throws DepExceptions  {
		
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		DepServices service=ctx.getBean("depService",DepServices.class);
		
		List<Departments> depList=service.giveAllDept();
		   for(Departments dep:depList) {
			   System.out.println(dep);
			   
	
	}
		   ctx.close();
}
}
