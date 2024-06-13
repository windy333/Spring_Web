package com.lifeng.entity;

public class User {
 private String uid;
 private String uname;
 private String gender;
 private int age;
 private Company company;
 
public Company getCompany() {
	return company;
}

public void setCompany(Company company) {
	this.company = company;
}

public User() {}

public User(String uname, String gender, int age) {
	this.uname = uname;
	this.gender = gender;
	this.age = age;
}

public User(String uid, String uname, String gender, int age) {
	this.uid = uid;
	this.uname = uname;
	this.gender = gender;
	this.age = age;
}

public void show() {
	System.out.println("用户编号: "+uid+" 用户姓名: "+uname+" 性别: "+gender+" 年龄: "+age);
}

public String getUid() {
	return uid;
}

public void setUid(String uid) {
	this.uid = uid;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


 
 
}
