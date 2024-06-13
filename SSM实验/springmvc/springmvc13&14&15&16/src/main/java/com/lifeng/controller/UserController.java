package com.lifeng.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lifeng.entity.User;
import com.mysql.fabric.xmlrpc.base.Array;

import net.sf.json.JSONObject;

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
	public void doLogin(HttpServletRequest request,HttpServletResponse response,User user) 
					throws IOException, ServletException{
		if(user.getUsername().equals("admin")&&user.getPassword().equals("123")){
			request.setAttribute("user",user);				
			request.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(request,response);;
		}else{
			response.sendRedirect("login");
		}	
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
	
	@RequestMapping("/list")
	public String list() {
		return "list";
	}
	
	@RequestMapping("/detail")
	public ModelAndView detail (int id) {
		ModelAndView  mv =new ModelAndView();
		mv.addObject("id",id);
		mv.setViewName("detail");
		return mv;
	}
	
	@RequestMapping("/list2")
	public String list2() {
		return "list2";
	}
	
	@RequestMapping("/detail/{id}")
	public ModelAndView details (@PathVariable int id) {
		ModelAndView  mv =new ModelAndView();
		mv.addObject("id",id);
		mv.setViewName("detail");
		return mv;
	}
	
	@RequestMapping("/ajax")
	public String ajax(){
	return "index";
	}

	@RequestMapping("/doajax1")
	public void doAjax(HttpServletRequest request,
		HttpServletResponse response,User user) throws IOException{
		Map<String,String> map=new HashMap<String,String>();
		map.put("username", user.getUsername());
		map.put("password", user.getPassword());
	
		JSONObject jsonObject=JSONObject.fromObject(map);
		String jsonStr=jsonObject.toString();
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		out.print(jsonStr);
		out.close();
	}
	
	@RequestMapping("/doajax2")
	@ResponseBody
	public Object doAjax2() {
		return 520.1314;
	}
	
	@RequestMapping("/doajax3")
	@ResponseBody
	public Object doAjax3() {
		return "Hello SpringMVC";
	}
	
	@RequestMapping("/doajax4")
	@ResponseBody
	public Object doAjax4() {
		User user=new User();
		return user;
	}
	
	@RequestMapping("/doajax5")
	@ResponseBody
	public Object doAjax5() {
		User user1=new User();
		User user2=new User();
		Map<String,User> map = new HashMap<String, User>();
		map.put("user1", user1);
		map.put("user2", user2);
		return map;
	}
	
	@RequestMapping("/doajax6")
	@ResponseBody
	public Object doAjax6() {
		User user1=new User();
		User user2=new User();
		User user3=new User();
		List<User> list = new ArrayList<User>();
		list.add(user1);
		list.add(user2);
		list.add(user3);	
		return list;
	}
	
	/* doajax7-12本质还是重复上面的工作，                    不写了 */
}
