package com.lifeng.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mycompany")
public class Company {
	private int id;
	@Value("黄冈师范")
	private String companyname;
	@Value("黄州区")
	private String address;
	
	
	@Override
	public String toString() {
		return "Company [companyname=" + companyname + ", address=" + address + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
