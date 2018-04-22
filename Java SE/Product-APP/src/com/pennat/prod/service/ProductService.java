package com.pennat.prod.service;

import java.util.List;

import com.pennat.prod.model.Product;

public interface ProductService {
	void addProduct(Product prod);

	List<Product> listProducts();

	Product findProduct(int prodId);

	void deleteProduct(int prodId);

	void updateProduct(int prodId, Product newProd);

}
