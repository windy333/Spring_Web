package com.lifeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lifeng.entity.User;

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
	
	@RequestMapping("/dologin")
	public String doLogin(User user){
		if(user.getUsername().equals("admin")
				&&user.getPassword().equals("123")){
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
			return "success";
		}
		return "login";		
	}
	
	@RequestMapping("/doregister")
	public ModelAndView doRegister(User user) {
		ModelAndView mv =new ModelAndView();
		mv.setViewName("regsuccess");
		mv.addObject("user",user);
		//System.out.println(user.getAddress().getCountry());
		//System.out.println(user.getAddress().getCity());
		return mv;
	}
	

	@RequestMapping("/{username}/{id}/user")
	public ModelAndView doUser(@PathVariable String username, @PathVariable String id){	
		ModelAndView mv=new ModelAndView();
		mv.setViewName("success");
		System.out.println(username);
		System.out.println(id);		
		return mv;		
	}


}
