package com.kodilla.spring.patterns.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private ProductService productService;
	private final List<Item> items = new ArrayList<>();
	private final Long orderId;
	private final Long userId;
	private boolean isPaid = false;
	private boolean isVerified = false;
	private boolean isSubmitted = false;
	
	public Order(Long orderId, Long userId, ProductService productService) {
		this.orderId = orderId;
		this.userId = userId;
		this.productService = productService;
	}
	
	public BigDecimal calculateValue() {
		BigDecimal sum = BigDecimal.ZERO;
		for (Item item : items) {
			sum.add(productService.getPrice(item.getProductId()));
		}
		return sum;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public boolean isSubmitted() {
		return isSubmitted;
	}

	public void setSubmitted(boolean isSubmitted) {
		this.isSubmitted = isSubmitted;
	}

	public List<Item> getItems() {
		return items;
	}

	public Long getOrderId() {
		return orderId;
	}

	public Long getUserId() {
		return userId;
	}
	
	
	
}
