package com.lifeng.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lifeng.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	
	@RequestMapping("/doregister")
	public ModelAndView doRegister(User user) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		// 修改注释完成实验18的请求转发实验 mv.setViewName("forward:/WEB-INF/jsp/info.jsp"); 
		mv.setViewName("forward:second");
		return mv;
	}

	// 实验19

	/*
	 * @RequestMapping("/doregister") public String doRegister(User user,
	 * HttpServletRequest request) { request.setAttribute("user", user); return
	 * "forward:/WEB-INF/jsp/info.jsp"; }
	 */

	@RequestMapping("/second")
	public ModelAndView doSecond(User user) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("forward:/WEB-INF/jsp/info.jsp");
		return mv;
	}

}
