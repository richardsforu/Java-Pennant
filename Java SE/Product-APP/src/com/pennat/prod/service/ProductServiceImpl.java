package com.pennat.prod.service;

import java.util.List;

import com.pennat.prod.dao.ProductDao;
import com.pennat.prod.dao.ProductDaoImpl;
import com.pennat.prod.model.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao prodDao = new ProductDaoImpl();

	@Override
	public void addProduct(Product prod) {
		prodDao.addProduct(prod);

	}

	@Override
	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return prodDao.listProducts();
	}

	@Override
	public Product findProduct(int prodId) {
		// TODO Auto-generated method stub
		return prodDao.findProduct(prodId);
	}

	@Override
	public void deleteProduct(int prodId) {
		prodDao.deleteProduct(prodId);

	}

	@Override
	public void updateProduct(int prodId, Product newProd) {
		prodDao.updateProduct(prodId, newProd);

	}

}
