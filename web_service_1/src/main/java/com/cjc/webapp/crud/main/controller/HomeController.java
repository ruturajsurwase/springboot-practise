package com.cjc.webapp.crud.main.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.webapp.crud.main.model.Employee;

@RestController
public class HomeController 
{
	 List<Employee> elist=new ArrayList<>();
	
	 Employee e1=new Employee();
	 Employee e2=new Employee();
	  Employee e3=new Employee();
	  
	@RequestMapping("/")
	public List<Employee> listofemployee()
	{
		
		      e1.setEid(1);
		      e1.setName("ruturaj");
		      e1.setDept("java");
		      e1.setSalary(10000);
		      
		      elist.add(e1);
		      
		
	            e2.setEid(2);
		       e2.setName("pratik");
		       e2.setDept("python");
		       e2.setSalary(5000);
		       elist.add(e2);
		
		
		
		          e3.setEid(3);
		          e3.setName("shreehari");
		          e3.setDept("scientist");
		          e3.setSalary(12000000);
		          elist.add(e3);
		          
		 
   //Collections.sort(elist,(o,o1)->(int)(o1.getSalary()-(int)o.getSalary()));   //collecrtion.sort
		          
   //List<Employee> e2list=elist.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).toList();          
		          
	//elist.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);	
	
		          
	/*
	 * Collections.sort(elist, new Comparator<Employee>() {
	 * 
	 * @Override public int compare(Employee o1, Employee o2) { // TODO
	 * Auto-generated method stub return (int)(o2.getSalary()-o1.getSalary()); }
	 * 
	 * });
	 */ 
		          
		          
		          
		 return elist ;
	}
	
	/*
	 * @RequestMapping("/sortbysalary") public Set<Employee> sortbysalary() {
	 * Comparator<Employee> c=(Employee o,Employee
	 * o1)->(int)o1.getSalary()-(int)o.getSalary();
	 * 
	 * Set<Employee> set=new TreeSet<>(c); set.add(e1); set.add(e2); set.add(e3);
	 * return set;
	 * 
	 * }
	 */

}
