package com.lti.core.entities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("prototype")
public class Employee {
  
	public Employee() {
		System.out.println("Employee object created!!");
	}
}
