package com.lifeng.service;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import com.lifeng.dao.UserDao;

@Component("userService")
public class UserService {	
	public UserService(){		
	}
	public void save(String uame){
		System.out.println("向数据库中保存用户信息....");
	}	
	public void update(String uid,String uame,String gender,int age){
		System.out.println("向数据库中修改用户信息....");
	}	
	public String delete(){
		System.out.println("向数据库中删除用户 信息....");
		return "删除成功返回success";
	}	
	public void methodThrow(){
		Integer.parseInt("抛出异常错误测试");
	}
}	
