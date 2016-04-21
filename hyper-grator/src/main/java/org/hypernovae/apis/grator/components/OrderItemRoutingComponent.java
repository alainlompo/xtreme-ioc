package org.hypernovae.apis.grator.components;

import org.hypernovae.apis.domain.Book;
import org.hypernovae.apis.domain.OrderItem;
import org.hypernovae.apis.domain.ProfessionalTraining;
import org.hypernovae.apis.domain.Software;

public class OrderItemRoutingComponent {
	public String routeOrder(OrderItem orderItem) {
		String channel ="";
		if (isBook(orderItem)) {
			channel = "bookItemsChannel";
		} else if (isSoftware(orderItem)) {
			channel = "softwareItemsChannel";
		} else if (isProfessionalTraining(orderItem)) {
			channel = "professionalTrainingItemsChannel";
		}
		return channel;
	}
	
	public boolean isBook(OrderItem orderItem) {
		return (orderItem != null && orderItem instanceof Book);
	}
	
	public boolean isSoftware(OrderItem orderItem) {
		return (orderItem != null && orderItem instanceof Software);
	}
	
	public boolean isProfessionalTraining(OrderItem orderItem) {
		return (orderItem != null && orderItem instanceof ProfessionalTraining);
	}
}
