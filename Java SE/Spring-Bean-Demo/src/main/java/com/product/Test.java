package com.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ProdServiceImpl ps= ac.getBean("prodService",ProdServiceImpl.class);
		//ps.getProduct();
		System.out.println(ps.getEmpName());

	}

}
