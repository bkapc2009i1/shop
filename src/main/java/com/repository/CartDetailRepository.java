package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.classid.CartDetailId;
import com.entity.CartDetail;

@Repository
public interface CartDetailRepository extends JpaRepository<CartDetail, CartDetailId>{

}
