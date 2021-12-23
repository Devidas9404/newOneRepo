package com.swifwin.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class UserController {
	@GetMapping("/")
public String home() {
	return "index";
}
	@PostMapping("/register")
	public String register() {
		return "redirect:/";
	}
}
