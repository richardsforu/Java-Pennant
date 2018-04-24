package com.pennant.prod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pennant.prod.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao prodDao;

	public void saveProduct() {
		System.out.println("--- productService: saveProduct");
		prodDao.saveProduct();

	}
}
