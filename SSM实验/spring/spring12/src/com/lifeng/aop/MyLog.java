package com.lifeng.aop;

/*用注解的形式自动配置，不需要在xml中繁琐的配置*/

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyLog {
	private static final Logger log=Logger.getLogger(MyLog.class);		
	@Before("execution(* com.lifeng.service.UserService.addUser())")
	public void beforeMethod(){
		log.info("开始执行方法....");
	}	
	@AfterReturning("execution(* com.lifeng.service.UserService.addUser())")
	public void afterMethod(){
		log.info("完成执行方法....");
	}
}


