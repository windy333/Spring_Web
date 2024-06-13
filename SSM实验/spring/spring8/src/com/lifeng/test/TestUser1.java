package com.lifeng.test;
/*懒得写错误测试和环绕通知了*/
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
