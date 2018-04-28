package com.pennant.emp.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspects {

	@Around("execution(void transaction*())") 
	public void tesMethod(ProceedingJoinPoint pj) throws Throwable {
		
		System.out.println("---- Before Transaction Begins");
		pj.proceed();
		System.out.println("---- After Transaction Completed");
		
		
	}
	
}
