package com;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pennant.emp.service.EmployeeService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService es = ac.getBean(EmployeeService.class);
		System.out.println(es.countRecords());
		Map<String, Object> emp = es.getEmployeeById(6);
		System.out.println(emp);
		System.out.println("---------------------------------------");
		List<Map<String,Object>> empData=es.getEmpData();
		
		for(Map<String, Object> rec:empData) {
			System.out.println(rec);
		}

		System.out.println("--- DOne ");
	}
}
