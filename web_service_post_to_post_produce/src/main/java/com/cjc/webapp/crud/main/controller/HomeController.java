package com.cjc.webapp.crud.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.webapp.crud.main.model.Student;


@RestController
public class HomeController 
{

	
	
	
	@RequestMapping(value="/postproducedata",method=RequestMethod.POST)
	public String postdatafromproduce(@RequestBody Student s)
	{
		System.out.println(s.getName());
		System.out.println(s.getRollno());
		
		
		return "Success";
		
	}
	
	
	
	
	
	
}
