package com.product;

import org.springframework.stereotype.Repository;

@Repository("prod")
public class ProductImpl implements Product {

	@Override
	public void ListAll() {
		System.out.println("---- Listing all Products");
	}

}
