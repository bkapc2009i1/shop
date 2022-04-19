package com.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("")
	public String index() {
		return "client/product/product";
	}
	
	@GetMapping("/detail")
	public String detail() {
		return "client/product/product-detail";
	}
}
