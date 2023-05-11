package com.cjc.webapp.crud.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.webapp.crud.main.model.Student;

@RestController
public class HomeController 
{

	@Autowired
	RestTemplate prt;
	
	@RequestMapping(value="/postdata",method=RequestMethod.POST)
	public String getproducedata(@RequestBody Student s)
	{
		System.out.println(s.getName());
		System.out.println(s.getRollno());
		
	  String url="http://localhost:9095/postproducedata";	
		 String msg= prt.postForObject(url,s, String.class);
		 
		 return msg;
    }
	
	
}
