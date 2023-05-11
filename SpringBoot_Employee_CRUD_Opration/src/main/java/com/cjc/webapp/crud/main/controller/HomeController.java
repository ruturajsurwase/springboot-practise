package com.cjc.webapp.crud.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.webapp.crud.main.model.Employee;
import com.cjc.webapp.crud.main.serviceimpl.HomeService;

@Controller
public class HomeController 
{
  @Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String prelogin()
	{
		
		return "login";
	}
	
	@RequestMapping("/registration")
	public String  registation()
	{
		return "register";
	}
	
	@RequestMapping("/register")
	public String saveEmployee(@ModelAttribute Employee ee)
	{
		hs.saveEmployee(ee);
		
		return "login";
	}
	
	@RequestMapping("/login")
	public String logincheck(@RequestParam("username")String un,@RequestParam("password")String ps,Model m )
	{
		
		 System.out.println(un);
		 System.out.println(ps);
		
		 Employee emp= hs.logincheck(un,ps);
		 
		 if(emp!=null)
		 {
			 Iterable List= hs.getalldata();
		     System.out.println(List);
		
		      m.addAttribute("ruturaj",List);
		
		    return "success";
		 }
		 else
		 {
			 m.addAttribute("msg", "please check Username and password again and enter.....!");
			 return "login";
		 }
	}
	
	
	
	
	
}
