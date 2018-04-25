package com;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pennant.emp.config.AppConfig;
import com.pennant.emp.model.Employee;
import com.pennant.emp.service.EmployeeService;

public class RowMapperListAll {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		//ac.refresh();
		EmployeeService es = ac.getBean(EmployeeService.class);

		
		List<Employee> emps=es.listAll();
		
		for(Employee emp:emps) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("---------------------------");
		}
		
		
		ac.close();
		

		System.out.println("--- Done ");
	}
}
