package com.cjc.webapp.crud.main.service;

import com.cjc.webapp.crud.main.model.Course;
import com.cjc.webapp.crud.main.model.Student;

public interface ServiceInterface
{

	
	public void saveStudentdata(Student s);
	
	public void addcourse(Course cc);
	
	public Course getCourseInfo(int cid) ;
	
	public Iterable<Student>  getStudendata();
	
	
	
	
	
	
	
	
	
}
