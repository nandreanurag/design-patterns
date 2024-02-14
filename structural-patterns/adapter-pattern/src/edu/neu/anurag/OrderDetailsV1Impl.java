package edu.neu.anurag;

class OrderDetailsV1Impl implements OrderDetailsV1 {
	@Override
	public String getOrderDetails() {
		return "Order Details v1";
	}

	@Override
	public void cancelItem(String itemId) {
		System.out.println("Cancelled item " + itemId + " in v1");
	}
}