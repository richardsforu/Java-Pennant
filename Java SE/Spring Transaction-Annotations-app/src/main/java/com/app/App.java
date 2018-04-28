package com.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.model.Account;
import com.app.repository.AccountRepository;
import com.app.service.TxrService;

public class App {

	public static void main(String[] args) {
		// init
		ConfigurableApplicationContext context = null;
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		// --------------------------------------------------------------
		// use
		try {
			TxrService txrService = context.getBean("txrService", TxrService.class);
			txrService.txr(500, "2", "1");
		} catch (Exception e) {
			System.out.println("Ex-" + e.getMessage());
		}
		// --------------------------------------------------------------
		// Testing
		AccountRepository accountRepository = context.getBean("accRepo", AccountRepository.class);
		Account account1 = accountRepository.load("1");
		Account account2 = accountRepository.load("2");
		System.out.println(account1);
		System.out.println(account2);
		// --------------------------------------------------------------
		// destroy
		context.close();
	}

}
