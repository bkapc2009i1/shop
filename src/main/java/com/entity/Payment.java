package com.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Table(name = "payment")
@Data
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	@NotEmpty(message = "Vui lòng nhập tên phương thức thanh toán")
	private String name;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "created_at")
	private Timestamp created_at;
	
	@OneToMany(mappedBy = "payment")
	private List<Order> order;
	
	
}
