package com.lifeng.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lifeng.dao.UserDao;
import com.lifeng.entity.User;
import com.lifeng.service.UserService;

public class TestUser1 {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao =(UserDao) context.getBean("userDao");
		
		//System.out.println("------创建用户数据表-------");
		userDao.create();
		
		//System.out.println("------添加用户-------");
		User user1=new User("1","上善若水","Boy",20);
		userDao.add(user1);
		User user2=new User("2","爱丽丝","Girl",18);
		userDao.add(user2);
		User user3=new User("3","Coco","Girl",18);
		userDao.add(user3);
		
		System.out.println("------查找所有用户-------");
		List<User> list =userDao.findAllUsers();
		for(User u:list) {
			u.show();
		}
		
		System.out.println("\n"+"------查找指定用户-------");
		User foundUser = userDao.findUserById(2);
		if (foundUser != null) {
		    System.out.println("找到用户：" + foundUser.getUname());
		} else {
		    System.out.println("未找到用户！");
		}
		
		
		System.out.println("\n"+"------更新用户信息-------");
		User userToUpdate = userDao.findUserById(1);
		if (userToUpdate != null) {
		    userToUpdate.setUname("Admin");
		    userToUpdate.setAge(22);
		    userDao.update(userToUpdate);
		    System.out.println("用户信息已更新！");
		} else {
		    System.out.println("未找到需要更新的用户！");
		}

		System.out.println("\n"+"------删除用户-------");
		User userToDelete = userDao.findUserById(3);
		if (userToDelete != null) {
		    userDao.delete(userToDelete.getUid());
		    System.out.println("用户已删除！");
		} else {
		    System.out.println("未找到需要删除的用户！");
		}
		
		System.out.println("\n"+"------查找所有用户-------");
		List<User> list1 =userDao.findAllUsers();
		for(User u:list1) {
			u.show();
		}
		
		
	}
}
