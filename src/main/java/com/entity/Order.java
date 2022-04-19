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
@Table(name = "orders")
@Data
public class Order {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "order_id")
		private int id;
		
		@Column(name = "order_u_name")
		private String name;
		
		@Column(name = "order_u_address")
		private String address;
		
		@Column(name = "order_u_phone")
		private String phone;
		
		@Column(name = "order_u_email")
		private String email;
		
		@Column(name = "order_u_status")
		private int status;
		
		@Column(name = "order_created_at")
		private Timestamp created_at;
		
//		@ManyToOne
//		@JoinColumn(name = "order_u_id", referencedColumnName = "u_id")
//		private User user;
//		
//		@ManyToOne
//		@JoinColumn(name = "transport_id", referencedColumnName = "transport_id")
//		private Transport transport;
		
		@ManyToOne
		@JoinColumn(name = "payment_id", referencedColumnName = "id")
		private Payment payment;
		
	
}
