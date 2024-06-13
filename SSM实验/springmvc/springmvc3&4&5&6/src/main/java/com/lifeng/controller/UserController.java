package com.lifeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
	/*
	 * 实验6的通配符测试
	 * @RequestMapping(value = "/通配符星号/login", method = RequestMethod.GET)
	 */
	 
	//实验5的限定测试
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	//@RequestMapping("/login")
	public String login(){
		return "login";
	}	
	
	@RequestMapping("/register")
	public String register(){
		return "register";
	}
}
