package com.lifeng.service;

import java.util.ArrayList;
import java.util.List;

import com.lifeng.entity.User;

public class UserService {
	List<User> users= new ArrayList<User>(); 
	public List<User> getUsers(){
		int id=1;
		String username="admin";
		String password="123";
		boolean gender=true;
		String married="是";
		int age=18;
		List<String> myInteresting=new ArrayList<String>();
		myInteresting.add("音乐");
		myInteresting.add("旅行");
		myInteresting.add("美食");
		String city="深圳";
		String graduated="博士";
		String description=username+"的个人简介";
		
		User user1=new User(id,username,password,gender,married,age,
				myInteresting,city,graduated,description);
		
		users.add(user1);
		return users;
	}
	
	public User getUserById(int id) {
		users=getUsers();
		return users.get(id-1);
	}
 }
