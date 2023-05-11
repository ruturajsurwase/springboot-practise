package com.cjc.webapp.crud.main.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cjc.webapp.crud.main.model.Student;

@RestController
public class HomeController 
{
	
	
	@RequestMapping("/getdata")
	public List  getStudentdata()
	{
		Student s1=new Student();
		      s1.setName("ruturaj");
		      s1.setRollno(101);
		      
		  Student s2=new Student();
		      s2.setName("pratik");
		      s2.setRollno(202);
		
		    List al=new ArrayList();
		       al.add(s1) ;
		       al.add(s2);
		       
		return al;
	}
	
}
