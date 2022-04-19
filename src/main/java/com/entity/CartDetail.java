package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.classid.CartDetailId;

import lombok.Data;

@Entity
@Table(name = "cart_detail")
@Data
@IdClass(CartDetailId.class)
public class CartDetail {
	@Id
	@ManyToOne
	@JoinColumn(name = "cart_id", referencedColumnName = "id")
	private Cart cart;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "product_detail_id", referencedColumnName = "id")
	private ProductDetail productDetail;
	
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "total")
	private float total;
}
