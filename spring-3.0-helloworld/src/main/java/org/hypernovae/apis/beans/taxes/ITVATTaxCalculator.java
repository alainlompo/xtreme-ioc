package org.hypernovae.apis.beans.taxes;

public class ITVATTaxCalculator implements TaxCalculator {

	public static final double IT_VAT_TAX_RATE = 0.2D;
	
	public double computeTaxesFor(double amount) {
		return amount *IT_VAT_TAX_RATE;
	}

}
