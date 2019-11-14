package com.lti.core.services;

import java.util.List;

import com.lti.core.entities.Employee;
import com.lti.core.exceptions.EmpException;

public interface EmpService {

	public List<Employee> getAllEmps() throws EmpException;
	public Employee getEmployeeDetails(int empId) throws EmpException;
	public int joinNewEmployee(Employee emp) throws EmpException;
}
