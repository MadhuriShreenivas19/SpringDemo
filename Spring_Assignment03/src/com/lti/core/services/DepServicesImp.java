package com.lti.core.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lti.core.daos.DepDao;
import com.lti.core.entities.Departments;
import com.lti.core.exceptions.DepExceptions;

@Service("depService")
@Scope("singleton")
public class DepServicesImp implements DepServices{
	
	@Resource(name="depDao")
	private DepDao depDao;

	@Override
	public List<Departments> giveAllDept() throws DepExceptions {
	
		return depDao.getAllDept();
	}

	
}
