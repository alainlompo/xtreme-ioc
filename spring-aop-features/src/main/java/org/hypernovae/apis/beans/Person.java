package org.hypernovae.apis.beans;

public class Person implements TaxPayer {
	
	private int taxAmount;
	private String name;
	private int monthlyIncome;
	private int taxRateInPercent;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(int monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	
	public int getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(int taxAmount) {
		this.taxAmount = taxAmount;
	}
	public int getTaxRateInPercent() {
		return taxRateInPercent;
	}
	public void setTaxRateInPercent(int taxRateInPercent) {
		this.taxRateInPercent = taxRateInPercent;
	}
	
	
	
}
