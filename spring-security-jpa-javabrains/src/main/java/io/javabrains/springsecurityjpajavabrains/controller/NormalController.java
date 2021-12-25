package io.javabrains.springsecurityjpajavabrains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.javabrains.springsecurityjpajavabrains.Entity.User;
import io.javabrains.springsecurityjpajavabrains.service.MyUserDetailsService;

@Controller
@RequestMapping("/")
public class NormalController {


	@Autowired
	MyUserDetailsService myUserDetailsService;

	@GetMapping("/login")
	public String loginpage() {

		return "index";
	}

	@RequestMapping("/registration")
	public String registration() {

		return "registration";

	}

	@RequestMapping("/regvalidate")
	public String regvalidate(User user) {

		user = myUserDetailsService.getValidation(user);
		if (user == null) {

			return "index";

		} else {

			return "regsuccess";
		}
	}

}
