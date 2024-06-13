package com.lifeng.aop;

import org.apache.log4j.Logger;

public class MyLogger {
	private static final Logger log=Logger.getLogger(MyLogger.class);		
	public void beforeMethod(){
		log.info("开始执行方法....");
	}		
	public void afterMethod(){
		log.info("完成执行方法....");
	}
}
