package com.lnt.core.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lnt.core.services.Address;
import com.lnt.core.services.MyBeanServices;

public class TestBeanCreation {

	public static void main(String[] args) {
		/*//normal way of creating objects
		MyBeanServices services=new MyBeanServices();
		
		//call any existing method on object
		System.out.println(services.toString());
*/
		//Create a Spring context
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		
		MyBeanServices bean1=(MyBeanServices)ctx.getBean("myBean");
	    System.out.println(bean1);
/*	    Address add = (Address)ctx.getBean("addr");
	    System.out.print(add);*/
	}

}
