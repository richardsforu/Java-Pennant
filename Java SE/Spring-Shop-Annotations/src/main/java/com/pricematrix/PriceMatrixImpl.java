package com.pricematrix;

import org.springframework.stereotype.Repository;

// Dependency
@Repository("price")
public class PriceMatrixImpl implements PriceMatrix {
	
	public PriceMatrixImpl() {
	
		System.out.println("--- PriceMatrixImpl object created");
	}
	
	@Override
	public double getItemPrice(String prodId) {
		// code to connect to DB and fetch price for the given prodId
		
		return 100.0;
	}

}
