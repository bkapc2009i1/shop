package com.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table(name = "transport")
@Data
public class Transport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@NotEmpty(message = "Vui lòng nhập tên phương thức vấn chuyển")
	@Column(name = "name")
	private String name;
	
	@NotNull(message = "Vui lòng nhập giá vận chuyển")
	@Column(name = "fee")
	private float fee;
	
	@Column(name = "created_at")
	private Timestamp created_at;
}
