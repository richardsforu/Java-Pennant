package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Employee emp= (Employee) ac.getBean("e1");
		Employee emp = ac.getBean("e1", Employee.class);
		Employee emp1 = ac.getBean("e1", Employee.class);
		Employee emp2 = ac.getBean("e1", Employee.class);
		Employee emp3 = ac.getBean("e1", Employee.class);

		

		System.out.println("Emp Id: " + emp.getEmpId());
		System.out.println("Name: " + emp.getEmpName());
		System.out.println("Salary: " + emp.getSalary());
		System.out.println("Dept Id:"+emp.getDept().getDeptId());
		System.out.println("Dept Name: "+emp.getDept().getDeptName());
		
		
		System.out.println("---------------------------------------");

		
		
		

		ac.registerShutdownHook();

	}

}
