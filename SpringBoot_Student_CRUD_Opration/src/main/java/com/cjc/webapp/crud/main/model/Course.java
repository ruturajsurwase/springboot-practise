package com.cjc.webapp.crud.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course
{
    @Id
	private int cid;
    private String  cname;
    private double fees;
    
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	
}
