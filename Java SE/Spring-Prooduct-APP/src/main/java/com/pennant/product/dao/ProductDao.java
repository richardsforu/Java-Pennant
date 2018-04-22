package com.pennant.product.dao;

import java.util.List;

import com.pennant.product.model.Product;

public interface ProductDao {

	public void saveProduct(Product prod);

	public void findProduct(String prodId);

	public List<Product> listAll();

}
