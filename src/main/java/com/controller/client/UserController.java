package com.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("")
	public String index() {
		return "client/user/profile";
	}
	
	@GetMapping("/cart")
	public String cart() {
		return "client/user/cart";
	}
	
	@GetMapping("/wishlist")
	public String wishlist() {
		return "client/user/wishlist";
	}
}
