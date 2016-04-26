package org.hypernovae.apis.grator.clients;

import java.math.BigDecimal;

import org.hypernovae.apis.domain.Book;
import org.hypernovae.apis.domain.Order;
import org.hypernovae.apis.domain.OrderItem;
import org.hypernovae.apis.domain.ProfessionalTraining;
import org.hypernovae.apis.domain.Software;
import org.hypernovae.apis.grator.components.EShop;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.ArrayList;

public class DigitalShop {
	private static final Logger LOG = Logger.getLogger(DigitalShop.class);
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/org/hypernovae/apis/grator/components/eshop.xml", DigitalShop.class);
		EShop eShop = (EShop)context.getBean("eShop");
		final Order order = createOrder();
		
		LOG.debug("*********** Digital shop placing order ***********");
		eShop.placeOrder(order);
		context.close();
	}

	private static Order createOrder() {
		Book book = new Book("L'onction et l'injonction pour l'action", 2013, "LSAM", BigDecimal.valueOf(54.5), "Life HousePublisher");
		ProfessionalTraining springBatchTraining = new ProfessionalTraining(5,"Spring batch and spring integration", "Spring framework", BigDecimal.valueOf(10000.0D));
		Software codeEditor = new Software("Dev tool", "hypereditor v1.1", BigDecimal.valueOf(125.5));
		
		book.setQuantity(5);
		springBatchTraining.setQuantity(1);
		codeEditor.setQuantity(1000);
		
		final List<OrderItem> orderItems = new ArrayList<OrderItem>();
		orderItems.add(book);
		orderItems.add(springBatchTraining);
		orderItems.add(codeEditor);
		
		Order order = new Order();
		order.setOrderItems(orderItems);
		LOG.debug("Order: " + order);
//		log.debug("Total : "+ order.getTotalCost());

		return order;
	}
}
