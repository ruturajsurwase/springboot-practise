package com.cjc.webapp.crud.main.service;

import com.cjc.webapp.crud.main.model.Employee;

public interface ServiceInterface
{

	
	
public void saveEmployee(Employee ee);
	
public Iterable getalldata();

public Employee logincheck(String un,String ps);

}
