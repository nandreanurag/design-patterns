package edu.neu.anurag;

public interface OrderDetailsV2 extends OrderDetailsV1{

	void addItem(String itemId);
	void cancelOrder(String orderNum);
}
