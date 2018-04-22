package com.pennat.prod.dao;

import java.util.List;

import com.pennat.prod.model.Product;

public interface ProductDao {

	void addProduct(Product prod);

	List<Product> listProducts();

	Product findProduct(int prodId);

	void deleteProduct(int prodId);

	void updateProduct(int prodId,Product newProd);

}
