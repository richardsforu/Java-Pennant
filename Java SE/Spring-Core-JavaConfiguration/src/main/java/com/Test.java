package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pennant.prod.config.AppConfig;
import com.pennant.prod.service.ProductService;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService ps = ac.getBean(ProductService.class);
		ps.saveProduct();
		ac.close();

	}

}
