package com.lti.core.tests;

import java.sql.Date;
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
	/*	List<Employee> empList=service.getAllEmps();
	   for(Employee emp:empList) 
		   System.out.println(emp);*/
		
		/*Employee emp=service.getEmployeeDetails(200);
		System.out.println(emp);*/
		Employee emp=new Employee();
		emp.setEmployeeId(300);
		emp.setFirstName("Madhuri");
		emp.setLastName("Shreenivas");
		emp.setJobId("AC_ACCOUNT");
		java.util.Date dt=new java.util.Date();
		emp.setHireDate(new Date(dt.getTime()));
		emp.setSalary(100000);
		emp.setEmail("abc@gmail.com");
	    int val=service.joinNewEmployee(emp);
	    System.out.println(val);
	}
	
	catch (EmpException e) {
	e.printStackTrace();
	}
	
	
	ctx.close();
	
	}
}

