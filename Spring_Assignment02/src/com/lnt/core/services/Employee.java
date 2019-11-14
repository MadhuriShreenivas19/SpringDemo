package com.lnt.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
@Value("102")
private int eid;

@Value("Anushka")
private String ename;

@Value("20000")
private int esal;

@Value("200")
private float ecommision;

@Autowired
private Department department;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEsal() {
	return esal;
}
public void setEsal(int esal) {
	this.esal = esal;
}
public float getEcommision() {
	return ecommision;
}
public void setEcommision(float ecommision) {
	this.ecommision = ecommision;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", ecommision=" + ecommision
			+ ", department=" + department + "]";
}

	
}
