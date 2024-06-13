package com.lifeng.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class LoggerAfterReturning implements AfterReturningAdvice {
	private static final Logger log = Logger.getLogger(LoggerAfterReturning.class);

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		log.info("完成添加学生");
	}
	
}
