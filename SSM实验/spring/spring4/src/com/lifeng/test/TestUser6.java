package com.lifeng.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lifeng.entity.User;

public class TestUser6 {
	public static void main(String[] args) {
		//这里注释掉了xml配置中id=company的配置，否则ByType会有歧义
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user8 = (User) context.getBean("user8");
        user8.show();
        System.out.println("company:\n"+user8.getCompany());
    }
}
