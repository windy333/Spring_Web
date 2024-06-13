package com.lifeng.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lifeng.entity.User;

public class TestUser4 {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user6 = (User) context.getBean("user6");
        user6.show();
        System.out.println("company:\n"+user6.getCompany());
    }
}
