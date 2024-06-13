package com.lifeng.controller;

import javax.servlet.http.HttpServletRequest;

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
	public ModelAndView doLogin(HttpServletRequest request){
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		ModelAndView mv=new ModelAndView();
		if(username.equals("张三")&&password.equals("123")){
			mv.setViewName("success");
			mv.addObject("user","张三");
		}else{
			mv.setViewName("fail");
		}
		return mv;	
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

	@RequestMapping("/interest")
	public String interest() {
		return "interest";
	}
	
	@RequestMapping("/dointerest")
	public String dointerest(String[] myinterest) {
		for(String interest:myinterest) {
			System.out.println(interest+" ");
		}
		return "interest";
	}
	
}
