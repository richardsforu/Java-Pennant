package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.service.BankService;

public class Test {

	public static void main(String[] args) {

		// Instantiate Spring Container:

		AbstractApplicationContext sc = null;
		sc = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("Spring Container Ready...");
		System.out.println("---------------------------");
		System.out.println();

		BankService service = sc.getBean("bankService", BankService.class);
		service.bankService();

		System.out.println();
		System.out.println("------------------------------");

		sc.registerShutdownHook();

	}

}
