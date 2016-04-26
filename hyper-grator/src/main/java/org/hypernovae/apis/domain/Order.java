package org.hypernovae.apis.domain;

import java.math.BigDecimal;
import java.util.List;

public class Order {
	List<OrderItem> orderItems;

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	public String toString() {
		BigDecimal totalPrice = BigDecimal.valueOf(0.0D);
		StringBuilder orderBuilder = new StringBuilder();
		orderBuilder.append("Order content...\n");
		for (OrderItem oI: orderItems) {
			orderBuilder.append(orderItemToString(oI))
			.append("\n");
		}
		
		return orderBuilder.toString();
	}
	
	public String orderItemToString(OrderItem oI) {
		String result = "";
		BigDecimal totalBeforeDiscount = oI.getPrice().multiply(BigDecimal.valueOf(oI.getQuantity()*1.0D));
		BigDecimal totalAfterDiscount = totalBeforeDiscount.subtract(
				(oI.getDiscountedPrice() != null)?oI.getDiscountedPrice():BigDecimal.ZERO
				);
		result +=String.format("item: quantity {0}, unit price: {1}, total price: {2}", oI.getQuantity(),
				oI.getPrice(), totalAfterDiscount
				
				);
		
		return result;
	}
	
}
