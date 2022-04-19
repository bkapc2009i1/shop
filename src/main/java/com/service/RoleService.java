package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.entity.Role;
//import com.repository.RoleRepository;

@Service
public class RoleService {
	
//	@Autowired
//	private RoleRepository roleRepository;
//	
//	public List<Role> list(){
//		return this.roleRepository.findAll();
//	}
//	
//	public List<Role> findByName(String name) {
//		return this.roleRepository.findByName(name);
//	}
//	
//	public Page<Role> findByNameContaining(String name, Pageable pageable) {
//		return this.roleRepository.findByNameContaining(name, pageable);
//	}
//	
//	
//	public Optional<Role> findById(Integer id) {
//		return this.roleRepository.findById(id);
//	}
//	
//	public Role saveOrUpdate(Role role) {
//		return this.roleRepository.save(role);
//	}
//
//	public boolean deleteById(Integer id) {
//		if(roleRepository.existsById(id)) {
//			roleRepository.deleteById(id);
//			return true;
//		} else {
//			return false;
//		}
//	}
	
}
