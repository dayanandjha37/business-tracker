package io.javabrains.springsecurityjpajavabrains.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/secured")
public class HomeController {

	Object object;

	@RequestMapping("/user")
	public String userpage() {
		return "user";

	}

	@RequestMapping("/admin")
	public String adminpage() {
		return "admin";

	}

	@RequestMapping("/manager")
	public String managerpage() {
		return "manager";

	}

	@RequestMapping("/home")
	public String homepage(Model model) {

		object = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("user", object);
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
	
	@RequestMapping("/details")
	public String details(Model model) {
		model.addAttribute("user", object);
		return "details";

	}
	
}
