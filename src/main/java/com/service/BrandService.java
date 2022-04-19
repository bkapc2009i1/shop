package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.entity.Brand;

@Service
public class BrandService {
	
//	@Autowired
//	private BrandRepository brandRepository;
//	
//	
//	public List<Brand> list(){
//		return this.brandRepository.findAll();
//	}
//	
//	public List<Brand> findByName(String name) {
//		return this.brandRepository.findByName(name);
//	}
//	
//	public Page<Brand> findByNameContaining(String name, Pageable pageable) {
//		return this.brandRepository.findByNameContaining(name, pageable);
//	}
//	
//	
//	public Optional<Brand> findById(Integer id) {
//		return this.brandRepository.findById(id);
//	}
//	
//	public Brand saveOrUpdate(Brand brand) {
//		return this.brandRepository.save(brand);
//	}
//
//	public boolean deleteById(Integer id) {
//		if(brandRepository.existsById(id)) {
//			brandRepository.deleteById(id);
//			return true;
//		} else {
//			return false;
//		}
//	}

}
