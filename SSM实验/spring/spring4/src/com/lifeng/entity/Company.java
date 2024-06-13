package com.lifeng.entity;

public class Company {
	private int id;
	private String companyname;
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
