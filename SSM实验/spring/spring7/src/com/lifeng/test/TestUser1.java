package com.lifeng.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lifeng.entity.User;
import com.lifeng.service.UserService;

public class TestUser1 {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService =(UserService) context.getBean("userService");
		userService.addUser();
		
	}
}
