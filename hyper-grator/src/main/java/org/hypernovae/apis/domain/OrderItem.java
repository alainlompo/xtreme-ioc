package org.hypernovae.apis.domain;

import java.math.BigDecimal;

public class OrderItem {
	private BigDecimal price;
	private BigDecimal discountedPrice;
	private int quantity;
	
	public OrderItem() {}
	public OrderItem(BigDecimal price) {
		this.price = price;
		this.discountedPrice = price;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(BigDecimal discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
