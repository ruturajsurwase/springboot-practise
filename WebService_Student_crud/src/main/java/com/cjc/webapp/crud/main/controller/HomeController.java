package com.cjc.webapp.crud.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;


import org.springframework.web.bind.annotation.RestController;

import com.cjc.webapp.crud.main.model.Student;
import com.cjc.webapp.crud.main.serviceImpl.HomeService;

@CrossOrigin
@RestController
public class HomeController
{
  @Autowired
  HomeService hs;
  
  @GetMapping(value="/showalldata")
	public Iterable showallStudentdata()
	{
		   Iterable List= hs.displayAllData();
		   
		
		   return List;
	}
	
	@PostMapping(value="/saveStudentdata")
	public String savedata(@RequestBody Student stu)
	{
		
		System.out.println(stu.getUid());
		System.out.println(stu.getUname());
		System.out.println(stu.getName());
		System.out.println(stu.getPassword());
		System.out.println(stu.getMobileno());
		
		  hs.savedata(stu);
		  
		return "student saved";
	}
	
    @GetMapping(value="/login/{uname}/{password}")
	public Iterable logincheck(@PathVariable ("uname") String un,@PathVariable ("password") String ps)
	{
		System.out.println(un);
		System.out.println(ps);
		
	    Student student= hs.logincheck(un,ps);
		   //System.out.println(student);
		   
		   Iterable List= hs.displayAllData();
		   
		   if(student!=null)
		   {
			return List;
		   }
		   else
		   {
			   return null;
		   }
    }
    
    @DeleteMapping("/delete/{uid}")
    public Iterable deleteinfo(@PathVariable("uid") int uid )
    {
    	    hs.deleteStudentinfo(uid);
    	    
    	  Iterable List= hs.displayAllData();
    	  
    	   return List;
    }
   
   @GetMapping("/edit/{uid}")
   public Student editStudent(@PathVariable("uid") int uid)
   {
	      Student st= hs.editStudentinfo(uid);
             
                 return st;
   }
   
    @PatchMapping("/update")
    public String update(@RequestBody Student stu)
    {
    	    hs.savedata(stu);
    	
    	 Iterable List= hs.displayAllData();
 
    	return "successully updated";
   }
    
    
}
