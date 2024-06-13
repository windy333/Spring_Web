package com.lifeng.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lifeng.entity.User;

public class TestUser1 {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user1= (User) context.getBean("user1");
		user1.show();
		User user2= (User) context.getBean("user2");
		user2.show();
		
	}

}
