package com.lifeng.entity;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("user")
public class User {
	@Value("1")
 private String uid;
	@Value("上善若水")
 private String uname;
	@Value("男")
 private String gender;
	@Value("18")
 private int age;

	@Resource
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
