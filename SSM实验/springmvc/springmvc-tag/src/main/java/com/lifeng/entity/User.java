package com.lifeng.entity;

import java.util.List;

public class User {
	int id;
	String username;
	String password;
	boolean gender;
	String married;
	int age;
	List<String> myInteresting;
	String city;
	String graduated;
	String description;
	
	public User(){
	}

	public User(int id,String username, String password, boolean gender, String married, int age, List<String> myInteresting,
			String city, String graduated, String description) {
		super();
		this.id=id;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.married = married;
		this.age = age;
		this.myInteresting = myInteresting;
		this.city = city;
		this.graduated = graduated;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getMyInteresting() {
		return myInteresting;
	}

	public void setMyInteresting(List<String> myInteresting) {
		this.myInteresting = myInteresting;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGraduated() {
		return graduated;
	}

	public void setGraduated(String graduated) {
		this.graduated = graduated;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
