package org.hypernovae.apis.beans;

public class TaxPaymentService {
	
	public int generateTaxToPay(TaxPayer payer) {
		if (payer instanceof Corporation) {
			return 10000;
		} else if (payer instanceof Person) {
			Person p = (Person)payer;
			return p.getMonthlyIncome() / TaxUtils.getTaxInPercent();
		}
		
		throw new IllegalArgumentException("Unable to identify this tax payer....");
	}
	
	public void printPayerInfos(TaxPayer payer) {
		if (payer instanceof Corporation) {
			Corporation c= (Corporation)payer;
			System.out.println("Payer infos..." + c.getName() + ", business: " + c.getTypeOfBusiness());
		} else if (payer instanceof Person) {
			Person p = (Person)payer;
			System.out.println("Payer infos..." + p.getName() + ", monthly income: " + p.getMonthlyIncome() );
			
		}
	}

}
