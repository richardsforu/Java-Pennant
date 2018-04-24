package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pennat.emp.config.AppConfig;
import com.pennat.emp.dao.EmployeeDaoImpl;
import com.pennat.emp.service.AccountsServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeDaoImpl empDao=ac.getBean(EmployeeDaoImpl.class);
		AccountsServiceImpl as=ac.getBean(AccountsServiceImpl.class);
		as.setAccountType("Temp");
		empDao.setEmpId(10);
		empDao.setEmpName("Praveen");

		
		System.out.println("--- End ---");
		
	}

}
