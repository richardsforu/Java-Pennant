package com.pennant.prod.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {

	public void saveProduct() {
		System.out.println("--- productDao: SaveProduct");

	}

}
