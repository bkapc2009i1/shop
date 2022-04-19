package com.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Payment;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{
	List<Payment> findByName(String name);
	
	Page<Payment> findByNameContaining(String name, Pageable pageable);

}
