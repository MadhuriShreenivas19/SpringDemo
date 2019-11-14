package com.lti.web.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//http://localhost:8082/Spring060_MvcBasics/home.hr
@Controller
public class EmpController {

	@RequestMapping(name="/home.hr")
	public ModelAndView getHomePage()
	{
		String company="Larsen and Tubro Information Services";
		String jspName= "/pages/HomePage.jsp";
		
		ModelAndView mAndV=new ModelAndView();
		mAndV.addObject("CompanyName",company);
		mAndV.setViewName(jspName);
		return mAndV;
		
	}
}
