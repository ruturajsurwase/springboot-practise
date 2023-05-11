package com.cjc.webapp.crud.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.webapp.crud.main.model.AirIndia;
import com.cjc.webapp.crud.main.serviceimpl.HomeService;

@RestController
public class HomeController 
{
	@Autowired
	HomeService hs;

	
	@RequestMapping(value="/add_air_india_flights_data",method=RequestMethod.POST)
	public String addflightsdata(@RequestBody AirIndia ai)
	{
		hs.saveflights(ai);
		
		return "AIR INDIA FLIGHT ADDED........";
	}
	
	@RequestMapping(value="/getallflightsofairindia",method=RequestMethod.GET)
	public Iterable<AirIndia> getaaflights()
	{
       return hs.getallflight();
    }
	
	@GetMapping("/getflights/{fromlocation}/{tolocation}")
	public List getflight(@PathVariable("fromlocation") String fromlocation,@PathVariable("tolocation") String tolocation)
	{
		
		System.out.println(fromlocation);
		System.out.println(tolocation);
		
	List flist= hs.getflights(fromlocation,tolocation);
		    
		return flist;
    }
	
}

	
	
	
	
	

