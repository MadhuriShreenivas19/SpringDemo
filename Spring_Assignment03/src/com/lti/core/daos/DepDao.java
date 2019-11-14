package com.lti.core.daos;
import java.util.List;
import com.lti.core.entities.Departments;
import com.lti.core.exceptions.DepExceptions;

public interface DepDao {

	public List<Departments> getAllDept() throws DepExceptions;
}
