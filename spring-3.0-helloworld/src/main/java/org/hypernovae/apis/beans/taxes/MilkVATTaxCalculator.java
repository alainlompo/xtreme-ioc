package org.hypernovae.apis.beans.taxes;

public class MilkVATTaxCalculator implements TaxCalculator{

	public static final double MILK_VAT_TAX_RATE = 0.7D;
	
	public double computeTaxesFor(double amount) {
		
		return amount * MILK_VAT_TAX_RATE;
	}

}
