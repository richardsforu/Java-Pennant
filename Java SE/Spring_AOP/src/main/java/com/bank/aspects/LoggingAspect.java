package com.bank.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public void com.bank.service.BankService.bankService())")
	public void logAdvice() {
		System.out.println("LOG: Before  Method Exe");
	}
	
}
