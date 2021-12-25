package io.javabrains.springsecurityjpajavabrains.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/secured")
public class HomeController {

	
	
	
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
