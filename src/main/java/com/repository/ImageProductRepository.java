package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.ImageProduct;

@Repository
public interface ImageProductRepository extends JpaRepository<ImageProduct, Integer>{

}
