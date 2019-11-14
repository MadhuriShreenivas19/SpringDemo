package com.lnt.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myBean")
public class MyBeanServices {
@Value("LnT")
private String companyName;

@Value("104")
private int niftyRank;

@Value("Madhuri Addagatla")
private String director;

@Autowired
private Address addr;


public MyBeanServices(String companyName, int niftyRank) {
	super();
	this.companyName = companyName;
	this.niftyRank = niftyRank;
}

public MyBeanServices() {
	super();
	System.out.println("Bean created.");
}


public void setDirector(String director) { //director
	this.director = director;
}
//This is for Setter injection.
public Address getAddr() {
	return addr;
}

public void setAddr(Address addr) {
	this.addr = addr;
}

@Override
public String toString() {
	return "MyBeanServices [companyName=" + companyName + ", niftyRank=" + niftyRank + ", director=" + director
			+ ", addr=" + addr + "]";
}







}
