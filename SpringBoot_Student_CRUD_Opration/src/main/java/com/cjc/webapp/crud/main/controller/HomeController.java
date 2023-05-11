package com.cjc.webapp.crud.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.webapp.crud.main.model.Course;
import com.cjc.webapp.crud.main.model.Student;
import com.cjc.webapp.crud.main.serviceimpl.HomeService;

@Controller
public class HomeController
{
	@Autowired
	HomeService hs;
	
	
	@RequestMapping("/")
	public String courseinfo()
	{
		return "login";
	}
	
	@RequestMapping("/courseaddpage")
	public String course()
	{
		return "courseinfo";
	}
	
	@RequestMapping("/showstudentinfopage")
	public String student()
	{
		return"studentinfo";
	}
	
	@RequestMapping("/addcourse")
	public String addcourse(@ModelAttribute ("course") Course cc)
	{
		      hs.addcourse(cc);
		   
		     return "login";
	}
	
	@RequestMapping("/registerStudent")
	public String saveStudentdata(@ModelAttribute ("student") Student s,@RequestParam("fav_course") int cid)
	{
	    Course stuCourse =hs.getCourseInfo(cid);
	    s.setCourse(stuCourse);
	     hs.saveStudentdata(s);
	       
	     return "success";
	}	
	@RequestMapping("/showallStudentinfo")
	public String showStudentdata(Model m)
	{
	        	
		Iterable<Student> st=hs.getStudendata();
		
	     m.addAttribute("ruturaj", st);
		return "success";
	}
	
	
	
	
	
	
	
	
}
