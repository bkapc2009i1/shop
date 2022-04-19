package com.controller.admin;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Transport;
import com.service.TransportService;

@Controller
@RequestMapping("/admin/transport")
public class TransportManagerController {
	@Autowired
	private TransportService transportService;
	
	@InitBinder
	public void FormatDate(WebDataBinder binder) {
		SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd");
		simp.setLenient(false);
		binder.registerCustomEditor(Timestamp.class, new CustomDateEditor(simp, true));
	}
	
	@GetMapping("")
	public String index(ModelMap modelMap) {
		List<Transport> list = transportService.list();
		modelMap.addAttribute("list", list);
		return "admin/transport/index";
	}
	
	@GetMapping("/create")
	public String create(ModelMap modelMap) {
		Transport transport = new Transport();
		modelMap.addAttribute("transport", transport);
		return "admin/transport/create";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(ModelMap modelMap,@PathVariable("id") Integer Id) {
		Transport transport = transportService.findById(Id)
			      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + Id));
		modelMap.addAttribute("transport", transport);
		return "admin/transport/edit";
	}
	
	
	@PostMapping("/update")
	public Object update(@Valid @ModelAttribute("transport") Transport transport, BindingResult result,ModelMap modelMap) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		if (result.hasErrors()) {
			return "redirect:/admin/transport/edit/" + transport.getId(); 
		}else {
			transport.setCreated_at(timestamp);
			transportService.saveOrUpdate(transport);
			modelMap.addAttribute("Success", "Sửa thành công!");
		}
		return index(modelMap);
	}
	

	
	@PostMapping("/save")
	public Object save(@Valid @ModelAttribute("transport") Transport transport, BindingResult result,ModelMap modelMap) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		if (result.hasErrors()) {
			return "admin/transport/create"; 
		}else {
			transport.setCreated_at(timestamp);
			transportService.saveOrUpdate(transport);
			modelMap.addAttribute("Success", "Thêm thành công!");
		}
		return index(modelMap);
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(ModelMap modelMap,@PathVariable("id") Integer Id) {
		boolean status = transportService.deleteById(Id);
		if (status) {
			modelMap.addAttribute("Success", "Xóa thành công!");
		} else {
			modelMap.addAttribute("Error", "Xóa thất bại!");
		}
		return index(modelMap);
	}
}
