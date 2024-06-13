package com.lifeng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContet.xml");
		
		Login login=(Login) context.getBean("login");
		
		login.show();

	}}
