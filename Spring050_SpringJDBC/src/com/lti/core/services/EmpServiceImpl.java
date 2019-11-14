package com.lti.core.services;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lti.core.daos.EmpDao;
import com.lti.core.entities.Employee;
import com.lti.core.exceptions.EmpException;

@Service("empService")
@Scope("singleton")
@Lazy(false)
public class EmpServiceImpl implements EmpService {
	
	
	@Resource(name="empDao")  // it is doing ByType injection.

	
	private EmpDao empDao;

	public EmpServiceImpl()
	{
		System.out.println("Emp created");
	}
	@Override
	public List<Employee> getAllEmps() throws EmpException {
  
		return empDao.getAllEmps();
	}
	
	@Override
	public Employee getEmployeeDetails(int empId) throws EmpException {
		
		return empDao.getEmpOnId(empId);
	}
	@Override
	public int joinNewEmployee(Employee emp) throws EmpException {
		
		return empDao.insertNewEmployee(emp);
	}

	
	

}
