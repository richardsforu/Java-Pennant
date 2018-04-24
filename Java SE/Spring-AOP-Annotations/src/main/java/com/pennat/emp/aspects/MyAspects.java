package com.pennat.emp.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@Aspect
public class MyAspects {

	@Before("execution(void set*(*))")
	public void f1(JoinPoint jp) {
		System.out.println("---- Setter is about to call from " + jp.getSignature());
	}

	@After("execution(void set*(*))")
	public void f2(JoinPoint jp) {
		System.out.println("---- Setter is called from " + jp.getSignature());
	}

}
