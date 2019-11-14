package com.lti.core.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.core.daos.EmpDao;

@Service("empService")
@Scope("singleton")
@Lazy(false)
public class EmpServiceImpl implements EmpService,InitializingBean,DisposableBean {
	
	//Field Injection
//	@Autowired  // by default searches bean of type EmpDao.
	@Resource(name="empDao")  // it is doing ByType injection.
	//@Qualifier("empDao")
	
	private EmpDao dao;

	public EmpServiceImpl()
	{
		System.out.println("Emp created");
	}
	@Override
	public String getAllEmps() {
  
		return dao.getAllEmps();
	}
	
	@PostConstruct
	public void initBean()
	{
		System.out.println("in initBean()");
	}
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
	
		System.out.println("In after Properties");
	}
	
	
	@PreDestroy
	public void cleanUp()
	{
		System.out.println("cleanUp() is called.");
	}
	
	
	@Override
	public void destroy() throws Exception {
	
		System.out.println("Bean being destroyed.");
		
	}




}
