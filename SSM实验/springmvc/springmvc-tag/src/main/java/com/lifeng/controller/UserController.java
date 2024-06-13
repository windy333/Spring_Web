package com.lifeng.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lifeng.entity.User;
import com.lifeng.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/list")
	public ModelAndView list() {
		UserService userService=new UserService();
		List<User> users=userService.getUsers();
		ModelAndView mv=new ModelAndView();
		mv.addObject("users",users);
		mv.setViewName("list");
		return mv;
	}
	
	@RequestMapping("/detail/{id}")
	public ModelAndView detail(@PathVariable int id) {
		List<String> allInteresting = new ArrayList<String>();
		allInteresting.add("美食");
		allInteresting.add("音乐");
		allInteresting.add("旅行");
		
		List<String> cities = new ArrayList<String>();
		cities.add("北京");
		cities.add("广州");
		cities.add("深圳");
		
		List<String> graduates=new ArrayList<String>();
		graduates.add("本科");
		graduates.add("硕士");
		graduates.add("博士");
		
		UserService userService = new UserService();
		User user = userService.getUserById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("allInteresting",allInteresting);
		mv.addObject("cities", cities);
		mv.addObject("user", user);
		mv.addObject("graduates",graduates);
		mv.setViewName("detail");
		return mv;
	}
	
}
