package com.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Role;
 
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
	List<Role> findByName(String name);
	
	Page<Role> findByNameContaining(String name, Pageable pageable);
}
