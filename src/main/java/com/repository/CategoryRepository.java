package com.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	List<Category> findByName(String name);
	
	Page<Category> findByNameContaining(String name, Pageable pageable);
}
