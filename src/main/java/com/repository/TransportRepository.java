package com.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Transport;

@Repository
public interface TransportRepository extends JpaRepository<Transport, Integer>{

	List<Transport> findByName(String name);
	
	Page<Transport> findByNameContaining(String name, Pageable pageable);
	
}
