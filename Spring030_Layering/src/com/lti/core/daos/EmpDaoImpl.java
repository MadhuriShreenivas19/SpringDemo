package com.lti.core.daos;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("empDao")
@Scope("singleton")  //by default object is singleton in Spring Context
@Lazy(false) //by default each singleton beam is @Lazy(false)
public class EmpDaoImpl implements EmpDao {
 
	public EmpDaoImpl()
	{
		System.out.println("Dao created");
	}
	@Override
	public String getAllEmps() {
	
		return "Hello Madhuri";
	}


	

}
