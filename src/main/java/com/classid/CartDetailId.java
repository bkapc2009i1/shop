package com.classid;

import java.io.Serializable;

import com.entity.Cart;
import com.entity.ProductDetail;

public class CartDetailId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Cart cart;
	private ProductDetail productDetail;
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public ProductDetail getProductDetail() {
		return productDetail;
	}
	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}
}
