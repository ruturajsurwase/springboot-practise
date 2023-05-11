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
	public Employee savadata(Employee emp) 
	{
		 
		   return hr.save(emp);
	}

	@Override
	public Iterable showallEmployee() 
	{
		  Iterable elist = hr.findAll();
		  
		return elist;
	}

}
