package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pennant.emp.config.AppConfig;
import com.pennant.emp.model.Employee;
import com.pennant.emp.service.EmployeeService;

public class ResultSetExtgractorTest1 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService es = ac.getBean(EmployeeService.class);

		Employee emp = es.getEmployee_V2(11);
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());

		System.out.println("--- Done ");
	}
}
