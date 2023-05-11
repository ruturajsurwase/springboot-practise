package com.cjc.webapp.crud.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.cjc.webapp.crud.main.model.Spicejet;


@Repository
public interface Spicejetrepository extends CrudRepository<Spicejet,Integer>
{

    public List findByFromlocationAndTolocation(String fromlocation,String tolocation);
		
}
