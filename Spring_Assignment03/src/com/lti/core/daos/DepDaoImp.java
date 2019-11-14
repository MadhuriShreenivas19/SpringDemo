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

import com.lti.core.entities.Departments;

import com.lti.core.exceptions.DepExceptions;

@Repository("depDao")
@Scope("singleton")  
@Lazy(true) 
public class DepDaoImp implements DepDao{
	
    @Autowired  
	private DataSource datasource;
    
	@Override
	public List<Departments> getAllDept() throws DepExceptions {
		Connection connect=null;
		Statement stmt=null;
		ResultSet rs=null;
		ArrayList<Departments> depList;
		
		depList=new ArrayList<>();
		try {
			connect=datasource.getConnection();
			stmt=connect.createStatement();
			rs=stmt.executeQuery("Select DEPARTMENT_ID, DEPARTMENT_NAME from DEPARTMENTS");
			while(rs.next())
			{
				int depId =rs.getInt("DEPARTMENT_ID");
				String depName=rs.getString("DEPARTMENT_NAME");
				 Departments dep=new Departments(depId,depName);
			   depList.add(dep);
			}
		} catch (SQLException e) {
		
			throw new DepExceptions("Exception from all getAllDep()",e);
		}finally {
			try {
				if(rs!=null)
					rs.close();
				if(stmt!=null)
					stmt.close();
				if(connect!=null)
					connect.close();
			} catch (SQLException e) {
			
				throw new DepExceptions("Exception from all getAllDep()",e);
			}
			
			
		}
		
		return depList;
	}

	

}
