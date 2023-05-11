package com.cjc.webapp.crud.main.serviceimpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.webapp.crud.main.model.AirIndia;
import com.cjc.webapp.crud.main.repository.AirIndiaRepository;

import com.cjc.webapp.crud.main.service.ServiceInterface;

@Service
public class HomeService implements ServiceInterface
{
  @Autowired
  AirIndiaRepository air;
	
	@Override
	public void saveflights(AirIndia ai) 
	{
		air.save(ai);
	}

    @Override
	public  Iterable<AirIndia> getallflight()
	{
        return air.findAll();
	}

    @Override
	public List getflights(String fromlocation, String tolocationj) 
	{
		return air.findByFromlocationAndTolocation(fromlocation, tolocationj);
	}

}
