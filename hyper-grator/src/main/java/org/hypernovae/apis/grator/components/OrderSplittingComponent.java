package org.hypernovae.apis.grator.components;

import org.apache.log4j.Logger;

import java.util.List;

import org.hypernovae.apis.domain.Order;
import org.hypernovae.apis.domain.OrderItem;
import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;

public class OrderSplittingComponent extends AbstractMessageSplitter {

	private static final Logger LOG = Logger.getLogger(OrderSplittingComponent.class);
	
	@Override
	protected Object splitMessage(Message<?> message) {	
		List<OrderItem> oIs = ((Order)message.getPayload()).getOrderItems();
		LOG.debug("============> Splitting the order into its orderItems components, we have: " + oIs.size() + " items" );
		return oIs;
	}

}
