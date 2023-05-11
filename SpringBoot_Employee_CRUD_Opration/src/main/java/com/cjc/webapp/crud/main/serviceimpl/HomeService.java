package com.cjc.webapp.crud.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.webapp.crud.main.model.Employee;
import com.cjc.webapp.crud.main.repository.HomeRepository;
import com.cjc.webapp.crud.main.service.ServiceInterface;

@Service
public class HomeService implements ServiceInterface
{
      @Autowired
	  HomeRepository hr;
	 
	
	@Override
	public void saveEmployee(Employee ee)
	{
		 hr.save(ee);
		
	}


	@Override
	public Iterable getalldata()
	{
		
		return hr.findAll();
	}


	@Override
	public Employee logincheck(String un, String ps) 
	{
		
		return hr.findAllByUsernameAndPassword(un, ps);
	}





}
