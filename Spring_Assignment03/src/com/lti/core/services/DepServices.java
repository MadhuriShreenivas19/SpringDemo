package com.lti.core.services;

import java.util.List;

import com.lti.core.entities.Departments;
import com.lti.core.exceptions.DepExceptions;

public interface DepServices {
	public List<Departments> giveAllDept() throws DepExceptions;
}
