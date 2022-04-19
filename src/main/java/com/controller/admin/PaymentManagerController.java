package com.controller.admin;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.entity.Payment;
import com.entity.Product;
import com.service.PaymentService;

@Controller
@RequestMapping("/admin/payment")
public class PaymentManagerController {
	
	@Autowired
	private PaymentService paymentService;
	
	@InitBinder
	public void FormatDate(WebDataBinder binder) {
		SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd");
		simp.setLenient(false);
		binder.registerCustomEditor(Timestamp.class, new CustomDateEditor(simp, true));
	}
	
	@GetMapping("")
	public String index(ModelMap modelMap) {
		List<Payment> list = paymentService.list();
		modelMap.addAttribute("list", list);
		return "admin/payment/index";
	}
	
	@GetMapping("/create")
	public String create(ModelMap modelMap) {
		Payment payment = new Payment();
		modelMap.addAttribute("payment", payment);
		return "admin/payment/create";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(ModelMap modelMap,@PathVariable("id") Integer Id) {
		Payment payment = paymentService.findById(Id)
			      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + Id));
		modelMap.addAttribute("payment", payment);
		return "admin/payment/edit";
	}
	
	
	@PostMapping("/update")
	public Object update(@Valid @ModelAttribute("payment") Payment payment, BindingResult result,ModelMap modelMap) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		if (result.hasErrors()) {
			return "redirect:/admin/payment/edit/" + payment.getId(); 
		}else {
			payment.setCreated_at(timestamp);
			paymentService.saveOrUpdate(payment);
			modelMap.addAttribute("Success", "Sửa thành công!");
		}
		return index(modelMap);
	}
	

	
	@PostMapping("/save")
	public Object save(@Valid @ModelAttribute("payment") Payment payment, BindingResult result,ModelMap modelMap) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		if (result.hasErrors()) {
			return "admin/payment/create"; 
		}else {
			payment.setCreated_at(timestamp);
			paymentService.saveOrUpdate(payment);
			modelMap.addAttribute("Success", "Thêm thành công!");
		}
		return index(modelMap);
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(ModelMap modelMap,@PathVariable("id") Integer Id) {
		boolean status = paymentService.deleteById(Id);
		if (status) {
			modelMap.addAttribute("Success", "Xóa thành công!");
		} else {
			modelMap.addAttribute("Error", "Xóa thất bại!");
		}
		return index(modelMap);
	}
}
