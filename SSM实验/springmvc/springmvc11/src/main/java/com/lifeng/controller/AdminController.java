package com.lifeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {	
	@RequestMapping("/login")
	public String login(){
		return "loginAdmin";
	}	
	@RequestMapping("/register")
	public String register(){
		return "registerAdmin";
	}
}
