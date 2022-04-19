package com.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Color;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {
	List<Color> findByName(String name);

	Page<Color> findByNameContaining(String name, Pageable pageable);
}
