package org.hypernovae.apis.beans.taxes;

public class TaxService {

	TaxCalculator taxCalculator;
	
	public void setTaxCalculator(TaxCalculator taxCalculator) {
		this.taxCalculator = taxCalculator;
	}
	
	public double getTaxAmountFor(double amount) {
		return taxCalculator.computeTaxesFor(amount);
	}
}
