package org.hypernovae.apis.modules.traders;

import org.hypernovae.apis.modules.customers.Customer;
import org.hypernovae.apis.modules.services.Serviceable;

public class SingleCustomerTrader {
	
	private Customer customer;
	private Serviceable valueService;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Serviceable getValueService() {
		return valueService;
	}

	public void setValueService(Serviceable valueService) {
		this.valueService = valueService;
	}
	
}
