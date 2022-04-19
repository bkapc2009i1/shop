package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.entity.Transport;
import com.repository.TransportRepository;

@Service
public class TransportService {

	@Autowired
	private TransportRepository transportRepository;
	
	
	public List<Transport> list(){
		return this.transportRepository.findAll();
	}
	
	public List<Transport> findByName(String name) {
		return this.transportRepository.findByName(name);
	}
	
	public Page<Transport> findByNameContaining(String name, Pageable pageable) {
		return this.transportRepository.findByNameContaining(name, pageable);
	}
	
	
	public Optional<Transport> findById(Integer id) {
		return this.transportRepository.findById(id);
	}
	
	public Transport saveOrUpdate(Transport transport) {
		return this.transportRepository.save(transport);
	}

	public boolean deleteById(Integer id) {
		if(transportRepository.existsById(id)) {
			transportRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	
}
