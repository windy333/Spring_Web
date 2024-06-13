package com.lifeng.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

public class LoggerBefore implements MethodBeforeAdvice{
	private static final Logger log = Logger.getLogger(LoggerBefore.class);
	
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		log.info("开始添加学生");
	}
	
}
