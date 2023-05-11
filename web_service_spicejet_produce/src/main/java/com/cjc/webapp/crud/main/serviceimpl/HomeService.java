package com.cjc.webapp.crud.main.serviceimpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cjc.webapp.crud.main.model.Spicejet;

import com.cjc.webapp.crud.main.repository.Spicejetrepository;
import com.cjc.webapp.crud.main.service.ServiceInterface;

@Service
public class HomeService implements ServiceInterface
{
  @Autowired
  Spicejetrepository  sjr;
	
	
	@Override
	public void saveflights(Spicejet ai) 
	{
		sjr.save(ai);
	}
	@Override
	public  Iterable<Spicejet> getallflight()
	{
		
			 return sjr.findAll();
	}

	@Override
	public List getflights(String fromlocation, String tolocationj) 
	{
		return sjr.findByFromlocationAndTolocation(fromlocation, tolocationj);
		
	}

}
