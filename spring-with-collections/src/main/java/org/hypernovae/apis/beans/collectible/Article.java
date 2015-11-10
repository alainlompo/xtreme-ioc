package org.hypernovae.apis.beans.collectible;

public class Article {
	private String designation;
	private double unitPrice;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public String toString() {
		return "designation: " + designation + ", unit price: " + unitPrice;
	}

}
