package org.hypernovae.apis.domain;

import java.math.BigDecimal;

public class Software extends OrderItem {
	private String category;
	private String name;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Software(String category, String name) {
		super();
		this.category = category;
		this.name = name;
	}
	
	public Software(String category, String name, BigDecimal price) {
		super(price);
		this.category = category;
		this.name = name;
	}
	public Software() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Software(BigDecimal price) {
		super(price);
		// TODO Auto-generated constructor stub
	}	
}
