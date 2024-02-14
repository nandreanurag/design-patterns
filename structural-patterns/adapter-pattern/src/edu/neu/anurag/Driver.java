package edu.neu.anurag;

public class Driver {
	public static void main(String[] args) {
		OrderDetailsV2 orderDetailsV2 = new OrderDetailsV2Impl();

		OrderDetailsV1 adapter = new OrderDetailsAdapter(orderDetailsV2);

		// Use getOrderDetails and cancelItem from v1, addItem, cancelOrder from v2
		System.out.println(adapter.getOrderDetails());
		adapter.cancelItem("123");
		((OrderDetailsAdapter) adapter).addItem("New Item Laptop");
		((OrderDetailsAdapter) adapter).cancelOrder("12345");
	}

}
