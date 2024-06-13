package com.lifeng.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lifeng.service.RegisterService;  

public class TestRegister {
  
  public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	RegisterService regService11 = (RegisterService) context.getBean("regService1");
		RegisterService regService12 = (RegisterService) context.getBean("regService1");
		System.out.println("regService11 与 regService12 是同一个对象：" + (regService11 == regService12));

	RegisterService regService21 = (RegisterService) context.getBean("regService2");
	RegisterService regService22 = (RegisterService) context.getBean("regService2");
	System.out.println("regService21 与 regService22 是同一个对象：" + (regService21 == regService22));
  }
}