package com.cjc.webapp.crud.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebServiceMmtappApplication 
{
   
	
	public static void main(String[] args) 
	{
		  System.out.println("this is MMT");
		SpringApplication.run(WebServiceMmtappApplication.class, args);
	}
	
	@Bean
	public RestTemplate getrt()
	{
		return new RestTemplate();
	}
	
}
