package com.controller.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.entity.Product;

@Controller
@RequestMapping("/admin/product")
public class ProductManagerController {
	@GetMapping("")
	public String index() {
		return "admin/product/index";
	}
	
	@GetMapping("/create")
	public String create(ModelMap modelMap) {
		Product p = new Product();
		modelMap.addAttribute("product", p);
		return "admin/product/create";
	}
	
	@PostMapping("/create")
	public Object save(@Valid @ModelAttribute("product") Product product, BindingResult result, 
			@RequestParam(name = "price[]", required = false) List<Float> prices, 
			@RequestParam(name = "quantity[]", required = false) List<Integer> quantities,
			@RequestParam(name = "color[]", required = false) List<Integer> colors,
			@RequestParam(name = "upload[]", required = false) List<MultipartFile> multipartFiles) {
		Map<Object, Object> errors = new HashMap<>();
		if (result.hasErrors()) {
			return "admin/product/create"; 
		}else {
			for (int i = 0; i < prices.size(); i++) {
				if (prices.get(i) <= 0 || prices.get(i) == null ) {
					errors.put("price", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại");
				}
				if (quantities.get(i) < 0 || quantities.get(i) != null) {
					errors.put("quantity", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại");
				}
				if (multipartFiles.get(i).getOriginalFilename().equalsIgnoreCase("")) {
					errors.put("upload", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại");
				}
			}
			if (errors.isEmpty()) {
				
			}
			return "redirect:/admin/product";
		}
	}
}
