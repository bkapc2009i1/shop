package com.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@GetMapping("")
	public String index() {
		return "client/blog/index";
	}
	
	@GetMapping("/{name}-{id}")
	public String detail() {
		return "client/blog/detail";
	}
}
