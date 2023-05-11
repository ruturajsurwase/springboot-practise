package com.cjc.webapp.crud.main.service;

import com.cjc.webapp.crud.main.model.Student;

public interface ServiceInterface 
{

	public void savedata(Student stu);
	
	public Student logincheck(String un, String ps);
	
	  public Iterable displayAllData();
	  
	  public void deleteStudentinfo(int uid);
	  
	  public Student editStudentinfo(int uid);
	  
}
