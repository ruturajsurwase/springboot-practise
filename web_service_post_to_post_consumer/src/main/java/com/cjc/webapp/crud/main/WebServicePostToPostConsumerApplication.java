package com.cjc.webapp.crud.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebServicePostToPostConsumerApplication 
{

	public static void main(String[] args) 
	{
		
		System.out.println("this is post to post Consumer");
		SpringApplication.run(WebServicePostToPostConsumerApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate prt()
	{
		  RestTemplate rt=new RestTemplate();
		    
		    return rt; 
	}

}
