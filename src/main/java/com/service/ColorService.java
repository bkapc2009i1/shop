package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.entity.Color;

@Service
public class ColorService {
//	@Autowired
//	private ColorRepository colorRepository;
//	
//	public List<Color> list(){
//		return this.colorRepository.findAll();
//	}
//	
//	public List<Color> findByName(String name) {
//		return this.colorRepository.findByName(name);
//	}
//	
//	public Page<Color> findByNameContaining(String name, Pageable pageable) {
//		return this.colorRepository.findByNameContaining(name, pageable);
//	}
//	
//	public Optional<Color> findById(Long id) {
//		return this.colorRepository.findById(id);
//	}
//	
//	public Color saveOrUpdate(Color color) {
//		return this.colorRepository.save(color);
//	}
//
//	public boolean deleteById(Long id) {
//		if(colorRepository.existsById(id)) {
//			colorRepository.deleteById(id);
//			return true;
//		} else {
//			return false;
//		}
//	}
}
