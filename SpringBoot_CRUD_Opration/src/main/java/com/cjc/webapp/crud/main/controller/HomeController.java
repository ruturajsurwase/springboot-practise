package com.cjc.webapp.crud.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.webapp.crud.main.model.Student;
import com.cjc.webapp.crud.main.serviceImpl.HomeService;

@Controller
public class HomeController
{
  @Autowired
  HomeService hs;
  
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping("/registration")
	public String registration()
	{
		return "register";
		
	}
	
	@RequestMapping("/register")
	public String savedata(@ModelAttribute Student stu)
	{
		  hs.savedata(stu);
		  
		return "login";
	}
	
    @RequestMapping("/login")
	public String logincheck(@RequestParam ("uname") String un,@RequestParam ("password") String ps,Model m )
	{
		System.out.println(un);
		System.out.println(ps);
		
	    Student student= hs.logincheck(un,ps);
		   System.out.println(student);
		   
		   Iterable List= hs.displayAllData();
		   
		   if(student!=null)
		   {
			   m.addAttribute("Student",List);
			   return "success";
		    }
		   else
		   {
			   return "login";
		   }
    }
    
    @RequestMapping("/delete")
    public String deleteinfo(@RequestParam("uid") int uid ,Model m)
    {
    	    hs.deleteStudentinfo(uid);
    	    
    	    Iterable List= hs.displayAllData();
    	    m.addAttribute("Student",List);
		   
		   return "success";
    }
   
    @RequestMapping("/edit")
   public String editStudent(@RequestParam("uid") int uid,Model m)
   {
	      Student st= hs.editStudentinfo(uid);
              m.addAttribute("Student", st);
                 return "edit";
   }
   
    @RequestMapping("/update")
    public String update(@ModelAttribute Student stu,Model m)
    {
    	    hs.savedata(stu);
    	
    	 Iterable List= hs.displayAllData();
  	    m.addAttribute("Student",List);
    	return "success";
   }
    
    
}
