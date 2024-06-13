package com.lifeng.service;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import com.lifeng.dao.UserDao;

@Component("userService")
public class UserService {
	@Resource(name="userDao")
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao=userDao;
		
	}
	
	public void addUser() {
		//log.info("开始添加用户~");
		userDao.addUser();
		//log.info("开始添加用户~");
	}
	
	public void show() {
		userDao.show();	
	}
}
