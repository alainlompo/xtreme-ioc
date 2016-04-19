package org.hypernovae.apis.grator.components;

import org.hypernovae.apis.domain.Order;
import org.springframework.integration.annotation.Gateway;

public interface EShop {
	@Gateway(requestChannel="ordersChannel")
	void placeOrder(Order order);
}
