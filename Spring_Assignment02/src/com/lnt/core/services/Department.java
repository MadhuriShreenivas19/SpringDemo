package com.lnt.core.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("department")
public class Department {
    
	@Value("202")
	private int  did;
	
	@Value("Comps")
	private String dname;
	
	@Value("Navi Mumbai")
	private String dlocation;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDlocation() {
		return dlocation;
	}
	public void setDlocation(String dlocation) {
		this.dlocation = dlocation;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", dlocation=" + dlocation + "]";
	}
	
	
	
}
