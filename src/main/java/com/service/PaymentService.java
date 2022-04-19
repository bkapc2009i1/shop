package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.entity.Payment;
import com.repository.PaymentRepository;


@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	public List<Payment> list() {
		return (List<Payment>) this.paymentRepository.findAll();
	}

	public List<Payment> findByName(String name) {
		return this.paymentRepository.findByName(name);
	}

	public Optional<Payment> findById(Integer id) {
		return this.paymentRepository.findById(id);
	}

	public Payment saveOrUpdate(Payment payment) {
		return this.paymentRepository.save(payment);
	}

	public boolean deleteById(Integer id) {
		if (paymentRepository.existsById(id)) {
			paymentRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
