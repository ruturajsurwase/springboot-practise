package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Homecontroller 
{
    @RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
    
    @RequestMapping("/log")
    public String login(@RequestParam String username,@RequestParam String password)
    {
    	System.out.println("username="+username);
    	System.out.println("password="+password);
    	
    	return"success";
    }
    
    @RequestMapping("/registerPage")
    public String registerPage()
    {
		return "register" ;
    	
    }
    
    @RequestMapping("/registrationdone")
    public String registerStudent()
    {
		return "login";
    	
    }
	
	
	
	
	
}
