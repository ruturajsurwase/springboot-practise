package com.cjc.webapp.crud.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.webapp.crud.main.model.AirIndia;


@Repository
public interface AirIndiaRepository extends CrudRepository<AirIndia,Integer>
{

	public List findByFromlocationAndTolocation(String fromlocation,String tolocation);
	
	
}
