package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.entity.Category;

@Service
public class CategoryService {
//	@Autowired
//	private CategoryRepository categoryRepository;
//	
//	public List<Category> list(){
//		return this.categoryRepository.findAll();
//	}
//	
//	public List<Category> findByName(String name) {
//		return this.categoryRepository.findByName(name);
//	}
//	
//	public Page<Category> findByNameContaining(String name, Pageable pageable) {
//		return this.categoryRepository.findByNameContaining(name, pageable);
//	}
//	
//	
//	public Optional<Category> findById(Long id) {
//		return this.categoryRepository.findById(id);
//	}
//	
//	public Category saveOrUpdate(Category category) {
//		return this.categoryRepository.save(category);
//	}
//
//	public boolean deleteById(Long id) {
//		if(categoryRepository.existsById(id)) {
//			categoryRepository.deleteById(id);
//			return true;
//		} else {
//			return false;
//		}
//	}
}
