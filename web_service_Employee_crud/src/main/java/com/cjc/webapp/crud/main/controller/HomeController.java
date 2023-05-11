package com.cjc.webapp.crud.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.webapp.crud.main.model.Employee;
import com.cjc.webapp.crud.main.serviceimpl.HomeService;

@RestController
public class HomeController 
{   @Autowired
    HomeService hs;
	
    
   @GetMapping("/showdata")
   public Iterable showdata()
     {
         Iterable elist=hs.showallEmployee(); 
            
            return elist;
     }

  @PutMapping("/save")
	public Employee saveemployee(@RequestBody Employee emp)
	{
		 Employee e=hs.savadata(emp);
	     return e;
	}
	
	
	
	
	
	
}
