package com.lifeng.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lifeng.entity.User;

public class TestUser2 {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user3= (User) context.getBean("user3");
		user3.show();
		User user4= (User) context.getBean("user4");
		user4.show();
		
	}
}
