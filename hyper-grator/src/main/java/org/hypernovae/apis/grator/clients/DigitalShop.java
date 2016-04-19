package org.hypernovae.apis.grator.clients;

import org.hypernovae.apis.domain.Order;
import org.hypernovae.apis.grator.components.EShop;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DigitalShop {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/org/hypernovae/apis/grator/components/eshop.xml", DigitalShop.class);
		EShop eShop = (EShop)context.getBean("eshop");
		final Order order = createOrder();
		eShop.placeOrder(order);
		context.close();
	}

	private static Order createOrder() {
		// TODO Auto-generated method stub
		return null;
	}
}
