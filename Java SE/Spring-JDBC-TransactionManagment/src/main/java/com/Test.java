package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pennant.emp.config.AppConfig;
import com.pennant.emp.model.Employee;
import com.pennant.emp.service.EmployeeService;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		// ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService es = ac.getBean(EmployeeService.class);

		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setEmpName("New Name");
		emp.setSalary(111111);

		//es.saveEmployee(emp);
		//es.deleteEmployee(14);
		//es.updateEmployee(emp);

		es.transactionTest();
		
		
		
		
		
		System.out.println("--- Done ");
	}
}
