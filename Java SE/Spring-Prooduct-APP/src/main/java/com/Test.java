package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pennant.product.model.Product;
import com.pennant.product.service.ProductService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Product prod=new Product();
		
		prod.setPrice(100);
		prod.setProdId("P001");
		prod.setProdNamee("Book");
		
		// Load Service class
		
		ProductService prodService=ac.getBean(ProductService.class);
		
		prodService.saveProduct(prod);
		
		
		
		

	}

}
