package com.billing;

import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

//Dependent class 
public class BillingImpl {
	
	
	/*
	 * Design Issues
	 * --------------
	 * -> Too many dependency obj creations -> per of appli goes down
	 * 
	 * Why this issue?
	 * ---------------
	 * -> Creating Dependency obj in the dependent class.
	 * 
	 * Solution?
	 * ----------
	 * -> DO not create dependencdy obj in dependent class. 
	 * -> Maintain all dependency class objects in some directory/server source like JNDI
	 * 
	 *-> JNDI loc is tightly binded with dependent class obj creation.
	 *
	 *Best Solution?
	 *--------------
	 *-> Do not create, do not find, insted ask some one -> IOC
	 *
	 *-> DI-> Injecting Dependency object to the dependent class object is called Dependent injection
	 * 
	 */
	
	
	private PriceMatrix price;
	
	
	

	public void setPrice(PriceMatrix price) {
		this.price = price;
	}




	public double getCartTotal(String[] cart) {

		//PriceMatrixImpl price = new PriceMatrixImpl();

		double total = 0.0;

		for (String prodId : cart) {

			total = total + price.getItemPrice(prodId);
		}

		return total;
	}

}
