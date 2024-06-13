package com.lifeng.entity;

public class User {
	private String uid;
	private String uname;
	private String gender;
	private int age;
	
	public User() {
		/*
		 * 默认的构造方法，不要删除...一言难尽 
		 * Exception in thread "main"
		 * org.springframework.beans.BeanInstantiationException: Failed to instantiate
		 * [com.lifeng.entity.User]: No default constructor found; nested exception is
		 * java.lang.NoSuchMethodException: com.lifeng.entity.User.<init>()
		 */
	}

	public User(String uid, String uname, String gender, int age) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.gender = gender;
		this.age = age;
	}

	public void show() {
		System.out.println("UID\tName\tGender\tAge");
		System.out.println(uid + "\t" + uname + "\t" + gender + "\t" + age);
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
