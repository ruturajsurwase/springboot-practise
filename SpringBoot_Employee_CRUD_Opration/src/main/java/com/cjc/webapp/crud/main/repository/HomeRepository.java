package com.cjc.webapp.crud.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.webapp.crud.main.model.Employee;



@Repository
public interface HomeRepository extends CrudRepository<Employee,Integer>
{
	public Employee findAllByUsernameAndPassword(String un,String ps);
	
	

	
	
	
	
	
}
