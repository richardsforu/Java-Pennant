package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Employee emp= (Employee) ac.getBean("e1");
		Employee emp = ac.getBean("e1", Employee.class);

		System.out.println("Emp Id: " + emp.getEmpId());
		System.out.println("Name: " + emp.getEmpName());
		System.out.println("Salary: " + emp.getSalary());
		System.out.println("---------------------------------------");

		Employee emp1 = ac.getBean("e1", Employee.class);

		System.out.println("Emp Id: " + emp1.getEmpId());
		System.out.println("Name: " + emp1.getEmpName());
		System.out.println("Salary: " + emp1.getSalary());

		Department dept = ac.getBean("dept", Department.class);
		System.out.println("Dept Id: " + dept.getDeptId());
		System.out.println("Name: " + dept.getDeptName());

		System.out.println("--- Done ---");

		ac.registerShutdownHook();

	}

}
