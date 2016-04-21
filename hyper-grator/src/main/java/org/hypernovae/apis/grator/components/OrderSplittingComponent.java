package org.hypernovae.apis.grator.components;

import org.hypernovae.apis.domain.Order;
import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;

public class OrderSplittingComponent extends AbstractMessageSplitter {

	@Override
	protected Object splitMessage(Message<?> message) {		
		return ((Order)message.getPayload()).getOrderItems();
	}

}
