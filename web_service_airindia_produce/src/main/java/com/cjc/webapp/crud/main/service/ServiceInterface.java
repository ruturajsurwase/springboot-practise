package com.cjc.webapp.crud.main.service;





import java.util.List;

import com.cjc.webapp.crud.main.model.AirIndia;


public interface ServiceInterface 
{

	
	public void saveflights(AirIndia ai);
	
	public Iterable<AirIndia> getallflight();
	
     public	List getflights(String fromlocation,String tolocationj);
	
}
