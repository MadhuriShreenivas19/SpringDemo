package com.lti.core.daos;

import java.util.List;

import com.lti.core.entities.Employee;

import com.lti.core.exceptions.EmpException;

public interface EmpDao {

	public List <Employee> getAllEmps() throws EmpException;
	
}
