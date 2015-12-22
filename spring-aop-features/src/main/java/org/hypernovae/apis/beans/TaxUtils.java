package org.hypernovae.apis.beans;

public class TaxUtils {
	private TaxUtils() {
		
	}
	private static int taxInPercent = 10;

	public static int getTaxInPercent() {
		return taxInPercent;
	}

	public static void setTaxInPercent(int tIP) {
		taxInPercent = tIP;
	}
	

}
