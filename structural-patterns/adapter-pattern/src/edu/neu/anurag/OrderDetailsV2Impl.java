package edu.neu.anurag;

public class OrderDetailsV2Impl implements OrderDetailsV2 {

	@Override
	public String getOrderDetails() {
		return "Order Details v2";
	}

	@Override
	public void cancelItem(String itemId) {
		System.out.println("Cancelled item " + itemId + " in v2");

	}

	@Override
	public void addItem(String itemId) {
		System.out.println("Added item " + itemId + " in v2");

	}

	@Override
	public void cancelOrder(String orderNum) {

		System.out.println("Cancel Order " + orderNum + " in v2");
	}

}
