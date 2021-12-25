package io.javabrains.springsecurityjpajavabrains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.javabrains.springsecurityjpajavabrains.Entity.User;
import io.javabrains.springsecurityjpajavabrains.dao.UserRepository;
import io.javabrains.springsecurityjpajavabrains.service.MyUserDetailsService;

@Controller
@RequestMapping("/secured")
public class HomeController {

	@Autowired
	UserRepository repository;
	@Autowired
	MyUserDetailsService myUserDetailsService;
	
	@Autowired
	User user;
	
	
	@RequestMapping("/user")
	public String userpage() {
		return "user";

	}

	@RequestMapping("/manager")
	public String manager() {
		return "manager";

	}

	@RequestMapping("/admin")
	public String adminpage() {
		return "admin";

	}

	
	@RequestMapping("/home")
	public String homepage() {
		
		return "home";
	}

	@RequestMapping("/videos")
	public String videos() {
		
		return "videos";
		
	}
	
	@RequestMapping("/report")
	public String report() {
		
		return "report";
		
	}

	

}
