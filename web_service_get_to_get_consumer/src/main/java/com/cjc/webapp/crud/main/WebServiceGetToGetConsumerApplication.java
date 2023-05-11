package com.cjc.webapp.crud.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebServiceGetToGetConsumerApplication 
{

	public static void main(String[] args) 
	{
		
		System.out.println("this is get to get consumer ");
		
		SpringApplication.run(WebServiceGetToGetConsumerApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate  getrt()
	{
		  RestTemplate rt=new RestTemplate();
		  
		   return rt;
	}

}
