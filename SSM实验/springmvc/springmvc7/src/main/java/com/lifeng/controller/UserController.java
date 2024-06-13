package com.lifeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/login")
	public String login(){
		return "login";
	}	
	
	@RequestMapping("/register")
	public String register(){
		return "register";
	}
	
	//采用了表单和控制器名不一样的写法
	@RequestMapping("/dologin")
	public ModelAndView doLogin(@RequestParam("username") String uname, 
			@RequestParam("password") String pwd){
		ModelAndView mv=new ModelAndView();
		if(uname.equals("admin")&&pwd.equals("123")){
			mv.setViewName("success");
			mv.addObject("user","admin");
		}else{
			mv.setViewName("fail");
		}
		return mv;		
	}
}
