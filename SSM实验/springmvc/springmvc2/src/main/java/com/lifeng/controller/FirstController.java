package com.lifeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController{
	//加个.do真是特别反人类的设计，还是springboot好
	@RequestMapping("/hello")
	public ModelAndView doHello() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "My First Annotation SPringMVC!!!");
		mv.setViewName("welcome");
		return mv;
	}	
}
