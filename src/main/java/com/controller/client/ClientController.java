package com.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ClientController {

	@GetMapping("")
	public String index() {
		return "client/index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "client/login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "client/register";
	}
	
	@GetMapping("/about")
	public String about() {
		return "client/about";
	}
	
	@GetMapping("/checkout")
	public String checkout() {
		return "client/checkout";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "client/contact";
	}
}
