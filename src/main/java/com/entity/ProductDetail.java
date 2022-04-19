package com.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "product_detail")
@Data
public class ProductDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "price")
	private float price;
	@Column(name = "created_at")
	private Timestamp created_at;
	
	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "color_id", referencedColumnName = "id")
	private Color color;
	
	@OneToMany(mappedBy = "productDetail")
	private List<CartDetail> cartDetails;
	
	@OneToMany(mappedBy = "productDetail")
	private List<ImageProduct> imageProducts;
}
