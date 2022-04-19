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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	@NotEmpty(message = "Vui lòng nhập tên sản phẩm")
	private String name;
	
	@Column(name = "description")
	@NotEmpty(message = "Vui lòng nhập mô tả sản phẩm")
	private String description;
	
	@Column(name = "info")
	@NotEmpty(message = "Vui lòng nhập thông tin sản phẩm")
	private String info;
	
	@Column(name = "price")
	@NotNull(message = "Vui lòng nhập giá sản phẩm")
	private Float price;
	
	@Column(name = "created_at")
	private Timestamp created_at;
	
	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "brand_id", referencedColumnName = "id")
	private Brand brand;
	
	@OneToMany(mappedBy = "product")
	private List<ProductDetail> productDetails;
}
