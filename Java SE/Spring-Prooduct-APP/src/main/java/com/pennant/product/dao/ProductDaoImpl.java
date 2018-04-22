package com.pennant.product.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pennant.product.model.Product;

@Repository("prodDao")
public class ProductDaoImpl implements ProductDao {

	public void saveProduct(Product prod) {
		System.out.println("Product Dao: " + prod.getProdNamee() + " Saved");

	}

	public void findProduct(String prodId) {

	}

	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
