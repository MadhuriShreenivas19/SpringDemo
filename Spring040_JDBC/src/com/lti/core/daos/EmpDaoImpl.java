package com.lti.core.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.lti.core.entities.Employee;
import com.lti.core.exceptions.EmpException;


@Repository("empDao")
@Scope("singleton")  //by default object is singleton in Spring Context
@Lazy(true) //by default each singleton beam is @Lazy(false)
public class EmpDaoImpl implements EmpDao {
 
	@Autowired
	private DataSource dataSource;
	
	@Override
	public List<Employee> getAllEmps() throws EmpException{
		Connection connect=null;
		Statement stmt=null;
		ResultSet rs=null;
		ArrayList<Employee> empList;
		try {
			
			empList = new ArrayList<>();
			connect=dataSource.getConnection();
			stmt=connect.createStatement();
			rs=stmt.executeQuery("Select EMPLOYEE_ID,FIRST_NAME from Employees");
			
			while(rs.next())
			{
				int empId=rs.getInt("EMPLOYEE_ID");
				
				String empName=rs.getString("FIRST_NAME");
			   Employee emp= new Employee(empId,empName);
			   empList.add(emp);
			}
		} catch (SQLException e) {
			throw new EmpException("Exception from getAllEmps()",e);  //Exception chaining.
		} finally {
			
				
				try {
					if(rs!=null)
						rs.close();
					if(stmt!=null)
						stmt.close();
					if(connect!=null)
						connect.close();
				} catch (Exception e) {
					throw new EmpException("Exception from getAllEmps()",e);
				}
			
				
				
			
		}
		
		return empList;
	}
	
}
