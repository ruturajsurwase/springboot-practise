package com.cjc.webapp.crud.main.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.webapp.crud.main.model.AirIndia;
import com.cjc.webapp.crud.main.model.Spicejet;



@RestController
public class MMTController
{
	@Autowired
	RestTemplate getrt;
	
     @GetMapping("/seeallflightesavailable")
	public List allflights()
	{
		String airindiaurl="http://localhost:9091/getallflightsofairindia";
		
		String spicejeturl="http://localhost:9092/getallflightsofspicejet";
		
		List  listofairinida= getrt.getForObject(airindiaurl, List.class);
		List listofspicejet = getrt.getForObject(spicejeturl, List.class);
		
		List totalflights=new ArrayList<>();
		totalflights.add(listofairinida);
		totalflights.add(listofspicejet);
		
		return totalflights;
	}
     
     @GetMapping("/getairindiaflights/{fromlocation}/{tolocation}")
     public List getflights(@PathVariable String fromlocation,@PathVariable String tolocation)
     {
    	 String airindiaurl="http://localhost:9091/getflights/"+fromlocation+"/"+tolocation+"";
    	 
    	 String spicejeturl="http://localhost:9092/getflights/"+fromlocation+"/"+tolocation+"";
    	 
    	  List airindialist = getrt.getForObject(airindiaurl,List.class);
    	  List spicejetlist = getrt.getForObject(spicejeturl,List.class);
    	  
    	  List totallist=new ArrayList<>();
    	    totallist.add(airindialist );
    	    totallist.add(spicejetlist);
    	 
		return totallist;
    }
     
     @GetMapping("/onlyairindiaflights")
     public List onlyairindiaflights()
     {
    	 String airindiaurl="http://localhost:9091/getallflightsofairindia";
    	 List  listofairinida= getrt.getForObject(airindiaurl, List.class);
    	 return listofairinida;
     }
     
     @GetMapping("/onlyspicejetflights")
     public List onlyaspicejetflights()
     {
    	 String spicejetaurl="http://localhost:9092/getallflightsofspicejet";
    	 List  listofspicejet= getrt.getForObject(spicejetaurl, List.class);
    	 return listofspicejet;
     }
     
     
     @PostMapping("/addflightsto_airindia_from_mmt")
     public String addflightstoairindia(@RequestBody AirIndia ai)
     {
    	 String aiurl="http://localhost:9091/add_air_india_flights_data";
    			
    	   String  s= getrt.postForObject(aiurl,ai,String.class);
    			 
		return s;
    	 
     }
     
     @PostMapping("/addflightsto_spicejet_from_mmt")
     public String addflightstospicejet(@RequestBody Spicejet sj)
     {
    	 String sjurl="http://localhost:9092/add_spicejet_flights_data";
    			
    	   String s= getrt.postForObject(sjurl,sj,String.class);
    			 
		return s;
    	 
     }
     
     
}
