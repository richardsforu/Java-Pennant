package com.pennant.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pennant.product.dao.ProductDao;
import com.pennant.product.model.Product;

@Service("prodService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	public void saveProduct(Product prod) {
		System.out.println("--- ProdService Impl");
		prodDao.saveProduct(prod);

	}

	public void findProduct(String prodId) {
		// TODO Auto-generated method stub

	}

	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
