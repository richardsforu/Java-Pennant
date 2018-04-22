package com.pennant.product.service;

import java.util.List;

import com.pennant.product.model.Product;

public interface ProductService {
	public void saveProduct(Product prod);

	public void findProduct(String prodId);

	public List<Product> listAll();

}
