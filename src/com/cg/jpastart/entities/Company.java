package com.cg.jpastart.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	private int companyID;
	private String name;
	
	public int getCompanyID() {
		return companyID;
	}
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	


}
