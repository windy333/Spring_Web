package com.lifeng.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FirstController implements Controller{	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.addObject("hello", "Hello SpringMVC!!!");
		/* 下面要设置正确的映射，版本不一样，别跟着书上做*/
		mv.setViewName("welcome");
		return mv;
	}
}
