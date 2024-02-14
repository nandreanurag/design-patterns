package edu.neu.anurag;

public class OrderDetailsAdapter extends OrderDetailsV1Impl {

	private OrderDetailsV2 orderDetailsV2;
	
	public OrderDetailsAdapter(OrderDetailsV2 orderDetailsV2) {
		this.orderDetailsV2=orderDetailsV2;
	}
	
	public void addItem(String itemId) {
		orderDetailsV2.addItem(itemId);

	}

	public void cancelOrder(String orderNum) {
		orderDetailsV2.cancelOrder(orderNum);
	}
}
