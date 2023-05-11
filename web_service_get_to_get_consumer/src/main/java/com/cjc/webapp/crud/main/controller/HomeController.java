package com.cjc.webapp.crud.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController 
{
	@Autowired
	RestTemplate getrt;
	
	
	@RequestMapping("/getConsumerData")
	public List getdatafromconsumer()
	{
		
		  String url="http://localhost:9095/getdata";
		  
		   List al = getrt.getForObject(url,List.class);
		
		return al;
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
