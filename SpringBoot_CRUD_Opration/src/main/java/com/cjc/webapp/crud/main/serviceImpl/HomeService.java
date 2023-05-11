package com.cjc.webapp.crud.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.webapp.crud.main.model.Student;
import com.cjc.webapp.crud.main.repository.HomeRepository;
import com.cjc.webapp.crud.main.service.ServiceInterface;

@Service
public class HomeService implements ServiceInterface
{
	  @Autowired
	  HomeRepository hr;

    @Override
	public void savedata(Student stu)
	{
		hr.save(stu);
		
	}
	
    @Override
	public Student logincheck(String un,String ps) 
	{
	
		   return hr.findAllByUnameAndPassword(un,ps);   
	}

    @Override
	public Iterable displayAllData() 
	{
		return hr.findAll();
		
	}
	
    @Override
	public void  deleteStudentinfo(int uid)
	{
	
    	hr.deleteById(uid);

	}

	@Override
	public Student editStudentinfo(int uid) 
	{
		
		return hr.findAllByUid(uid);
		
	}


	
	

	
}
