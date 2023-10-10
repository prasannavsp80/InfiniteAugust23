package com.infinite.cms;

public interface OrderDetailsDAO {

	String placeOrder(int custId, int venId, int menuId, String walSource,int qty, String ordComments);
}
