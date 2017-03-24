package com.union.tsw.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.union.tsw.user.pojo.User;
import com.union.tsw.user.service.UserService;

@Controller
public class UserController {
	@Autowired
	public  UserService userService;
	
	@RequestMapping("/findAll")
	public @ResponseBody List<User> findAll(){
		
		List<User> user=userService.findAll();
		return  user;
	 }
//	@RequestMapping("/index.jsp")
//	public @ResponseBody int changeUser(User u) {
//		// TODO Auto-generated method stub
//		int i=userService.changeUser(u);
//		return i;
//	}
	
	/*@RequestMapping("/insert")
	public int insert(User record){
		int i=userService.changeUser(record);
		
		return i;
	}*/
	
	@RequestMapping("/changeUser")
	public String changeUser(User u,HttpServletRequest request) {
		// TODO Auto-generated method stub
		try {
			userService.changeUser(u);
			List<User> users = userService.findAll();
			request.setAttribute("users",users);
			return "success.jsp";	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error.jsp";
		}
		
	}
	@RequestMapping("/saveUser")
	public String saveUser(User record){
		int i=userService.insertSelective(record);
		
		return (i == 1) ? "index.jsp" : "error.jsp";
	}
	
	@RequestMapping("/findByNameAndPassword")
	public String findByNameAndPassword(User user,HttpServletRequest request) {
		
		User user2 = null;
		user2 = userService.findByNameAndPassword(user);
		request.getSession().setAttribute("user", user2);
		
		return user2 != null ? "index.jsp":"userLogin.jsp";
	}
	
	@RequestMapping("/logout")
	public String logout(User user,HttpServletRequest request) {
		User user2 = (User)request.getSession().getAttribute("user");
		if(user2 != null){
			request.getSession().removeAttribute("user");
		}
		
		return "index.jsp";
	}
	
}
