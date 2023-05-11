package com.cjc.webapp.crud.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.webapp.crud.main.model.Course;
import com.cjc.webapp.crud.main.model.Student;
import com.cjc.webapp.crud.main.repository.CourseRepository;
import com.cjc.webapp.crud.main.repository.StudentRepository;
import com.cjc.webapp.crud.main.service.ServiceInterface;

@Service
public class HomeService implements ServiceInterface
{

	   @Autowired
	  StudentRepository sr;
	   
	   @Autowired
	   CourseRepository  cr;
	
	@Override
	public void saveStudentdata(Student s) 
	{
		
		sr.save(s);
	}

	@Override
	public void addcourse(Course cc)
	{
	   cr.save(cc);
		
	}
	
    @Override
	public Course getCourseInfo(int cid) 
	{
		 
		return cr.findAllByCid(cid);
	}

	@Override
	public Iterable<Student> getStudendata() 
	{
	      Iterable<Student> st = sr.findAll();
		
	        return st;
	}
	
	
	
}
