package com;

import com.billing.BillingImpl;
import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "P001", "P002", "P003" };
		String[] cart2 = { "P004", "P005" };

	// Create dependenct class object 
	
		PriceMatrix price=new PriceMatrixImpl();
		
		
		
	//--------------------------------------------------
		BillingImpl bill = new BillingImpl();
		bill.setPrice(price); // DI
		double total = bill.getCartTotal(cart1);
	//--------------------------------------------------

		System.out.println("Cart1 Total is " + total);
		
		// Second customer
		total = bill.getCartTotal(cart2);
		System.out.println("Cart2 Total is " + total);

	}

}
