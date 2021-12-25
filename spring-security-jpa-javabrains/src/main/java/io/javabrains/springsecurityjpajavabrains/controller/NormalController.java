package io.javabrains.springsecurityjpajavabrains.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class NormalController {
	
	@GetMapping("/login")
	public String loginpage() {

		return "index";
	}
	@RequestMapping("/registration")
	public String registration() {
		
		return "registration";
		
	}


}
