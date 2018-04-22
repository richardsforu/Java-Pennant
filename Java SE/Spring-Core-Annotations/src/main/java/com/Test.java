package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee emp = ac.getBean(Employee.class);
		System.out.println("Name: " + emp.getEmpName());
		System.out.println("Dept Name: "+emp.getDept().getDeptName());

		ac.registerShutdownHook();

	}

}
