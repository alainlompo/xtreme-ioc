package org.hypernovae.apis.beans;

public class Deal {
	private int numberOfArticles;
	private double unitPrice;
	private double totalPrice;
	public int getNumberOfArticles() {
		return numberOfArticles;
	}
	public void setNumberOfArticles(int numberOfArticles) {
		this.numberOfArticles = numberOfArticles;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String toString() {
		return "unitPrice: " + unitPrice + ", quantity: " + numberOfArticles +", total price: " + totalPrice;
		
	}
	

}
