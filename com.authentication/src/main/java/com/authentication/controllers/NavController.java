package com.authentication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	@GetMapping("/")
	public String index() {
		return"index";
	}
	@GetMapping("/loginPage")
	public String login() {
		return"login";
	}
	@GetMapping("/signUpPage")
	public String signUp() {
		return"signUp";
	}

}
