package com.lifeng.dao;

import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao{

	@Override
	public void show() {
		System.out.println("用户姓名:上善若水，所在地区：黄州区");
	}

	@Override
	public void addUser() {
		System.out.println("新增用户到数据库中");
	}
	
}