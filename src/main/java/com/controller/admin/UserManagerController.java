package com.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/user")
public class UserManagerController {

	@RequestMapping("")
	public String index() {
		return "admin/user/index";
	}
}
