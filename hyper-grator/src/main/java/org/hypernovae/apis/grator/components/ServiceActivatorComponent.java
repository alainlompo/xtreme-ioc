package org.hypernovae.apis.grator.components;

import java.math.BigDecimal;

import org.hypernovae.apis.domain.OrderItem;

public class ServiceActivatorComponent {
	public static final BigDecimal PROFESSIONAL_TRAINING_DISCOUNT = BigDecimal.valueOf(285.5D);
	public static final BigDecimal SOFTWARE_DISCOUNT = BigDecimal.valueOf(35.0D);
	public static final BigDecimal BOOK_DISCOUNT = BigDecimal.valueOf(10.0D);
	
	public OrderItem processBook(OrderItem orderItem) {
		
	}
}
