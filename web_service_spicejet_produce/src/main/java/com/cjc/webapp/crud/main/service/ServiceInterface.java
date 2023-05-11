package com.cjc.webapp.crud.main.service;





import java.util.List;


import com.cjc.webapp.crud.main.model.Spicejet;


public interface ServiceInterface 
{
    public void saveflights(Spicejet sj);
	
	public Iterable<Spicejet> getallflight();
	
     public	List getflights(String fromlocation,String tolocationj);
	
}
