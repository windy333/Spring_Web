package com.lifeng.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lifeng.entity.User;

public class TestUser5 {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user7 = (User) context.getBean("user7");
        user7.show();
        System.out.println("company:\n"+user7.getCompany());
    }
}
