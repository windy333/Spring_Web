package com.lifeng.entity;

public class Student {
	private String sid;
	private String sname;
	private String sex;
	private int age;
	
	public void show(){
		System.out.println("ID:"+sid+"  姓名:"+sname+"  性别:"+sex+"   年龄:"+age);
	}
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
