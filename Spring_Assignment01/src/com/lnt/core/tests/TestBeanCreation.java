package com.lnt.core.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lnt.core.services.Employee;


public class TestBeanCreation {

	public static void main(String args[]) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
	    Employee em=(Employee)ctx.getBean("emp");
	    System.out.println(em);
		
		
		
	}
}
